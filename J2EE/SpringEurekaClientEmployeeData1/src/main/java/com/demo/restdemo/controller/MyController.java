package com.demo.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {
	@GetMapping("/getDataWithID/{id}")
	public String getDataWithID (@PathVariable int id) {
		System.out.println("Recieved data  from client is:"+id);
		if (id==101)
			return "Trupti";
		else if (id==102)
			return "Vaishnavi";
		else if (id==103)
			return "Rohit";
		else if (id==104)
			return "Sakski";
		return "Invalid Employee..";
	}

}
