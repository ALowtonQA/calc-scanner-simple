package com.qa.scanner;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		
		int response = scanner.nextInt();
		
		// Read the newline character that was left behind by nextInt() above.
		scanner.nextLine();
		
		System.out.println("Number from user: " + response);
		
		System.out.println("Please enter some text: ");
		
		String secondResponse = scanner.nextLine();
		
		System.out.println("Text from user: " + secondResponse);
		
	}
	
}
