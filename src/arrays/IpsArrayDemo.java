package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class IpsArrayDemo {

	public static void main(String[] args) {
		// TODO :: WAP for to verify if user given ip exist in the ips list.
		// 
		
		String[] Ips = new String[] { "192.168.12.17","192.168.12.18",
				"192.168.12.19","192.168.12.20"};
		// verify IP
		Scanner input = new Scanner(System.in);
		System.out.println("Enter IP Address :: ");
		String ipAddress = input.nextLine();
		
		for (int i = 0; i < Ips.length; i++) {
			if(Ips[i].equals(ipAddress)) {
				System.out.println("IP Address Exist !");
			
			}	else {System.out.println("IP Address Not Exist !");}
			
			
			
		}
		
			
		}
	}
		
	

