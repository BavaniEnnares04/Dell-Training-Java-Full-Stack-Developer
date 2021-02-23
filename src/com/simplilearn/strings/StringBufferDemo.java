package com.simplilearn.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		
		// String Bffer will create a mutable String.
		StringBuffer str = new StringBuffer("Today is good day !");
		
		System.out.println(str);
		
		
		// edit -> append
		str.append(" Enjoy your Learning ");		
		System.out.println(str);
		
		str.replace(0, str.length(), "ABASBBA");
		System.out.println(str);
		
		str.delete(0, 1);
		System.out.println(str);

	}

}