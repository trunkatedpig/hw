import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	ArrayList[] buckets = new ArrayList[10];
	int n = 0, maxDigit = 3, numItems = 20000;
	String s = "";
	long start, end;
	
	// makes the arraylist that sorts the array
	for (int i = 0; i < 10; i++) {
	    buckets[i] = new ArrayList();
	}

	// makes the array of ints to be sorted
	int[] a = new int[numItems], b = new int[numItems], c = new int[numItems], d = new int[numItems];
	for (int i = 0; i < numItems; i++) {
	    Random r = new Random();
	    a[i] = r.nextInt((int)(Math.pow(10, maxDigit)));
	}
	/*
	for (int i = 0; i<a.length; i++) {
	    s = s + a[i] + ", ";
	}
	System.out.println(s);
	*/
	b = a;
	c = a;
	d = a;

	//RADIX SORT
        start = System.currentTimeMillis();
	while (n < maxDigit) {
	    for (int i = 0; i < numItems; i++) {
		int x =  (int)((a[i]/(Math.pow(10, n))) % 10);
		buckets[x].add(a[i]);
	    }
	    int[] newArray = new int[numItems];
	    int ArrayCount = 0;
	    for (int i = 0; i < 10; i++) {
		//i goes through the buckets and so buckets[i] is the list of items
		for (int x = 0; x < buckets[i].size(); x++){
		    //x goes through buckets[i] and adds each number to newArray
		    newArray[ArrayCount] = (Integer)buckets[i].get(x);
		    ArrayCount++;
		}
	    }
	    a = newArray;
	    for (int i = 0; i < 10; i++) {
		buckets[i] = new ArrayList();
	    }
	    n++;
	}
	end = System.currentTimeMillis();
	System.out.println(end - start);

	//BUILT IN SORT
	start = System.currentTimeMillis();
	Arrays.sort(b);
	end = System.currentTimeMillis();
	System.out.println(end - start);


	//BUBBLE SORT
	start = System.currentTimeMillis();
	int len = c.length;
	int swaps = 0, comps = 0;
	for (int y = len; y > 0; y--) {
	    for (int i = 1; i < y; i++) {
		int x = c[i];
		comps++;
		if (x < c[i-1]) {
		    swaps = swaps + 1;
		    c[i] = c[i-1];
		    c[i-1] = x;
		}
	    }
	}
	end = System.currentTimeMillis();
	System.out.println(end- start);
	System.out.println("" + comps);
	System.out.println(swaps);

	//BUBBLE SORT OPTIMIZED
    }

}
