package com.example.dmeo.servies;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dmeo.entity.Users;
import com.example.dmeo.repository.UserRepository;

@Service
public class userServiesImp implements userServies {
	@Autowired
	UserRepository repo;

	@Override
	public String addUser(Users user) {
		repo.save(user);
		return "User added Succesfully";
	}

	@Override

	public boolean emailExists(String email) {

		if (repo.findByEmail(email) == null) {
			return false;
		} else {
			return true;
		}

	}

	@Override
	public boolean validUser(String email, String password) {
		Users user = repo.findByEmail(email);
		String Db_password = user.getPassword();
		if (password.equals(Db_password)) {
			return true;
		} else {
			return false;
		}
	}
}
