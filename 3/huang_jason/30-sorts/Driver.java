import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args){

	BubbleSort b = new BubbleSort();
	int[] s = b.randomList();
	long start, end, start2, end2, start3, end3, start4, end4;

	System.out.println("BubbleSort");
	System.out.println(Arrays.toString(s));
	start = System.currentTimeMillis();
	b.bsort(s);
	end = System.currentTimeMillis();
	System.out.println(Arrays.toString(s));
	System.out.println("Time: " + (end - start));
	
	System.out.println("RadixSort");
	System.out.println(Arrays.toString(s));
	start2 = System.currentTimeMillis();
	b.radixSort(s);
	end2 = System.currentTimeMillis();
	System.out.println(Arrays.toString(s));
	System.out.println("Time: " + (end2 - start2));

	System.out.println("InsertionSort");
	System.out.println(Arrays.toString(s));
	start3 = System.currentTimeMillis();
	b.insertionSort(s);
	end3 = System.currentTimeMillis();
	System.out.println(Arrays.toString(s));
	System.out.println("Time: " + (end3 - start3));

	System.out.println("SelectionSort");
	System.out.println(Arrays.toString(s));
	start4 = System.currentTimeMillis();
	b.selectionSort(s);
	end4 = System.currentTimeMillis();
	System.out.println(Arrays.toString(s));
	System.out.println("Time: " + (end4 - start4));

    }
}