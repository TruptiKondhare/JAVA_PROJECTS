package com.demo.restdemo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.restdemo.data.Student;
import com.demo.restdemo.repository.IStudentRepository;


@RestController
public class StudentController {
	@Autowired
	IStudentRepository stdRepository;
	
	
	@GetMapping("/getAllStudents")
	public List<Student> getAllStudents(){
		List<Student>stdLst=stdRepository.findAll();
		return stdLst;
	}
	
	/*
	//insert the data
	@PostMapping ("/insertData")
	public String insertData (@RequestBody Student empObj) {
		System.out.println("Given Object is : "+empObj);
		stdRepository.save(empObj);
		String strReturn="Record inserted in db succesfully..";
		return strReturn;
				
	}

	@PutMapping ("/updateData")
	public String updateData (@RequestBody Student stdObj) {
		System.out.println("Given Object is : "+stdObj);
		stdRepository.save(stdObj);

		String strReturn="Record updated in db succesfully..";
		return strReturn;
				
	}
	
	
	@DeleteMapping ("/deleteData/{id}")
	public String deleteData (@PathVariable int id) {
		System.out.println("Given id to delete is : "+id);
		stdRepository.deleteById(id);
		String strReturn="Record deleted in db succesfully..";
		return strReturn;
				
	}
	*/

	

}

