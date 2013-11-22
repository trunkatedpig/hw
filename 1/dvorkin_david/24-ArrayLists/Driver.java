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

	//Maximum data reached at 10 million, 

	start = System.currentTimeMillis();
	repeat = Integer.parseInt(args[0]);	
	size = Integer.parseInt(args[0]);
	while (repeat > 0) {
	    a.remove(0);
	    repeat = repeat - 1;
	}
	end = System.currentTimeMillis() - start;
	System.out.println("Array Size: " + size + " Creation Time: " + end);





    }
}