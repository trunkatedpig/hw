import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {

	Radix r = new Radix(100000,20), s = new Radix(100000,20);
	System.out.println("Original array:\n"+r);
	System.out.println();
	double t1 = System.currentTimeMillis();
	r.sort();
	double t2 = System.currentTimeMillis();
	System.out.println("Sorted array:\n"+r);
	System.out.println();
	System.out.println("\nTime required with Radix: "+(t2-t1));
	t1 = System.currentTimeMillis();
	Arrays.sort(s.getNums());
	t2 = System.currentTimeMillis();
	System.out.println("Time required with Array's sort method: "+(t2-t1));



    }

}
