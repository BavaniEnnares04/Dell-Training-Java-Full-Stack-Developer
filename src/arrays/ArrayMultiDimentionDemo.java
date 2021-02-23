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
		

	}

}