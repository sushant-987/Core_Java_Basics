package com.logicalprograms.java;

public class SwitchCase {
	
	public static void main(String[] args) {
		// Declaring a variable for switch expression
		int number = 20;
		// Switch expression
		switch (number) {
		// Case statements
		case 10:
			System.out.println("ABC");
			break;
		case 20:
			System.out.println("PQR");
			break;
		case 30:
			System.out.println("XYZ");
			break;
		// Default case statement
		default:
			System.out.println("Not in 10, 20 or 30");
		}
	}
}