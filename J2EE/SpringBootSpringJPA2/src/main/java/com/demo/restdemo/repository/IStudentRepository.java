package com.demo.restdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.restdemo.data.Student;

public interface IStudentRepository extends 
JpaRepository<Student,Integer> {

}