package com.demo.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyController {
	@GetMapping("/login")
	public String login(String UID,String PWD) {
		if(UID.equals("Trupti")&& PWD.equals("Admin"))
			return "You are valid user";
		else
			return "You are an invalid user";
	}
	

}
