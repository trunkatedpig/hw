import java.io.*;
import java.util.*;

public class Driver2 {

    public static void main (String [] args) {

	if (args.length < 1) {

	    System.out.println ("Enter the ArrayLength followed by the highest amount of digits in the number. i.e: 10 5 ");
	    System.exit (0);

	}



	long t, start;


	int arrayLength = Integer.parseInt (args [0]); 
	int digitLength = Integer.parseInt (args [1]); //maxDigits is 9 for an integer




	Sorting s = new Sorting (arrayLength,digitLength); //First number says how many elements there will be in the array. The second is how many digits in the number.


	System.out.println (s);


	start = System.currentTimeMillis ();

	/*	s.Order (); */
	Arrays.sort (s.getArray () );

	t = System.currentTimeMillis () - start;

	System.out.println (s + " Max Time: " + t); //It takes the jump at 100,000 elements in the array


	System.out.println ("------------");

	/*
	Sorting s2 = new Sorting (10, 6);

	System.out.println (s2);


	s2.Order ();

	System.out.println (s2);*/

    }

}
	    
	
