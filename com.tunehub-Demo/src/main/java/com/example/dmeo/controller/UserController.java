package com.example.dmeo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dmeo.entity.Users;
import com.example.dmeo.servies.userServies;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

	@Autowired
	userServies service;

	@PostMapping("/register")
	public String addUser(@ModelAttribute Users user) {
		boolean userExist = service.emailExists(user.getEmail());
		if (userExist == false) {
			service.addUser(user);

		} else {
			System.out.println("Mail id alresy exist");

		}
		return "home";
	}

	@PostMapping("validUser")
	public String validUser(@RequestParam("email") String email, @RequestParam("password") String password) {
		if (service.validUser(email, password)) {
			return "home";
		}
		return "login";
	}
}
