import java.util.*;
import java.io.*;

public class Driver {
    public static void main (String[] args) {
	
	if (args.length != 1) {
	    System.out.println("What is the size of the arraylist?");
	    System.exit(0);
	}

	ArrayList <Integer> A = new ArrayList <Integer>();

	int ArrayListSize = Integer.parseInt (args[0]); //Integer.partInt() turns argument into an integer
	long start = System.currentTimeMillis();
	long timetaken;

	System.out.println("______________________________________________________________");
	//testing: creating arraylist
	
	for (int i = 0; i < ArrayListSize; i++) {
	    A.add(0);
	}

	timetaken = System.currentTimeMillis() - start;

	System.out.println ("Time taken to make arraylist: " + timetaken); //At 100000, it took 12ms. At 1000000, it took 65ms. At 10000000, it took 109ms. At 100000000, it took 712ms. At 1000000000, it ran out of space.

	System.out.println("______________________________________________________________");
	//testing: adding to arraylist at the beginning

      	start = System.currentTimeMillis();

      	for (int i = 0; i < ArrayListSize; i++) {
      	    A.add (0,0);
      	}
	
       	timetaken = System.currentTimeMillis() - start;

       	System.out.println ("Time taken to fill list from the beginning: " + timetaken); //At 10000, it took 56ms. At 100000, it took 3065ms. At 1000000, it takes 366640ms.

	System.out.println("______________________________________________________________");
	//testing: adding to arraylist at the end

	start = System.currentTimeMillis();

	for (int i = 0; i < ArrayListSize; i++) {
	    A.add (A.size(),0);
	}

	timetaken = System.currentTimeMillis() - start;

	System.out.println ("Time taken to fill list from the end: " + timetaken); //Much faster time than before. 

	System.out.println ("______________________________________________________________");
	//testing: removing from list at the beginning

	start = System.currentTimeMillis();

	for (int i = 0; i < ArrayListSize; i++) {
	    A.remove (0);
	}

	timetaken = System.currentTimeMillis() - start;

	System.out.println ("Time taken to remove list from the beginning: " + timetaken); //Time taken is much higher than time needed to fill list from the beginning.

	System.out.println ("_____________________________________________________________");
	//testing: removing from list at the end

	start = System.currentTimeMillis();

       	for (int i = 0; i < ArrayListSize; i++) {
	    A.remove(A.size() - 1);
	} 

	timetaken = System.currentTimeMillis() - start;

	System.out.println ("Time taken to remove list from the end: " + timetaken); //Time taken is similar to time taken to fill array from the end.
    }


    //reversing the arraylist

    for (int i = 0; i < A.size(); i++) {
	int x = A.get(i);
	int y = A.get(A.size()-1);
	
	a.set(i,y);
	a.set(A.size()-i, x);
    }
}
