package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContClass {
	
	@RequestMapping("/greet")
	public String greet()
	{
		return "hii deployed throgh jenkins";
	}
	@RequestMapping("/greet2")
	public String greet2()
	{
		return "hii deployed throgh jenkins war file";
	}

}
