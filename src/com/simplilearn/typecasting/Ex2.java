package com.simplilearn.typecasting;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO :: WAP for converting a string value taken from user input to all
		// numeric type
		// int , float , double , byte short etc..
		// byte -> short -> int -> long -> float -> double

		Scanner input = new Scanner(System.in);

		System.out.println("-----------------------------------------");
		System.out.println(":: String to Numeric Convertor ::");
		System.out.println("-----------------------------------------");

		System.out.println(":: Enter a number string value :: ");
		String number = input.nextLine();

		float floatCount = Float.parseFloat(number);
		byte byteCount = Byte.parseByte(number);
		short shortCount = Short.parseShort(number);
		int intCount = Integer.parseInt(number);
		long longCount = Long.parseLong(number);
		double doubleCount = Double.parseDouble(number);
		
		System.out.println("FloatCount :: "+floatCount);
		System.out.println("ByteCount :: "+byteCount);
		System.out.println("ShortCount :: "+shortCount);
		System.out.println("IntCount :: "+intCount);
		System.out.println("LongCount :: "+longCount);
		System.out.println("DoubleCount :: "+doubleCount);

	}

}
