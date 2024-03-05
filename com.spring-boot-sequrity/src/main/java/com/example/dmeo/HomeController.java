package com.example.dmeo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

	@GetMapping("/")
	public String publicUser() {
		return ("<h1> WelCome </h1>");
	}
}
