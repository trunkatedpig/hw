import java.util.*;
import java.io.*;

public class Driver {
    public static void main (String[] args) {
	if (args.length != 1) {
	    System.exit(0);
	}
       	ArrayList<Integer> a = new ArrayList<Integer>();

	long start = System.currentTimeMillis();
	int repeat = Integer.parseInt(args[0]);
	int size = Integer.parseInt(args[0]);
	while (repeat > 0) {
	    a.add(0);
	    repeat = repeat - 1;
	}
	long end = System.currentTimeMillis() - start;
	System.out.println("Array Size: " + size + " Creation Time: " + end);

       	start = System.currentTimeMillis();
	repeat = Integer.parseInt(args[0]);	
	size = Integer.parseInt(args[0]);
	while (repeat > 0) {
	    a.add(a.size(),0);
	    repeat = repeat - 1;
	}
	end = System.currentTimeMillis() - start;
	System.out.println("Array Size: " + size + " Creation Time: " + end);
	
	//Maximum data reached at 10 million. Adding to the end of the list is faster than adding to the beginning of the list.

	start = System.currentTimeMillis();
	repeat = Integer.parseInt(args[0]);	
	size = Integer.parseInt(args[0]);
	while (repeat > 0) {
	    a.remove(0);
	    repeat = repeat - 1;
	}
	end = System.currentTimeMillis() - start;
	System.out.println("Array Size: " + size + " Creation Time: " + end);

	start = System.currentTimeMillis();
	repeat = Integer.parseInt(args[0]);	
	size = Integer.parseInt(args[0]);
	while (repeat > 0) {
	    a.remove(a.size()-1);
	    repeat = repeat - 1;
	}
	end = System.currentTimeMillis() - start;
	System.out.println("Array Size: " + size + " Creation Time: " + end);

	//Removing from the end is MUCH faster. Removing from the start began to take a long time at 100,000 elements of data.

	for (int i = 0; i < 100; i++){
	   a.add(i);
	}
	System.our.println(a);

	for (int q = 0; q < a.size()/2; q++){
	    int b= a.get(q);
            int e=a.get(a.size()-1-q);
            a.set(q,e);
	    a.set(a.size()-1-q,b);
	}
	    System.out.println(a);
    }
}
