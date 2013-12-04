import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String [] args) {

	//Part 1
	Arrays a = new Arrays ();

	int [] b = {4,2,7};
	int [] c = {5, 55, 555};

	for (int i = 0; i < a.middleWay(b,c).length; i++) {

	    System.out.print (a.middleWay (b, c) [i] + ", " );

	}

	System.out.println ("");




	    //Part 2

	    Arrays ar = new Arrays ();

	    int [] d = {2, 6, 8, 8};
	    int [] e = {1};

	    System.out.print ("{");

	    for (int i = 0; i < ar.makeEnds (d).length; i++) {
		System.out.print (ar.makeEnds (d) [i] + ", " );

	    }

	    System.out.println ("}");

	    System.out.print ("{");

	    for (int i = 0; i < ar.makeEnds (e).length; i++) {

		System.out.print (ar.makeEnds (e) [i] + ", " );

	    
	    }

	    System.out.println ("}");
	    


	    //Part 3

	    Arrays ar2 = new Arrays ();

	    int g = 5;
	    int h = 0;

	    for (int i = 0; i < ar2.fizzArray(g).length; i++ ) {

		System.out.print (ar2.fizzArray(g) [i] + ", " );

	    }

	    System.out.println ("");


	   for (int i = 0; i < ar2.fizzArray(h).length; i++ ) {

		System.out.print (ar2.fizzArray(h) [i] + ", " );

	    }

	   System.out.println ("");


	   //Part 4

	   Arrays ar3 = new Arrays ();

	   int [] j = {1,4,1,4};
	   int [] k = {1,4,2,4};
	   int [] l = {1, 1};

	   System.out.println (ar3.only14 (j));
	   System.out.println (ar3.only14 (k) );
	   System.out.println (ar3.only14 (l) );


	


    }

}
