package com.simplilearn.strings;

public class StringBuilderDemo {

	public static void main(String[] args) {

		// StringBuilder is also use for creating mutable string

		StringBuilder sb = new StringBuilder("Today is best day !");

		System.out.println(sb);

		// edit string -> append
		sb.append(" Happy Eating !");
		System.out.println(sb);

		// insert ->
		System.out.println(sb.insert(0, "Welcome "));

		// insert ->
		System.out.println(sb.reverse());
		
		// Converting existing string to String buffer and StringBuilder
		
		String str = "Hello";
		StringBuffer sbr = new StringBuffer(str);
		System.out.println(sbr.reverse());
		
		String str1 = "World";
		StringBuffer sbl = new StringBuffer(str1);
		System.out.println(sbl.reverse());
		
		

	}

}