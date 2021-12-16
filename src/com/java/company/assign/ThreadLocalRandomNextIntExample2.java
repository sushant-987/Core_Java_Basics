package com.java.company.assign;

import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomNextIntExample2 {  
    public static void main(String[] args) {  
          
        // Returns a pseudorandom, uniformly distributed integer value between 0 and 4000         
        System.out.println("Random int value is: " +ThreadLocalRandom.current().nextInt(10));
        
    }  
}  