import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	Buckets b = new Buckets(1000000,3);
	int[] orig = b.get();
	System.out.println("Sorting 1,000,000 3 digit numbers.");
	double time = System.currentTimeMillis();
	b.rsort();
	System.out.println("Radix: " + (System.currentTimeMillis() - time));
	b.set(orig);
	time = System.currentTimeMillis();
	Arrays.sort(b.get());
	System.out.println("Arrays.sort: " + (System.currentTimeMillis() - time));
	b = new Buckets(1000000,20);
	int[] orig2 = b.get();
	System.out.println("\nSorting 1,000,000 20 digit numbers.");
	time = System.currentTimeMillis();
	b.rsort();
	System.out.println("Radix: " + (System.currentTimeMillis() - time));
	b.set(orig2);
	time = System.currentTimeMillis();
	Arrays.sort(b.get());
	System.out.println("Arrays.sort: " + (System.currentTimeMillis() - time));
    }
}
	