package com.websystique.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	String home(ModelMap modal) {
		modal.addAttribute("title", "Dear Learner");
		modal.addAttribute("message", "Welcome to SpringBoot");
		return "hello";
	}

	@GetMapping("/hello")
	public String hello() {
		return "hello world";
	}
}
