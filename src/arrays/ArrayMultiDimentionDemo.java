package arrays;

import java.util.Arrays;

public class ArrayMultiDimentionDemo {

	public static void main(String[] args) {
		
		int [][] numbers = { {10,20,30,40,50}, {1,2,3,4,5 } };
		
//		System.out.println(Arrays.toString(numbers));
		
		System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));
		
		System.out.println("Value :: => " + numbers[0][2]);
		System.out.println("Value :: => " + numbers[1][3]);
		
		// iteration -> nested for
		
		for (int row = 0; row < numbers.length; row++) {
			System.out.println("Row :: " + Arrays.toString(numbers[row]));
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.println("The position :: ["+row +","+col+"]"
			+  " value :: "+  numbers[row][col]);
			}
		}
		
		
		// TODO :: WAP for 3 dimensions array
		
		int [][][] numbers1 = {{ {10,20,30,40,50}, {1,2,3,4,5 } },{ {10,20,30,40,50}, {1,2,3,4,5 } }};
		System.out.println(Arrays.toString(numbers1));
		
		System.out.println(Arrays.toString(numbers1[0][1]));
		System.out.println(Arrays.toString(numbers1[0][0]));
		System.out.println(Arrays.toString(numbers1[1][0]));
		System.out.println(Arrays.toString(numbers1[1][1]));
		
		System.out.println("Value :: => " + numbers1[0][0][4]);
		System.out.println("Value :: => " + numbers1[1][1][0]);
		
		// iteration -> nested for
		
				for (int row = 0; row < numbers1.length; row++) {
					System.out.println("Row :: " + Arrays.toString(numbers1[row]));
					for (int col = 0; col < numbers1[row].length; col++) {
						for (int col1 = 0; col1 < numbers1[row].length; col1++) {
							System.out.println("The position :: ["+row +","+col+","+col1+"]"
					+  " value :: "+  numbers1[row][col][col1]);
					}}
	}
	}
}