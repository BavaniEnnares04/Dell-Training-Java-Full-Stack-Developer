package com.simplilearn.typecasting;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO :: WAP for converting int byte and short ->  Float, Double Long.
		
		int intCount = 203;
		float floatCount = intCount;
		double doubleCount = intCount;
		long longCount = intCount;
		
		System.out.println("--------------------------------------------");
		System.out.println("***Integer to Float, Double, Long Conversion");
		System.out.println("--------------------------------------------");
		System.out.println("IntegerCount :: "+intCount);
		System.out.println("FloatCount :: "+floatCount);
		System.out.println("DoubleCount :: "+doubleCount);
		System.out.println("LongCount :: "+longCount);
		
		
		Scanner input = new Scanner(System.in);
		System.out.println(":: Enter a byte value :: ");
		byte byteCount = input.nextByte();
		float floatCountByteConversion = byteCount;
		double doubleCountByteConversion = byteCount;
		long longCountByteConversion = byteCount;
		
		System.out.println("--------------------------------------------");
		System.out.println("***Byte to Float, Double, Long Conversion");
		System.out.println("--------------------------------------------");
		System.out.println("ByteCount :: "+byteCount);
		System.out.println("FloatCount :: "+floatCountByteConversion);
		System.out.println("DoubleCount :: "+doubleCountByteConversion);
		System.out.println("LongCount :: "+longCountByteConversion);
		
		int shortCount = 203;
		float floatCountShortConversion = shortCount;
		double doubleCountShortConversion = shortCount;
		long longCountShortConversion = shortCount;
		
		System.out.println("--------------------------------------------");
		System.out.println("***Short to Float, Double, Long Conversion");
		System.out.println("--------------------------------------------");
		System.out.println("ShortCount :: "+shortCount);
		System.out.println("FloatCount :: "+floatCountShortConversion);
		System.out.println("DoubleCount :: "+doubleCountShortConversion);
		System.out.println("LongCount :: "+longCountShortConversion);
	}

}
