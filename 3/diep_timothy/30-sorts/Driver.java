import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	double time = 0.0;
        Sort t = new Sort();
	int[] a = t.makeArray(3,10);
	int[] b = t.makeArray(3,10);
	int[] c = t.makeArray(3,10);
	int[] d = t.makeArray(3,10);

        System.out.println("Original Int Array:");
        System.out.println(Arrays.toString(a));
	time = System.currentTimeMillis();
        System.out.println("Sorted Int Array (radix):");
        System.out.println(Arrays.toString(t.radixSort(a)));
       	System.out.println("Time: " + (System.currentTimeMillis() - time));
	System.out.println();

        System.out.println("Original Int Array:");
        System.out.println(Arrays.toString(b));
	time = System.currentTimeMillis();
        System.out.println("Sorted Int Array (bubble):");
        System.out.println(Arrays.toString(t.bubbleSort(b)));
       	System.out.println("Time: " + (System.currentTimeMillis() - time));
	System.out.println();

        System.out.println("Original Int Array:");
        System.out.println(Arrays.toString(c));
	time = System.currentTimeMillis();
        System.out.println("Sorted Int Array (insertion):");
        System.out.println(Arrays.toString(t.insertionSort(c)));
       	System.out.println("Time: " + (System.currentTimeMillis() - time));
	System.out.println();

        System.out.println("Original Int Array:");
        System.out.println(Arrays.toString(d));
	time = System.currentTimeMillis();
        System.out.println("Sorted Int Array (selection):");
        System.out.println(Arrays.toString(t.selectionSort(d)));
       	System.out.println("Time: " + (System.currentTimeMillis() - time));
	System.out.println();

	

    }
}
