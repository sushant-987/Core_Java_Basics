package com.sample.demos;

import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no :");

		int no = sc.nextInt();
		sc.close();
		int fact = 1;

		for (int i = 1; i <= no; i++) {
			fact = fact * i;

		}
		System.out.println("factorial of " + no + " is " + fact);

	}

}
