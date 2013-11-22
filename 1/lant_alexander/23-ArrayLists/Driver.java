// Part 1
// You want to compare inserting at the beginning of an ArrayList with adding to the end.

// Use System.CurrentTimeMillis() as we did when we foudn the mode fo an array to do this.

// Create an ArrayList and then fill it using first a.add(”x”) 
// then a.add(0,”x”) to add n elements to the ArrayList 
// (with n increasing until it gets crazy large or until you otice a difference between the two adds.

// Write down your results (they were the same no matter what, one started to get slower at some point, the difference was large or small, etc.).

// Part 2
// Do a similar comparison of remove. See if there is a timing difference when you remove from the front of a list or from the back.

// Create a large list (using the faster add from part 1) and then time removing all the elements down to empty using a remove from front then remove from back.

// Again, write down your results.

// Part 3
// Create an ArrayList, fill it with some values, then write the code to reverse teh ArrayList. This is all about getting practice with ArrayList notation.

// Write your solution in Driver.java and put in comments your results from part 1 and part 2.

import java.io.*;
import java.util.*;

public class Driver{   

    public static void main (String[] args){
	// FunWALs fw = new FunWALs();
	
       	ArrayList<Integer> A = new ArrayList<Integer>();
	long lasttime = System.currentTimeMillis();
	A.add(10);
	A.add(0, 10);
	System.out.println(A.toString());
	System.out.println(System.currentTimeMillis()-lasttime);
	
	
    }
}