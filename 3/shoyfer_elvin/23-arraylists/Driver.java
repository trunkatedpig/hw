import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) { 
    	ArrayList<Integer> a1, a2, a3, a4; 

    	// Part 1 

    	// a1 = new ArrayList<Integer>(); 

    	// long startTime, endTime, timeNeeded;
    	// startTime = System.currentTimeMillis();

    	// To conduct a test, comment its components out and modify the (i < n) boolean check in its for loop.

    	// Begin test for adding to the end: 

    	// for(int i = 0; i < 10000000; i++) {
    	// 	a1.add(1); 
    	// }

    	// endTime = System.currentTimeMillis();
    	// timeNeeded = endTime - startTime;

    	// System.out.println("Time needed: " + timeNeeded);

    	// End test for adding to the end

    	// Recording results: [end]
    	// n         Time (ms)
    	// 100        1
    	// 1000       1
    	// 10000      1
    	// 100000     7
    	// 1000000    16
    	// 10000000   180

    	// Begin test for adding to the beginning:

    	// for(int i = 0; i < 1000000; i++) {
    	// 	a1.add(0,1); 
    	// }

    	// endTime = System.currentTimeMillis();
    	// timeNeeded = endTime - startTime;

    	// System.out.println("Time needed: " + timeNeeded);

    	// End test for adding to the beginning

    	// Recording results: [start]
    	// n         Time (ms)
    	// 100        1
    	// 1000       1
    	// 10000      12
    	// 100000     909
    	// 1000000    94855
    	// 10000000   very high

    	// Comparison:
    	// While it appears that they both have a non-linear growth rate, 
    	// adding to the beginning becomes time-consuming quicker than adding to the end. 

    	// End Part 1

    	// Part 2 

    	// Objective: Repeat Part 1, but with remove 

    	// Initialize a2 will many elements

    	// a2 = new ArrayList<Integer>(); 

    	// for(int i = 0; i < 10000001; i++) {
    	// 	a2.add(1);
    	// }

    	// long startTime, endTime, timeNeeded;
    	// startTime = System.currentTimeMillis();

    	// Begin test for removing from end: 

    	// for(int i = 0; i < 10000000; i++) {
    	// 	a2.remove(a2.size() - 1); 
    	// }

    	// endTime = System.currentTimeMillis();
    	// timeNeeded = endTime - startTime;

    	// System.out.println("Time needed: " + timeNeeded);

    	// End test for removing from end

    	// Recording results: [end]
    	// n         Time (ms)
    	// 100       0
    	// 1000      0
    	// 10000     0
    	// 100000    1
    	// 1000000   4
    	// 10000000  37
    	// 100000000 error

    	// Begin test for removing from beginning:

    	// for(int i = 0; i < 100000; i++) {
    	// 	a2.remove(0); 
    	// }

    	// endTime = System.currentTimeMillis();
    	// timeNeeded = endTime - startTime;

    	// System.out.println("Time needed: " + timeNeeded);

    	// End test for removing from beginning

    	// Recording results: [start]
    	// n         Time (ms)
    	// 100       431
    	// 1000      4369
    	// 10000     41807
    	// 100000    very high [growth appears linear]
    	// 1000000   very high 
    	// 10000000  very high

    	// Comparison:
    	// Removing from the beginning becomes very time-consuming immediately, but grows in a linear fashion. 
    	// Removing from the end appears to grow linearly as well, but does not blow up as fast as removing from the beginning. 

    	// End Part 2 

    	// Part 3

    	// Reversal of a3 into a4

    	Random r = new Random();

    	a3 = new ArrayList<Integer>(); 
    	String arrayContents = "{";


    	// fill a3 with random ints
    	for(int i = 0; i < 20; i++) {
    		int thisElement = r.nextInt(10);
    		a3.add(thisElement);
    		arrayContents = arrayContents + thisElement + ", ";
    	}

    	arrayContents = arrayContents + "}";

    	System.out.println("Original array: " + arrayContents); 

    	a4 = new ArrayList<Integer>(); // will be reversed a3

    	for(int i = (a3.size() - 1); i >= 0; i--) { // iterate backwards through a3 
    		int thisElement = a3.get(i); 
    		a4.add(thisElement); 
    	}

    	System.out.println("New array: " + a4);
		

    }

}
