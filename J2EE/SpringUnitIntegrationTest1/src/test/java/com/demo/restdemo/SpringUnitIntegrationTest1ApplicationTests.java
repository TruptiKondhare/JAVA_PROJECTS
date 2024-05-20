package com.demo.restdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.restdemo.controller.MyController;

@SpringBootTest
class SpringUnitIntegrationTest1ApplicationTests {
	@Autowired
	MyController myController;
	

	@Test
	void contextLoads() {
		String UID="Trupti",PWD="Admin";
		String strValidUser="You are valid user";
		String strInvalidUser="You are an invalid user";
		String strResult=myController.login(UID,PWD);
		assertEquals(strValidUser,strResult);
	}

}
