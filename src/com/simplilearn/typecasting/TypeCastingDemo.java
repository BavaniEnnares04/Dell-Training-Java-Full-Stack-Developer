package com.simplilearn.typecasting;

public class TypeCastingDemo {
	
	// Type Casting :- process of converting data from one data type to another type.
	
	/**
	 * Widening Type Casting :- converts data from lower range to higher range value
	 * byte -> short -> int -> long -> float -> double
	 * 
	 */
	
	public static void main(String[] args) {
		
		byte byteCount = 100;	// -128 to 127 ; 1 byte = 8 bit
		int intCount = byteCount;	// widening -> -32768 to 32767
		long bigCount = intCount;	// int -> Long
		float floatCount = bigCount;	// long -> float
		double decimalCount = bigCount;	// long -> double
		System.out.println("Byte Count "+byteCount);
		System.out.println("Integer Count "+intCount);
		System.out.println("Long Count "+bigCount);
		System.out.println("Float Count "+floatCount);
		System.out.println("Decimal Count "+decimalCount);
		
	}
	

}
