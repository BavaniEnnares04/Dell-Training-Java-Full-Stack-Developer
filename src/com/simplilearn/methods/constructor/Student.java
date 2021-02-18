package com.simplilearn.methods.constructor;

public class Student {	
	// Id , name, marks
	// subject , class 
	
	long id;
	String name;
	float marks;
	String subject;
	String grade;
	
	// zero args / no params / default constructor
	Student(){
		
	}
	
	// Parameterized constructor
	
	Student(long id, String name, float marks, String grade){
		this.id= id;
		this.name = name;
		this.marks = 90;
		this.subject = "XYZ";
		this.grade = grade;
	}
	
	
}