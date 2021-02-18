package com.simplilearn.accessmodifiers;

public class BankLocker {

	public static void main(String[] args) {
		// TODO :: WAP for all access modifier
		// private -> accountNo , accountPin	
		// public -> bankName, bankAssets
		// protected -> bankVision
		// default ->  customerCount ,customerNos.
		// add methods to access properties.
		
		System.out.println("Access Modifiers");
		AccessModifiers.ShowPublicValue();
	 // AccessModifiers.ShowPrivateValue(); //not visible	
		AccessModifiers.ShowProtectedValue();
		AccessModifiers.ShowdeDefaultValue();
			
		}

	}

class AccessModifiers {
	
	public static void ShowPublicValue() {
		
		String bankName = "ABC Bank";
		String bankAssets = "xxxxxxxxxxx yyyyyyyyyyyy zzzzzzzzzzzzzz" ; 
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("Print Public Access Modifiers");
		System.out.println("Bank Name :: "+bankName);
		System.out.println("Bank Assets :: "+bankAssets);
		System.out.println("------------------------------------------------------------------");
		
		AccessModifiers.ShowPrivateValue();
		
	}
	
	 private static void ShowPrivateValue() {
		
		int accountName = 23456899;
		int accountPin = 1234 ; 
		
		System.out.println("Print Private Access Modifiers");
		System.out.println("Bank Name :: "+accountName);
		System.out.println("Bank Assets :: "+accountPin);
		System.out.println("------------------------------------------------------------------");
		
	}
	 
	 protected static void ShowProtectedValue() {
			
			String bankVision = "xxxxxxxxxx yyyyyyyyyyyyyyyyyyyyyyyyyy zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz aaaaaaaaaaaaaa bbbbbbbbbbbbbbbbbbbb cccccccccccccccc";
			
			System.out.println("Print Protected Access Modifiers");
			System.out.println("Bank Vision :: "+bankVision);
			System.out.println("------------------------------------------------------------------");
			
		}
	
	 static void ShowdeDefaultValue() {
			
			int customerCount = 10000;
			int customerNumber = 123456789 ; 
			
			System.out.println("Print Default Access Modifiers");
			System.out.println("Customer Count :: "+customerCount);
			System.out.println("Customer Number :: "+customerNumber);
			System.out.println("------------------------------------------------------------------");
			
		}
}