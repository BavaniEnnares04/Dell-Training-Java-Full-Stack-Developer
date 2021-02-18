package com.simplilearn.methods.constructor;

public class StudentTest {

	public static void main(String[] args) {
		// TODO :: WAP for instantiating object from Student with constructor overloading 

		// zero args / no params / default constructor
		
		Student student = new Student();
		student.id = 12345601;
		student.name = "Hermione Granger";
		student.marks = 80;
		student.subject = "XYZ";
		student.grade = "10th Grade";
		
		System.out.println("---------------------------------------");
		System.out.println("Student Id ::"+student.id);
		System.out.println("Student Name ::"+student.name);
		System.out.println("Student Marks ::"+student.marks);
		System.out.println("Student Subject ::"+student.subject);
		System.out.println("Student Grade ::"+student.grade);
		System.out.println("---------------------------------------");
		
		// Parameterized constructor
		
		Student student2 = new Student(12345602,"Harry Potter",90,"10th Grade");
		
		System.out.println("---------------------------------------");
		System.out.println("Student Id ::"+student2.id);
		System.out.println("Student Name ::"+student2.name);
		System.out.println("Student Marks ::"+student2.marks);
		System.out.println("Student Subject ::"+student2.subject);
		System.out.println("Student Grade ::"+student2.grade);
		System.out.println("---------------------------------------");
	}

}