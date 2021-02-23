package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class UsersArrayDemo {

	public static void main(String[] args) {
		
		// create user list
		String[] users = new String[] {"John", "Mike","Bob","David","Sam" };
		
		// change username
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Current User Name : ");
		String currentName = input.nextLine();
		System.out.println("Enter New User Name : ");
		String newName = input.nextLine();
		
		int count =0;
		
		for (int i = 0; i < users.length; i++) {
			if(users[i].equals(currentName)) {
				users[i] = newName;
				count++;
			}		
		}
		
		if(count==0) {
			System.out.println("User Does No Exist !");
		} else {
			System.out.println("User Name is changed Sucessfully !");
			System.out.println(Arrays.toString(users));
		}
		

	}

}