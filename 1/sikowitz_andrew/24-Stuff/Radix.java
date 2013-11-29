import java.util.*;
import java.io.*;

public class Radix {
    public static void main(String[] args) {
	ArrayList[] buckets = new ArrayList[10];

	int a[] = new int[100];
	Random r = new Random();
	int digit;
	int counter;

	for (int i=0; i<100; i++)
	    a[i] = r.nextInt(10000);

	for (int n=0; n<4; n++) {
	    for (int i=0; i<10; i++)
		buckets[i] = new ArrayList();
	    for (int i=0; i<100; i++) {
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
	System.out.println(Arrays.toString(a));
    }
}
