package com.logicalprograms.java;

import java.util.Scanner;

//Java program for simple calculator

public class Calculator{
	
	public static void main(String[] args) {
		String yn;
		do{
			
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First no:");
		int no1=sc.nextInt();
		System.out.println("Enter Second no:");
		int no2=sc.nextInt();
	
		System.out.println("Select Symbol(+,-,*,/)");
		
		String sym=sc.next();
		
		int res;
		switch(sym){
		
		case "+":res=no1+no2;
		System.out.println("Addition is " +res);
		break;
		
		case "-":res=no1-no2;
		System.out.println("substraction is " +res);
		break;
		
		case "*":res=no1*no2;
		System.out.println("Addition is " +res);
		break;
		
		case "/":res=no1+no2;
		System.out.println("multiplication is " +res);
		break;
		
		default : System.out.println("Invalid Symbol");
	//	sc.close();
		}
		System.out.println("Do u want to continue(Press y for Yes and n for No");
		yn=sc.next();
		sc.close();
		}
		while(yn.equals("y")||yn.equals("Y"));
		
		}
		
		}
	