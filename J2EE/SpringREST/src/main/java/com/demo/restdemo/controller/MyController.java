package com.demo.restdemo.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.demo.restdemo.data.Employee;

@RestController
public class MyController {
	
	@GetMapping ("/welcome")
	public String welcomeMessage() {
		String str="New REST Spring  Project ";
		return str;
	}
	@GetMapping ("/welcome/v1")
	public String welcomeMessage1() {
		String str="New REST Spring  Project v1";
		return str;
	}
	@GetMapping ("/welcome/v2")
	public String welcomeMessage2() {
		String str="New REST Spring  Project v22";
		return str;
	}
	@GetMapping("/login")
	public String loginValidation(@RequestParam String UID,@RequestParam String pwd) {
		System.out.println("Given credentials are : Login "+UID+"Password"+pwd);
		if (UID.equals("Trupti")&& pwd.equals("Admin"))
			return "Valid USer";
		else
			return"You are in valid User,Cheak username and password and write Correctly";
		
	}
	
	@PostMapping("/insertData")
	public String insertData(@RequestBody Employee empObj) {
		System.out.println("Given Employee data form client is"+empObj);
		return "Given Employee data is inserted in db succesfulyy";

	}
	@PutMapping("/updatedata")
	public String updateData(@RequestBody Employee empObj) {
		System.out.println("Given object to update is : "+empObj);
		return "Given Employee data is update in the DB succesfully";
	}
	
	@DeleteMapping ("/deleteById/{id}")
	public String deleteByID(@PathVariable int id) {
		String strReturn ="Employee with id "+id + "is deleted successfully";
		return strReturn;
	}
	
	@PostMapping("/insert")
	public String insert(@RequestBody Employee empObj) {
		employeeList.add(empObj);
		System.out.println("Given Employee data form client is"+empObj);
		return "Given Employee data is inserted in db succesfulyy";

	}
	private List<Employee> employeeList=new ArrayList<>();
	@GetMapping("/findById/{id}")
	public Employee findById(@PathVariable int id) {
		for (Employee emp: employeeList) {
			if (emp.getId()==id) {
				System.out.print("Submitted");
				return emp;

			}
			
		}
		return null;
	}
	
}
	
		
		
		
		
