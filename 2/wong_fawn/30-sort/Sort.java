import java.io.*;
import java.util.*;

public class Sort {

 	public int[] createArray(int maxDigit, int numItems) {
 		int[] a = new int[numItems];
 		for (int i = 0; i < numItems; i++) {
		    Random r = new Random();
		    a[i] = r.nextInt((int)(Math.pow(10, maxDigit)));
		}
		return a;
 	}

    public int[] bubbleSort(int[] a) {
    	int comps = 0, swaps = 0;
    	System.out.println("\nBUBBLE SORT");
    	int len = a.length;		
    	long start, end;
		start = System.currentTimeMillis();
		for (int y = len; y > 0; y--) {
		    for (int i = 1; i < y; i++) {
			int x = a[i];
			comps ++;
			if (x < a[i-1]) {
			    a[i] = a[i-1];
			    a[i-1] = x;
			    swaps ++;
			}
		    }
		}
		end = System.currentTimeMillis();
		System.out.println("time: " + (end - start));
		System.out.println("comparisons: " + comps);
		System.out.println("swaps: " + swaps);

		return a;
    }

    public int[] bubbleSortOpt(int[] a) {
    	int comps = 0, swaps = 0;
    	System.out.println("\nBUBBLE SORT OPTIMIZED");
		Boolean done = false;
		long start, end;
		int len = a.length;
		start = System.currentTimeMillis();
		for (int y = len; y > 0 && !done; y--) {
			done = true;
		    for (int i = 1; i < y; i++) {
			int x = a[i];
			comps ++;
				if (x < a[i-1]) {
					done = false;
				    a[i] = a[i-1];
				    a[i-1] = x;
				    swaps ++;
				}
		    }
		}
		end = System.currentTimeMillis();
		System.out.println("time: " + (end - start));
		System.out.println("comparisons: " + comps);
		System.out.println("swaps: " + swaps);
		return a;
    }

    public int[] selectSort(int[] a) {
    	int comps = 0, swaps = 0;
    	System.out.println("\nSELECT SORT");
		int len = a.length;
		long start, end;	
		start = System.currentTimeMillis();	
		for (int i = 1; i < len - 1; i++) {
			int tempMin = a[i];
			int ind = i;
		    for (int x = i + 1; x < len - 2; x++) {
		    	comps++;
		    	if (a[x] < tempMin) {
		    		tempMin = a[x];
		    		ind = x;
		    		swaps++;
		    	}
		    }
		    a[ind] = a[i];
		    a[i] = tempMin;
		}
		end = System.currentTimeMillis();
		System.out.println("time: " + (end - start));
		System.out.println("comparisons: " + comps);
		System.out.println("swaps: " + swaps);		
		return a;
    }

    public int[] insertSort(int[] a) {
    	int comps = 0, assignments = 0;
    	System.out.println("\nINSERT SORT");
    	int len = a.length;		
    	long start, end;
		start = System.currentTimeMillis();
		int[] tempArr = new int[len];
		tempArr[0] = a[0];
	    	for (int i = 1; i < len; i++) {
			    int insert = a[i];
			    for(int x = 0; x <= i; x++) {
			    	comps ++;
			    	if (insert < tempArr[x]) {
			    		assignments = assignments + 3;
			    		int b = tempArr[x];
			    		tempArr[x] = insert;
			    		insert = b;
			    	}
		   		}
		   		assignments ++;
		   		tempArr[i] = insert;
		    }
		end = System.currentTimeMillis();
		System.out.println("time: " + (end - start));
		System.out.println("comparisons: " + comps);
		System.out.println("assignments: " + assignments);				    
		a = tempArr;
		return a;
    }

    public void printArray(int[] a) {
    	String s = "";
    	for (int i = 0; i < a.length; i++) {
    		s = s + a[i] + ", ";
    	}
    	System.out.println(s);
    }
    
}