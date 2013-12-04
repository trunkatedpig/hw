import java.util.*;
import java.io.*;

public class Radix {

    public static void main(String[] args) {
	Random r = new Random();
	int n1 = 1000;
	int n2 = 100000;
	int d1 = 4;
	int d2 = 30;
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

	System.out.println("Radix sort tests");

	long t = System.currentTimeMillis();
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

    public static int[] radix(int numItems, int numDigits, int[] a) {
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
