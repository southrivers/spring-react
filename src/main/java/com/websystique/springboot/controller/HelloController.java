package com.websystique.springboot.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	String home(ModelMap modal) {
		modal.addAttribute("title", "Dear Learner");
		modal.addAttribute("message", "Welcome to SpringBoot");
		return "hello";
	}

	@GetMapping("/hello")
	public String hello() {
		return "{\"name\": \"wes\"}";
	}
}
