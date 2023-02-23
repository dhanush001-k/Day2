package com.example.Day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Day2Controller {
	
	@Value("${value1}")
	private String name;
	@GetMapping("/a")
	public String display() 
	{
		return "Welcome to this "+name;
	}

}
