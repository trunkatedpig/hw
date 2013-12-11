// Part 1
// You want to compare inserting at the beginning of an ArrayList with adding to the end.

// Use System.CurrentTimeMillis() as we did when we foudn the mode fo an array to do this.

// Create an ArrayList and then fill it using first a.add(”x”) 
// then a.add(0,”x”) to add n elements to the ArrayList 
// (with n increasing until it gets crazy large or until you notice a difference between the two adds.

// Write down your results (they were the same no matter what, one started to get slower at some point, the difference was large or small, etc.).

// Part 2
// Do a similar comparison of remove. See if there is a timing difference when you remove from the front of a list or from the back.

// Create a large list (using the faster add from part 1) and then time removing all the elements down to empty using a remove from front then remove from back.

// Again, write down your results.

// Part 3
// Create an ArrayList, fill it with some values, then write the code to reverse teh ArrayList. 
// This is all about getting practice with ArrayList notation.

// Write your solution in Driver.java and put in comments your results from part 1 and part 2.

import java.io.*;
import java.util.*;

public class Driver{   

    public static void main (String[] args){
	// FunWALs fw = new FunWALs();
	Random R = new Random();
        int l = 10000000;
	long lasttime = 0;

	ArrayList<Integer> A = new ArrayList<Integer>(l);

	for (int i = 0; i < l; i++){
	    A.add(R.nextInt(100));
	}
	// System.out.println(A.toString());
	// long lasttime = System.currentTimeMillis();
	// System.out.println(System.currentTimeMillis());
	// A.add(10);
	// System.out.println(lasttime - System.currentTimeMillis());
	// lasttime = System.currentTimeMillis();
	// A.add(0, 10);
      	// //System.out.println(A.toString());
	// //System.out.println(System.currentTimeMillis());
	// System.out.println("Time differential: "+ (System.currentTimeMillis()-lasttime) +" milliseconds.");

	for (long length = 10; length <= 1000000000 ; length = length * 10){
	    //10,100,1000,10000,100000,1000000
	    
	    System.out.println("ArrayList length = " + length);
	    lasttime = System.currentTimeMillis();
	    System.out.println("Current time: " + lasttime);
	    A.add(10);
	    System.out.println("at " + length + ", Add to front time is: " + (System.currentTimeMillis() - lasttime) + ".");
	    lasttime = System.currentTimeMillis();
	    A.add(0, 10);
	    System.out.println("at " + length + ", Add to back time is:  " + (System.currentTimeMillis() - lasttime ) + ".");
	    System.out.println("");
	    System.out.println("---------------------------------------");
	    System.out.println("");
	    
	}
	
	/*
	 * TIME DIFFERENTIAL DATA:
    	 * 1st ArrayList of length 10: 2 milliseconds.
	 * 2nd ArrayList of length 10: 1 milliseconds.
	 * 1st ArrayList of length 100: 1 milliseconds.
	 * 2nd ArrayList of length 100: 0 milliseconds.
	 * 1st ArrayList of length 1000: 5 milliseconds.
	 * 2nd ArrayList of length 1000: 7 milliseconds.
	 * 1st ArrayList of length 10000: 17 milliseconds.
	 * 2nd ArrayList of length 10000: 16 milliseconds.
	 * 1st ArrayList of length 100000: 215 milliseconds.
	 * 1st ArrayList of length 100000: 198 milliseconds.
	 * 1st ArrayList of length 1000000: 13544 milliseconds.
	 * 2nd ArrayList of length 1000000: 13801 milliseconds.  
	 */
	    
	
	
    }
}