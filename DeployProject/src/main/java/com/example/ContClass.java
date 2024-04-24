package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContClass {
	
	@GetMapping("/greet")
	public String greet()
	{
		return "hii deployed throgh jenkins";
	}
	@GetMapping("/greet2")
	public String greet2()
	{
		return "hii deployed throgh jenkins war file";
	}

}
