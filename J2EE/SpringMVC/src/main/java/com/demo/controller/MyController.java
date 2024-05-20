package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class MyController {
	@GetMapping("/")
	public String displayGreeting() {
		return"welcome";
	}
	@GetMapping("/login")
	public String displayLogin() {
		return "login";
	}
	@PostMapping ("/login")
	public String loginValidate(ModelMap model,@RequestParam String userID,
			@RequestParam String password) {
		System.out.println("Revecied data : User Id:" + userID + "passward:"+password);
		String str="You are an Invalid User,ples cheak your credentials...";
		
		if (userID.equals("Trupti") && password.equals("Admin"))
			str="Yor are valid user";
		model.put("message", str);
		return "results";
			
	}

}
