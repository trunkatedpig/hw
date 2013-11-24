import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	if (args.length != 1) {
	    System.out.println("Enter the size of the ArrayList");
	    System.exit(0);
	}

	long start,t;

	ArrayList <Integer> A = new ArrayList <Integer> ();

	int ArrayListSize = Integer.parseInt (args[0]);

	start = System.currentTimeMillis();

	for (int i = 0; i < ArrayListSize; i ++){

	    A.add (0);

    }

	t = System.currentTimeMillis()-start;

	System.out.println ("Max Time End Add: " + t); //351 milliseconds at the end for 10,000,000 and then runs out of space at 100,000,000

	/* Commenting out since it's the slower add method

	System.out.println ("Now testing adding at Beginning!");


	start = System.currentTimeMillis();

	for (int i = 0; i < ArrayListSize; i ++){

	    A.add (0,0);

    }

	t = System.currentTimeMillis()-start;

	System.out.println ("Max Time Beginning Add: " + t); //Once you hit 100,000 the difference becomes apparant. Adding at beginning is a lot slower.


	*/





	System.out.println ("-----------------------------" + "\n");


	start = System.currentTimeMillis();  //Interesting. Both burn out around 100,000,000 only because you need to create an arraylist of that size which takes time, but this was still only 94 seconds at that time, even though it was removing the very first element of the 100,000,000. It was slightly slower, but in reality, the difference was negligent at this point. 

	A.remove (0);

	t = System.currentTimeMillis() - start;

	System.out.println ("Remove Time from Beginning " + t);


	start = System.currentTimeMillis();
	
	A.remove (ArrayListSize - 2); //since you're removing one already in the previous step

	t = System.currentTimeMillis () - start;

	System.out.println ("Remove Time from End :" + t); //Always 0 because it never has to shift anything over.



	ArrayList <Integer> A2 = new ArrayList <Integer> ();

	for (int i = 0; i < 10; i++) {

	    A2.add (i * 10);

	}

	System.out.println (A2);


	ArrayList <Integer> tempArrayList = new ArrayList <Integer> ();

	for (int i = A2.size () - 1; i >= 0; i--) {

	    tempArrayList.add (A2.get (i) );

	}

	A2 = tempArrayList;


	System.out.println (A2);
	
    }

}
	    
