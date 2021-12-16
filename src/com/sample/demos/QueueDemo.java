package com.sample.demos;

//Java program to add elements
//to a Queue

import java.util.*;

public class QueueDemo {

	public static void main(String args[])
	{
		Queue<String> pq = new PriorityQueue<>();

		pq.add("ABC");
		pq.add("For");
		pq.add("God");
		
		// Add an Iterator to hs.
				Iterator<String> it = pq.iterator();
				
				// Display element by element using Iterator
				while (it.hasNext())
					System.out.println(it.next());
				
    //   pq.remove("God");
       
    //   System.out.println("After removing God:"+ pq.poll());
       
       pq.remove("For");
       
       System.out.println("After Remove " + pq);
 
       System.out.println("Poll Method " + pq.poll());
 
       
       // System.out.println("pq.toString"+ pq);
	//	System.out.println(pq);
	}
}

/*

// Add an Iterator to hs.
		Iterator<String> it = hs.iterator();

		// Display element by element using Iterator
		while (it.hasNext())
			System.out.println(it.next());


*/