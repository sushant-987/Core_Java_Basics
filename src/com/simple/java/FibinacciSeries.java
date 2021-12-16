package com.simple.java;

import java.util.Scanner;

public class FibinacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
		int a=0, b=1;
       System.out.println(a+" "+b);
       
       int c;
       for(int i=1;i<=10;i++){
    	   
    	   c=a+b;
    	   System.out.println(" "+c);
    	   a=b;
    	   b=c;
       }
       
     
       
      
	}

}
