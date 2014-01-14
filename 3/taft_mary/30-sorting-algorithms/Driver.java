import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {

	Sorter r = new Sorter(500,20), s = new Sorter(500,20), t = new Sorter(500,20);
	System.out.println("Original array:\n"+r);
	System.out.println();
	double t1 = System.currentTimeMillis();
	r.rsort();
	double t2 = System.currentTimeMillis();
	System.out.println("Sorted array:\n"+r);
	System.out.println();
	System.out.println("\nTime required with Radix Sort: "+(t2-t1));

	System.out.println("Original array:\n"+s);
	System.out.println();
	t1 = System.currentTimeMillis();
	Arrays.sort(s.getNums());
	t2 = System.currentTimeMillis();
	System.out.println("Sorted array:\n"+s);
	System.out.println();
	System.out.println("Time required with Array's sort method: "+(t2-t1));

	System.out.println("Original array:\n"+t);
	System.out.println();
	t1 = System.currentTimeMillis();
	t.bsort(t.getNums());
	t2 = System.currentTimeMillis();
	System.out.println("Sorted array:\n"+t);
	System.out.println();
	System.out.println("\nTime required with Bubble Sort: "+(t2-t1));

    }

}
