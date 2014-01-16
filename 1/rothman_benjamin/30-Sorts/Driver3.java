import java.io.*;
import java.util.*;

public class Driver3 {

    public static void main (String [] args) {

	if (args.length < 1) {

	    System.out.println ("Enter the ArrayLength followed by the highest amount of digits in the number. i.e: 10 5 ");
	    System.exit (0);

	}



	long t, start;


	int arrayLength = Integer.parseInt (args [0]); 
	int digitLength = Integer.parseInt (args [1]); //maxDigits is 9 for an integer




	Sorting s = new Sorting (arrayLength,digitLength); //First number says how many elements there will be in the array. The second is how many digits in the number.


	//System.out.println (s);


	start = System.currentTimeMillis ();

	/*	s.Order (); */
	s.SelectionSort (); //slows at 100,000

	t = System.currentTimeMillis () - start;

		System.out.println ("SELECTION SORT!!!");

		System.out.println (/*s + */" Max Time: " + t); //It takes the jump at 100,000 elements in the array

	System.out.println ("Number of Comparisons: " + s.getCompareNumber () );

	System.out.println ("Number of Swaps: " + s.getSwapNumber() );

	System.out.println ("------------");

        
	Sorting s2 = new Sorting (arrayLength,digitLength); //First number says how many elements there will be in the array. The second is how many digits in the number.


	//System.out.println (s2);


	start = System.currentTimeMillis ();

	/*	s.Order (); */
	s2.bubbleSort (); //slows at 100,000

	t = System.currentTimeMillis () - start;

		System.out.println ("BUBBLE SORT!!!");

		System.out.println (/*s2 +*/  " Max Time: " + t); //It takes the jump at 100,000 elements in the array

	System.out.println ("Number of Comparisons: " + s2.getCompareNumber () );

	System.out.println ("Number of Swaps: " + s2.getSwapNumber() );

	System.out.println ("------------");




Sorting s3 = new Sorting (arrayLength,digitLength); //First number says how many elements there will be in the array. The second is how many digits in the number.


//System.out.println (s3);


	start = System.currentTimeMillis ();

	/*	s.Order (); */
	s3.InsertionSort (); //slows at 100,000

	t = System.currentTimeMillis () - start;

	System.out.println ("INSERTION SORT!!!");

	System.out.println (/*s3 +*/ " Max Time: " + t); //It takes the jump at 100,000 elements in the array

	System.out.println ("Number of Comparisons: " + s3.getCompareNumber () );

	System.out.println ("Number of Swaps: " + s3.getSwapNumber() );

	System.out.println ("------------");





Sorting s4 = new Sorting (arrayLength,digitLength); //First number says how many elements there will be in the array. The second is how many digits in the number.


//System.out.println (s4);


	start = System.currentTimeMillis ();

	/*	s.Order (); */
	s4.Order (); //slows at 100,000

	t = System.currentTimeMillis () - start;

	System.out.println ("RADIX SORT!!!");

	System.out.println (/*s4 +*/ " Max Time: " + t); //It takes the jump at 100,000 elements in the array

	System.out.println ("Number of Comparisons: " + s4.getCompareNumber () );

	System.out.println ("Number of Swaps: " + s4.getSwapNumber() );

	System.out.println ("------------");



    }

}
	    
	
