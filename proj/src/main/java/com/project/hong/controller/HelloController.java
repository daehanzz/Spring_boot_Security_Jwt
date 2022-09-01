package com.project.hong.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RequestMapping("/api")
public class HelloController {
	
	@GetMapping("/hello")
	public String hello(){
		
		System.out.println("hello");
		return "<h1>hello</h1>";
	}

}
