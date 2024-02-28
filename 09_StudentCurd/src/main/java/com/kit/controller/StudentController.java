package com.kit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.kit.servies.StudentServies;

@Controller
public class StudentController {
	@Autowired
	StudentServies servies;

	@GetMapping("/student-curd")
	String getAllStudents(Model model) {
	    model.addAttribute("students", servies.getAllStudents());
	    return "view-students"; // Make sure this matches the name of your Thymeleaf template
	}

}
