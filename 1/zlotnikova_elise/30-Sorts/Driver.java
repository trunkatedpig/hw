import java.io.*;
import java.util.*;

public class Driver { 
    public static void main(String[] args) { 
	Buckets RadixSort = new Buckets();
        long t1 = System.currentTimeMillis();
	RadixSort.sort();
	long t2 = System.currentTimeMillis();
	System.out.print("Radix Sort time: " );
	System.out.println(t2-t1);

	/*// BUILT IN SORT
	int[] a = new int[10000];
	Random r = new Random();
	for (int i=0;i<10;i++) { 
	    a[i] = 1000 + r.nextInt(9000);
	}
	long t3 = System.currentTimeMillis();
        Arrays.sort(a);
	long t4 = System.currentTimeMillis();
	System.out.print("Built In Sort time: " );
 	System.out.println(t4-t3);
	*/
	long t3 = System.currentTimeMillis();
	RadixSort.sort();
	long t4 = System.currentTimeMillis();
	System.out.print("Bubble Sort time: " );
	System.out.println(t4-t3);

	

    }
}
