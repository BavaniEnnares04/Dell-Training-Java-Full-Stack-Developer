package com.simplilearn.typecasting;

public class TypeCastingDemo2 {

	public static void main(String[] args) {
		
		/**
		 * Narrowing :- Convert data from higher range to lower range value.
		 * double -> float -> long -> int -> short -> byte
		 */
		
		double decimalCount = 110.16d;
		float floatCount = (float) decimalCount;
		long longCount = (long) floatCount;
		int intCount = (int) longCount;
		short shortCount = (short) intCount;
		byte byteCount = (byte) shortCount;
		
		System.out.println("Decimal Value :: " +decimalCount);
		System.out.println("Float Value :: " +floatCount);
		System.out.println("Long Value :: " +longCount);
		System.out.println("Integer Value :: " +intCount);
		System.out.println("Short Value :: " +shortCount);
		System.out.println("Byte Value :: " +byteCount);
		

	}

}
