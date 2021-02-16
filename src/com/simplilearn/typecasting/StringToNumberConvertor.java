package com.simplilearn.typecasting;

public class StringToNumberConvertor {

	public static void main(String[] args) {
		
		// String to Numeric Conversion - The string should be a convertible value.

		String price = "123";	//Convertible value
		//String amount = "123abc";	//Non-Convertible value
		String amount = "1231";	//Non-Convertible value
		
		//convert to float - float.parsefloat (wrapper class)
		float priceAmount = Float.parseFloat(price);
		
		//convert to double
		double doubleAmount = Double.parseDouble(amount);
		
		// Convert to integer
		int priceInt = Integer.parseInt(price);
		
		
		System.out.println("Floating Price :: "+priceAmount);
		System.out.println("Double Amount :: "+doubleAmount);
		System.out.println("Integer Price :: "+priceInt);
			
		//version2
	}

}
