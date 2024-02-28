package com.example.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controler.entity.Student;

@RestController
@RequestMapping("/curd")
public class Curd {

	@GetMapping(value = "{std}")
	public Student getStudent(String studentId) {
		Student s1 = new Student("1BI19CS76", "Dev", "Bng");
		return s1;
	}
}

//Curd is Use to reach the Controller @ particular class
