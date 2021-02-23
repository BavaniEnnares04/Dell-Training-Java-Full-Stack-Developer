package arrays;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		// arrays of interger type
		// array is homogeneous ordered data collection
		int numbers[] = { 10,20,30,40,50,60,70};
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers[3]);
		
		// iteration
		for (int index = 0; index < numbers.length; index++) {
			System.out.println("Element at index :: "+index +"  & value :: "+numbers[index]);
		}
		
		// iteration for changing value.
		// change element 40 with 41.
		for (int i = 0; i < numbers.length; i++) {			
			if(numbers[i]==40) {
				numbers[i] = 41;
				break;
			}
		}
		
		System.out.println(Arrays.toString(numbers));
		
		int[] numbers2 = { 20,30,40,50,60};
		
		// TODO :: WAP for String array with names value
	}

}