package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EmailArrayDemo {

	public static void main(String[] args) {
		// TODO :: WAP for change of email from the existing list.
		// 
		
		// create email list
				String[] emails = new String[] {"harry@gmail.com", "potter@gmail.com","sheldon12@gmail.com"};
				
				// change email
				Scanner input = new Scanner(System.in);
				System.out.println("Enter Current Email Id :: ");
				String currentEmail = input.nextLine();
				System.out.println("Enter New Email Id : ");
				String newEmail = input.nextLine();
				
				int count =0;
				
				for (int i = 0; i < emails.length; i++) {
					if(emails[i].equals(currentEmail)) {
						emails[i] = newEmail;
						count++;
					}		
				}
				
				if(count==0) {
					System.out.println("Email Id Does No Exist !");
				} else {
					System.out.println("Email Id is changed Sucessfully !");
					System.out.println(Arrays.toString(emails));
				}

	}

}