package com.simple.java;

import java.util.Scanner;

public class PrimeNo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println(" Enter the no : ");
     int no=sc.nextInt();
     sc.close();
     
     int temp=0;
     for(int i=2;i<=no;i++)
     {
    	if(no%i==0){
    		temp=temp+1;
    	}
     }
     
     if(temp==0){
    	 System.out.println(no+"is prime no");
     }
     else{
 
    	 System.out.println(no+"is not prime no");
    	 
     }
     
	}

}
