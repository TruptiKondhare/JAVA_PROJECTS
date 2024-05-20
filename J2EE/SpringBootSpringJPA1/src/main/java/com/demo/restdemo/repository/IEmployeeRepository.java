package com.demo.restdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.restdemo.data.Employee;

public interface IEmployeeRepository extends 
JpaRepository<Employee,Integer> {

}

