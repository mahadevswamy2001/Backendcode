package com.kit.quizeapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.kit.quizeapp.dao.QuestionDao;
import com.kit.quizeapp.dao.QuizDao;
import com.kit.quizeapp.entity.Question;
import com.kit.quizeapp.entity.QuestionWrapper;
import com.kit.quizeapp.entity.Quize;
import com.kit.quizeapp.entity.Response;

@Service
public class QuizeService {
	@Autowired
	QuizDao quizeDao;

	@Autowired
	QuestionDao questionDao;

	public ResponseEntity<String> createQuize(String category, int numQ, String title) {
		List<Question> questions = questionDao.findRandomQuestionByCategory(category, numQ);

		Quize quiz = new Quize();
		quiz.setTitel(title);
		quiz.setQuestion(questions);
		quizeDao.save(quiz);

		return new ResponseEntity<>("Success", HttpStatus.CREATED);
	}

	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
		Optional<Quize> quize = quizeDao.findById(id);
		// Question from data base
		List<Question> questionFromDb = quize.get().getQuestion();

		// Question for the user
		List<QuestionWrapper> questionForusere = new ArrayList<>();
		for (Question q : questionFromDb) {
			QuestionWrapper qw = new QuestionWrapper(q.getId(), q.getQuestionTitle(), q.getOption1(), q.getOption2(),
					q.getOption3(), q.getOption4());
			questionForusere.add(qw);
		}

		return new ResponseEntity<>(questionForusere, HttpStatus.OK);
	}

	public ResponseEntity<Integer> calculateResults(Integer id, List<Response> responses) {
		Quize quize = quizeDao.findById(id).get();
		List<Question> questions = quize.getQuestion();
		int right = 0;
		int i = 0;

		for (Response response : responses) {
			if (response.getResponse().equals(questions.get(i).getRightAnswer())) 
				right++;
			i++;
			}
		
		

		return new ResponseEntity<>(right, HttpStatus.OK);
	}
}
