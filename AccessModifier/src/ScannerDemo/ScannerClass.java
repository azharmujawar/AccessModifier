package ScannerDemo;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		
		Scanner keyboard=new Scanner(System.in);
		
	
		
		System.out.println("Enter First Name");
		String firstInitial=keyboard.nextLine();
		
		
		System.out.println("Enter Last Name :");
		String lastName=keyboard.nextLine();
		
		
		System.out.println("Enter House Number");
		int houseNumber=keyboard.nextInt();
		
		System.out.println("Enter streetName");
		String streetName=keyboard.nextLine();
		
		System.out.println("Enter Street Type");
		String streetType=keyboard.nextLine();
		
		System.out.println("Enter City");
		String city=keyboard.nextLine();
		
		System.out.println(firstInitial+""+lastName+""+houseNumber);
		
		System.out.println(streetName+""+streetType+""+city);
		
	
		
		
		
		
	}

}
