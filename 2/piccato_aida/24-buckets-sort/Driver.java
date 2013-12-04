import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	BucketsSort bs = new BucketsSort(1000000);
	int[] a = new int[1000000];
	Random r = new Random();
	for (int i = 0; i < a.length; i++) {
	    a[i] = r.nextInt(899999999)+100000000;
	}
	long start = System.currentTimeMillis();

	//System.out.println(bs);
   	bs.sort();
	//System.out.println(bs);

	long end = System.currentTimeMillis();

	System.out.println("Radix time: " + (end - start));

	start = System.currentTimeMillis();

	//System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	//System.out.println(Arrays.toString(a));

	end = System.currentTimeMillis();
	
	System.out.println("Built-in time: " + (end - start)); 
    }
}
