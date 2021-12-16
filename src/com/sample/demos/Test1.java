package com.sample.demos;

import java.util.Vector;
import java.util.Enumeration;

public class Test1 {
	public static void main(String args[]) {
		Vector<String> dayNames = new Vector<String>();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");

		// Creating enumeration
		Enumeration<String> days = dayNames.elements();

		// Retrieving elements of enumeration
		while (days.hasMoreElements())
			System.out.println(days.nextElement());
	}
}
