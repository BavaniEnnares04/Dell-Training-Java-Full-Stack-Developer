package com.simplilearn.methods;

import java.util.Scanner;

public class AvgExample {

	public static void main(String[] args) {
		// TODO :: WAP for 4 number avg  (method driven) 
		// Take user input for 4 different number then perform avg
		// num1+ num2+num3+num4 / 4;
		
		AverageCalculation();

	}
	
	public static void AverageCalculation() {
		
		Scanner input = new Scanner(System.in);
		System.out.println("---------------------");
		System.out.println("Average Calculator");
		System.out.println("---------------------");
		System.out.print("Enter number 1 :: ");
		int num1 = input.nextInt();
		System.out.print("Enter number 2 :: ");
		int num2 = input.nextInt();
		System.out.print("Enter number 3 :: ");
		int num3 = input.nextInt();
		System.out.print("Enter number 4 :: ");
		int num4 = input.nextInt();
		
		float Result = num1+num2+num3+num4/4;
		System.out.println("Average ::"+Result);
		
	}
	
}