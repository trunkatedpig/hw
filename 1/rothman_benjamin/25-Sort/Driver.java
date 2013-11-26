import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String [] args) {

	Random random = new Random ();
	int numItems = 0;

	int  [] numbers = new int [10];
	for (int i = 0; i < 10; i ++) {

	    numbers [i] = random.nextInt (10) + random.nextInt (10) * 10 + random.nextInt (10) * 100 + random.nextInt (10) * 1000;

	    numItems = numItems + 1;

	}


	System.out.println (Arrays.toString (numbers) );

	ArrayList [] buckets = new ArrayList [10];

	for (int i = 0; i < numbers.length; i ++) {
	    buckets [i] = new ArrayList ();
	}

	int digits = String.valueOf (numbers [0] ).length ();


	for (int n =0; n < digits; n ++) {
	    for (int i = 0; i < numbers.length; i ++) {


	    int teller = 0;
	    
	    teller =( numbers [i] / (math.pow (10, n) ) ) % 10;

	    buckets [teller].add (numbers [i] );

	    numItems = numItems - 1;

	    }

	    for (int i = 0; i < numbers.length; i ++ ) {

		int cholata = 0;
		cholata = buckets [i].size ();

		while (cholata > 0) {

		    numbers [numItems-1] = buckets [i].get (0);
		    buckets [i].remove (0);

		}


	    }

	 

	}




	System.out.println (Arrays.toString (numbers));

    }

}
	    
	