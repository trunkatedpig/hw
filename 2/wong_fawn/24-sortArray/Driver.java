import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	ArrayList[] buckets = new ArrayList[10];
	int n = 0, maxDigit = 3, numItems = 2000000;
	long start, end;
	
	// makes the arraylist that sorts the array
	for (int i = 0; i < 10; i++) {
	    buckets[i] = new ArrayList();
	}

	// makes the array of ints to be sorted
	int[] a = new int[numItems], b = new int[numItems];
	for (int i = 0; i < numItems; i++) {
	    Random r = new Random();
	    a[i] = r.nextInt((int)(Math.pow(10, maxDigit)));
	}
	b = a;

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

	start = System.currentTimeMillis();
	Arrays.sort(b);
	end = System.currentTimeMillis();
	System.out.println(end - start);
    }
}
