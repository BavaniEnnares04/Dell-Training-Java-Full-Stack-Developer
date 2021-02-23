package com.simplilearn.strings;

public class StringExample {

	public static void main(String[] args) {
		
		String bankName = "Apana Bank";
		
		System.out.println(bankName);
		System.out.println(bankName.length());
		
		// substring
		System.out.println(bankName.substring(2));
		
		System.out.println(bankName.substring(2,5));
		
//		String Comparison 
		// 1. equals()  2. == operator 3. compareTo()
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		String str3 = new String("John Smith");
		String str4 = new String("John Smith");
		
		// 1 .equals()  -> it compares content of strings
		boolean result = str1.equals(str2); // true;
		System.out.println("Result1 :: "+result);
		
		boolean result2 = str3.equals(str4); // true;
		System.out.println("Result2 :: "+result2);
		
		
		// 2. == operator  -> it is used to compare two object reference
		// to check whether they are refer to same instance.
		
		boolean result3 = str1 == str2;  // true
		System.out.println("Result3 :: "+result3);
		
		boolean result4 = str3 == str4;  // false
		System.out.println("Result3 :: "+result4);

	}

}