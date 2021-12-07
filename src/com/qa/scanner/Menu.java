package com.qa.scanner;

import java.util.Scanner;

public class Menu {

	public void userCalc() {
		
		Calculator calc = new Calculator();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter two integers:");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
	
		System.out.println("What calculation would you like to do? add, mul, sub and div are the only options.");
		String selection = scanner.next().toLowerCase();
		
		switch (selection) {
			case "add":
				System.out.println("Result = " + calc.add(num1, num2));
				break;
			case "mul":
				System.out.println("Result = " + calc.mul(num1, num2));
				break;
			case "sub":
				System.out.println("Result = " + calc.sub(num1, num2));
				break;
			case "div":
				System.out.println("Result = " + calc.div(num1, num2));
				break;
			default:
				System.out.println("Error! Please enter add, mul, sub or div.");
		}
		
		scanner.close();
	}
	
}
