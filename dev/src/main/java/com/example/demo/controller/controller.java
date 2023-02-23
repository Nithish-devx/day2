package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@Value("${value:Nithish}")
	private String name;
	
	@GetMapping("dev")
	public String display() {
		return "Hey... "+name;
	}
}