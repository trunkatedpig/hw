import java.util.*;
import java.io.*;

public class Driver {
    public static void main (String[] args) {
	if (args.length != 1) {
	    System.exit(0);
	}
	ArrayList<Integer> a = new ArrayList<Integer>();
	int size = Integer.parseInt(args[0]);

	// This method takes a longer amount of time to
	// fill the list. 10 Million was the last number
	// tried to fill the list before it crashed.
	/*
	  start = System.currentTimeMillis();
	  repeat = Integer.parseInt(args[0]);	
	  while (repeat > 0) {
	  a.add(a.size(),0);
	  repeat = repeat - 1;
	  }
	  end = System.currentTimeMillis() - start;
	  System.out.println("Array Size: " + size + " Insertion Time: " + end);
	*/
	
	// This method takes longer, removing from the
	// beginning. It stopped working at 1 Million.
	/*
	  start = System.currentTimeMillis();
	  repeat = Integer.parseInt(args[0]);
	  while (repeat > 0) {
	  a.remove(0);
	  repeat = repeat - 1;
	  }
	  end = System.currentTimeMillis() - start;
	  System.out.println("Array Size: " + size + " Removal Time: " + end);
	*/

	// Could not insert enough to make this stop working
	/*
	start = System.currentTimeMillis();
	repeat = Integer.parseInt(args[0]);
	while (repeat > 0) {
	    a.remove(a.size()-1);
	    repeat = repeat - 1;
	}
	end = System.currentTimeMillis() - start;
	System.out.println("Array Size: " + size + " Removal Time: " + end);
	*/

	// Stopped working at 80 Million
	long start = System.currentTimeMillis();
	int repeat = Integer.parseInt(args[0]);
	while (repeat > 0) {
	    a.add(0);
	    repeat = repeat - 1;
	}
	long end = System.currentTimeMillis() - start;
	System.out.println("Array Size: " + size + " Insertion Time: " + end);

	int b, c;

	for (int i = 0; i < a.size(); i++) {
	    b = a.get(i);
	    c = a.get(a.size()-i);
	    
	    a.set(i, c);
	    a.set(a.size()-i, b);
	}



    }
}
