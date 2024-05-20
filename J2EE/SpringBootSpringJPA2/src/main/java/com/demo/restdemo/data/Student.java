package com.demo.restdemo.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity

@Table (name="Student") 
public class Student {
	
	@Id
	int sid;
	String name;
	String stream;
	String percentage;
	Student(){}
	public Student(int sid, String name, String stream, String percentage) {
		super();
		this.sid = sid;
		this.name = name;
		this.stream = stream;
		this.percentage = percentage;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", stream=" + stream + ", percentage=" + percentage + "]";
	}
	


}



	
	
