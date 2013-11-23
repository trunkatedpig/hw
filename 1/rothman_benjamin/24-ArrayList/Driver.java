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



	System.out.println ("Now testing adding at Beginning!");


	start = System.currentTimeMillis();

	for (int i = 0; i < ArrayListSize; i ++){

	    A.add (0,0);

    }

	t = System.currentTimeMillis()-start;

	System.out.println ("Max Time Beginning Add: " + t); //Once you hit 100,000 the difference becomes apparant. Adding at beginning is a lot slower.


	/*	
	//	ArrayStuff as = new ArrayStuff(arraySize,50);
	t = System.currentTimeMillis()-start;
	//	System.out.println("Array Size: "+arraySize+" Creation time: "+t);
	start=System.currentTimeMillis();
	//	as.findMaxIndex();
	t = System.currentTimeMillis()-start;
	System.out.println("Max Time: "+t);
	start=System.currentTimeMillis();
	//	as.mode2();
	t = System.currentTimeMillis()-start;
	System.out.println("Mode Time: "+t);

	*/
    }

}
	    
