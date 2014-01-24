import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
		ArrayList[] buckets = new ArrayList[10];
		Sort sort = new Sort();
		int n = 0, maxDigit = 17, numItems = 50000;
		String s = "";
		long start, end;
		
		// makes the arraylist that sorts the array
		for (int i = 0; i < 10; i++) {
		    buckets[i] = new ArrayList();
		}

		// makes the array of ints to be sorted
		int[] a = new int[numItems], b = new int[numItems], c = new int[numItems],d = new int[numItems],e = new int[numItems], f = new int[numItems];
		a = sort.createArray(maxDigit, numItems);
		System.arraycopy(a, 0, b, 0, a.length);
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(a, 0, d, 0, a.length);
		System.arraycopy(a, 0, e, 0, a.length);
		System.arraycopy(a, 0, f, 0, a.length);


		//RADIX SORT
		System.out.println("\nRADIX SORT");
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
		System.out.println("time:" + (end - start));


		//BUILT IN SORT
		System.out.println("\nBUILT IN SORT");
		start = System.currentTimeMillis();
		Arrays.sort(b);
		end = System.currentTimeMillis();
		System.out.println("time: " + (end - start));

		sort.bubbleSort(c);
		sort.bubbleSortOpt(d);
		sort.selectSort(e);
		sort.insertSort(f);

    }

}
