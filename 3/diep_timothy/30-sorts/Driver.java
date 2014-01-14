import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	double time = 0.0;
        Sort t = new Sort(2,10000);
	Sort u = new Sort(2,10000);
	u = t;

        System.out.println("Original Int Array:");
        System.out.println(t);
	System.out.println();

	time = System.currentTimeMillis();
        u.bSort(u.getNums());
	System.out.println("Time: " + (System.currentTimeMillis() - time));
        System.out.println("Sorted Int Array (bubble):");
        System.out.println(u);
	System.out.println("Comparisons: " + u.getComp());
	System.out.println("Swaps: " + u.getSwap());
        System.out.println();

        time = System.currentTimeMillis();
        t.radixSort();
	System.out.println("Time: " + (System.currentTimeMillis() - time));
        System.out.println("Sorted Int Array (radix):");
        System.out.println(t);
        System.out.println();

	

    }
}
