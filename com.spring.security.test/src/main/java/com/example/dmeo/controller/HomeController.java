package com.example.dmeo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	@GetMapping("/normal")
	public ResponseEntity<String> normalUser() {
		return ResponseEntity.ok("Yes, I am a normal user");
	}

	@GetMapping("/admin")
	public ResponseEntity<String> adminUser() {
		return ResponseEntity.ok("Yes, I am an admin user");
	}

	@GetMapping("/public")
	public String publicUser() {
		return ("<h1> Yes, I am a public user contr </h1>");
	}
}
