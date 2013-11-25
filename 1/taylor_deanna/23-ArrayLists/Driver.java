           /* I've included all the code that I ran in this file, I didn't delete any 
	      of it in case we will need to use it later. Thus the code is rather long.
	      It includes the code for each test, the times for each test, which test
	      is faster, and the new code at the bottom */

import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	/*if (args.length != 1) {
	    System.out.println("Enter the size of the array");
	    System.exit(0);
	}
	long start,t;

	int arraySize = Integer.parseInt(args[0]); */
	ArrayList<Integer> A = new ArrayList<Integer>(); 

	/* PART 1:
	Add to end:

	start = System.currentTimeMillis();
	for (int i=0; i<arraySize; i++){
	    A.add(i);
	}
	t = System.currentTimeMillis()-start;
	System.out.println("Array size: " + arraySize + " Add time: " + t); 

	Add to end time: (ArraySize - time)
	     100 - 0
	     1000 - 0
	     10000 - 7
	     100000 - 15
	     1000000 - 210
	     10000000 - wouldn't run (?)
       

	Add to beginning:
	
	start = System.currentTimeMillis();
	for (int i=0; i<arraySize; i++){
	    A.add(0, i);
	}
	t = System.currentTimeMillis()-start;
	System.out.println("Array size: " + arraySize + " Add time: " + t);
       

        Add to end times:
	     100 - 0
	     1000 - 1
	     10000 - 39
	     100000 - 3113
	     1000000 - didn't have the patience to wait
	

	Adding to the end is MUCH faster */

	/* PART 2:
	   Remove from front: 
	
	for (int i=0; i<arraySize; i++){
	    A.add(i);
	}
	start = System.currentTimeMillis();
	for (int j=0; j<A.size(); j++){
	    A.remove(j);
	}
	t = System.currentTimeMillis()-start;
	System.out.println("Array size: " + arraySize + " Remove time: " + t); 

	Remove from front times:
	     100 - 0
	     1000 - 1
	     10000 - 19
	     100000 - 1702
	     1000000 - didn't have the patience to wait
	

	     Remove from back:
	
	for (int i=0; i<arraySize; i++){
	    A.add(i);
	}
	start = System.currentTimeMillis();
	for (int j=A.size()-1; j>=0; j--){
	    A.remove(j);
	}
	t = System.currentTimeMillis()-start;
	System.out.println("Array size: " + arraySize + " Remove time: " + t); 

        Remove from back times:
	     100 - 0
	     1000 - 0
	     10000 - 4
	     100000 - 9
	     1000000 - 11
	     10000000 - wouldn't run (?)
	     
	 Removing from the back is much faster */
	
	for (int i=0; i<10; i++){
	    A.add(i);
	}
	ArrayList<Integer> B = new ArrayList<Integer>(10);
	for (int i=0; i<10; i++){
	    B.add(9 - i);
	}
	System.out.println(A);
	System.out.println(B);	    
   }
}
