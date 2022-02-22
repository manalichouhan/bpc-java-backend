package com.bpc.bpcjavabackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/home")
	String testHome() {
		return "Welcome to BPC";
	}

}
