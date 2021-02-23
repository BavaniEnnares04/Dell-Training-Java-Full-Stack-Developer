package com.simplilearn.strings;

public class StringDemo {

	public static void main(String[] args) {
		
		// 1. String literal
		String str1 = "Hello";
		
		String str2 = "Hello";  // it does not create a new instance
		
		System.out.println("Str 1 :: "+str1);
		System.out.println("Str 2 :: "+str2);
		
		if(str1 == str2) {
			System.out.println("Same String "+ (str1==str2));
		} else {
			System.out.println("Different String "+ (str1==str2));
		}
		
		// 2. String with new Keyword
		
		String str3 = new String("John Smith");
		
		String str4 = new String("John Smith");
		
		if(str3 == str4) {
			System.out.println("Same String "+ (str3==str4));
		} else {
			System.out.println("Different String "+ (str3==str4));
		}

	}

}