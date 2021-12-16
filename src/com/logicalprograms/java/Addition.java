package com.logicalprograms.java;

public class Addition {
	int a = 10, b = 20, c;

	public void addition() {
		c = a + b;
		System.out.println("Output is " + c);
	}

	public void subStraction() {
		c = a - b;
		System.out.println("Substraction is " + c);
	}
	public void multiplication() {
		c = a * b;
		System.out.println("Output is " + c);
	}
	public void divison() {
		c = a / b;
		System.out.println("Output is " + c);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition ad = new Addition();
		ad.addition();
		ad.subStraction();
		ad.multiplication();
		ad.divison();

	}

}
