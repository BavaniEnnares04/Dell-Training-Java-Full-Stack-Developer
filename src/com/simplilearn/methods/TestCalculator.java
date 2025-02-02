package com.simplilearn.methods;

public class TestCalculator {

	public static void main(String[] args) {
		// use this as caller method
		TestCalculator.showMessage();
		// call function with argument
		displayAuthor("John Smith");
		
		// call add function
		add(100,200);
		
		// call sub 
		sub(200,100,"Substraction");
		
		// call multiplication
		multiplication(100,100,100);
		
		// call div
		division(20,15,"Division");
	}

	// access modifier return-type identifier () { --- body --- }

	// zero parameterized function
	public static void showMessage() {
		System.out.println("::: Welcome to Test calculator ::: ");
	}
	
	// one parameterized function
	public static void displayAuthor(String name) {
		System.out.println("::: @Author:- "+ name+" @Email:- waheed@---.com ::: ");
	}

	// two parameterized function
	public static void add(int num1, int num2) {
		float result = num1+num2;
		System.out.println("Addition  :: "+result);
	}
	
	// three parameterized function
	public static void sub(int num1, int num2, String action) {
		float result = num1-num2;
		System.out.println(action + " :: "+result);
	}
	
	// TODO :: WA method for mul and division with 3 input params
	
	public static void multiplication(int num1, int num2, int num3) {
		float result = num1*num2*num3;
		System.out.println("Multiplication  :: "+result);
		
		
	}
	
	public static void division(int num1, int num2, String action) {
		float result = num1/num2;
		System.out.println(action + " :: "+result);
	}
		
}
