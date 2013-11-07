import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String [] args) {

	Arrays ar = new Arrays ();

	for (int i = 0; i < ar.revFill (4).length; i++)

	    {
		System.out.println (ar.revFill(4) [i]);
	    }

	Arrays ar2 = new Arrays ();

	for (int i = 0; i <ar2.MakeRandom (5, 1, 6).length; i ++) {

	    System.out.print (ar2.MakeRandom (5,1,6) [i] + " ,");

	}

	System.out.println ("");

	for (int i = 0; i <ar2.MakeRandom (3, 0, 10).length; i++) {

	    System.out.print (ar2.MakeRandom (3,0,10) [i] + " ,");

	}

	System.out.println ("\n" + "Next problem");


	Arrays ar3 = new Arrays ();

	int [] test = {0, 1, 3, 2};
	int [] test2 = {13, 5, 5, 13, 2, 2};


	System.out.println (ar3.sum13 (test) );
	System.out.println (ar3.sum13 (test2) );



	System.out.println ("PROBLEM 4");

	int [] test3 = {2, 1, 3, 5};
	int [] test4 = {2,1,2,5};
	int [] test5 = {2,4,2,5};

	System.out.println (ar3.modThree (test3) );
	System.out.println (ar3.modThree (test4) );
	System.out.println (ar3.modThree (test5) );

	

    }

}


//make Random

//Sum13

//modThee 
