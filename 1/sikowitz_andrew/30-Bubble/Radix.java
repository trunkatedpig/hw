import java.util.*;
import java.io.*;

public class Radix {

    public static void main(String[] args) {
	Random r = new Random();
	int n1 = 10000;
	int n2 = 100000;
	int d1 = 10;
	int d2 = 100;
	int[] a1 = new int[n1];
	int[] a2 = new int[n2];
	int[] a3 = new int[n1];
	int[] a4 = new int[n2];
	
	for (int i=0; i<n1; i++)
	    a1[i] = r.nextInt((int) Math.pow(10, d1));
	for (int i=0; i<n2; i++)
	    a2[i] = r.nextInt((int) Math.pow(10, d1));
	for (int i=0; i<n1; i++)
	    a3[i] = r.nextInt((int) Math.pow(10, d2));
	for (int i=0; i<n2; i++)
	    a4[i] = r.nextInt((int) Math.pow(10, d2));	    
	
	long t;

	System.out.println("Insertion sort tests");

	t = System.currentTimeMillis();
	insertion(a1);
	t = System.currentTimeMillis() - t;
	System.out.println(t);

	t = System.currentTimeMillis();
	insertion(a2);
	t = System.currentTimeMillis() - t;
	System.out.println(t);

	t = System.currentTimeMillis();
	insertion(a3);
	t = System.currentTimeMillis() - t;
	System.out.println(t);

	t = System.currentTimeMillis();
	insertion(a4);
	t = System.currentTimeMillis() - t;
	System.out.println(t);

	System.out.println("Selection sort tests");

	t = System.currentTimeMillis();
	selection(a1);
	t = System.currentTimeMillis() - t;
	System.out.println(t);

	t = System.currentTimeMillis();
	selection(a2);
	t = System.currentTimeMillis() - t;
	System.out.println(t);

	t = System.currentTimeMillis();
	selection(a3);
	t = System.currentTimeMillis() - t;
	System.out.println(t);

	t = System.currentTimeMillis();
	selection(a4);
	t = System.currentTimeMillis() - t;
	System.out.println(t);

	System.out.println("Bubble sort tests");

	t = System.currentTimeMillis();
	bubble(a1);
	t = System.currentTimeMillis() - t;
	System.out.println(t);
	//System.out.println(Arrays.toString(a1));

	t = System.currentTimeMillis();
	bubble(a2);
	t = System.currentTimeMillis() - t;
	System.out.println(t);
	//System.out.println(Arrays.toString(a2));

	t = System.currentTimeMillis();
	bubble(a3);
	t = System.currentTimeMillis() - t;
	System.out.println(t);
	//System.out.println(Arrays.toString(a3));

	t = System.currentTimeMillis();
	bubble(a4);
	t = System.currentTimeMillis() - t;
	System.out.println(t);
	//System.out.println(Arrays.toString(a4));

	System.out.println("Radix sort tests");

	t = System.currentTimeMillis();
	radix(n1, d1, a1);
	t = System.currentTimeMillis() - t;
	System.out.println(t);

	t = System.currentTimeMillis();
	radix(n2, d1, a2);
	t = System.currentTimeMillis() - t;
	System.out.println(t);

	t = System.currentTimeMillis();
	radix(n1, d2, a3);
	t = System.currentTimeMillis() - t;
	System.out.println(t);

	t = System.currentTimeMillis();
	radix(n2, d2, a4); 
	t = System.currentTimeMillis() - t;
	System.out.println(t);

	System.out.println("Arrays.sort tests: ");
	
	t = System.currentTimeMillis();
	Arrays.sort(a1);
	t = System.currentTimeMillis() - t;
	System.out.println(t);

	t = System.currentTimeMillis();
	Arrays.sort(a2);
	t = System.currentTimeMillis() - t;
	System.out.println(t);

	t = System.currentTimeMillis();
	Arrays.sort(a3);
	t = System.currentTimeMillis() - t;
	System.out.println(t);

	t = System.currentTimeMillis();
	Arrays.sort(a4);
	t = System.currentTimeMillis() - t;
	System.out.println(t);
    }

    public static int[] insertion(int[] l) {
	int list[] = l.clone();
	int store;
	int index;
	long numC = 0;
	long numA = 0;
	boolean done;

	for (int n=1; n<list.length; n++) {
	    index = 0;
	    done = false;
	    store = list[n];

	    for (int i=n-1; i>=0 && !done; i--) {
		numC++;
		if (store > list[i]) {
		    index = i+1;
		    done = true;
		}
	    }

	    for (int j=n; j > index; j--)
		list[j] = list[j-1];
	    list[index] = store;
	    numA++;
	}

	System.out.println("Number of comparisons: " + numC);
	System.out.println("Number of assignments: " + numA);

	return list;
    }	

    public static int[] selection(int[] l) {
	int list[] = l.clone();
	int min;
	int index;
	long numC = 0;
	long numSwaps = 0; //of min value, going to be n-1 swaps overall

	for (int n=1; n<list.length; n++) {
	    min = list[n-1];
	    index = n-1;
	    for (int i=n; i<list.length; i++) {
		numC++;
		if (list[i] < min) {
		    min = list[i];
		    index = i;
		    numSwaps++;
		}
	    }
	    list[index] = list[n-1];
	    list[n-1] = min;
	}
	System.out.println("Number of comparisons: " + numC);
	System.out.println("Number of swaps: " + numSwaps);

	return list;
    }
    
    public static int[] bubble(int[] l) { //Optimizations noted with comments
	int[] list = l.clone();
	int store = 0;
	long numSwaps = 0;
	long numRuns = 0;

	for (int n=list.length-1; n > 0; n--) { //Need only n-1 swaps
	    //Last run puts lowest number in place for sure as well
	    for (int i=0; i < n; i++) { //We know digits past n are in order
		if (list[i] > list[i+1]) {
		    store = list[i];
		    list[i] = list[i+1];
		    list[i+1] = store;
		    numSwaps++;
		}
		numRuns++;
	    }
	}
	System.out.println("Number of comparisons: " + numRuns);
	System.out.println("Number of swaps: " + numSwaps);

	return list;
    }
	    

    public static int[] radix(int numItems, int numDigits, int[] list) {
	int[] a = list.clone();
	ArrayList[] buckets = new ArrayList[10];

	Random r = new Random();
	int digit;
	int counter;

	//for (int i=0; i<numItems; i++)
	//    a[i] = r.nextInt((int) Math.pow(10, numDigits));

	for (int n=0; n<numDigits; n++) {
	    for (int i=0; i<10; i++)
		buckets[i] = new ArrayList();
	    for (int i=0; i<numItems; i++) {
		digit = (int)(a[i] / Math.pow(10, n)) % 10;
		buckets[digit].add(a[i]);
	    }
	    counter = 0;
	    for (int i=0; i<10; i++) {
		while (buckets[i].size() > 0) {
		    a[counter] = (Integer) buckets[i].get(0);
		    buckets[i].remove(0);
		    counter ++;
		}
	    }
	}
	return a;
    }
}
