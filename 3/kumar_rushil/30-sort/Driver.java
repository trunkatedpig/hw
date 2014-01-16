import java.io.*;
import java.util.*;
public class Driver{
    public static void main (String[] args){
	long start, t;
	Sorts rs = new Sorts();
	Random r = new Random();
	int [] a = new int [1000];
	for (int i = 0; i < a.length; i ++){
	    a[i]=r.nextInt(10);
	}
	// System.out.println("This is the data:\n" + Arrays.toString(a));
	// //RadixSorts
	// start = System.currentTimeMillis();
	// String s = Arrays.toString(rs.radixSortSort(a,12));
	// // System.out.println("\nData organized(RadixSort):\n" + s);
	// t = System.currentTimeMillis() - start;
	// System.out.println("Time:" + t);

	// //JavaSort
	// start = System.currentTimeMillis();
	// Arrays.sort(a);
	// // System.out.println("\nData organized(JavaSort):\n" + Arrays.toString(a));
	// t = System.currentTimeMillis() - start;
	// System.out.println("Time:" + t);

	//BubbleSort
	start = System.currentTimeMillis();
	String s1 = Arrays.toString(rs.bSort(a));
	// System.out.println("\nData organized(BubbleSort):\n" + s1);
	t = System.currentTimeMillis() - start;
	System.out.println("Time:" + t);

	//InsertionSort
	start = System.currentTimeMillis();
	String s2 = Arrays.toString(rs.insertionSort(a));
	// System.out.println("\nData organized(InsertionSort):\n" + s2);
	t = System.currentTimeMillis() - start;
	System.out.println("Time:" + t);

	//SelectionSort
	start = System.currentTimeMillis();
	String s3 = Arrays.toString(rs.insertionSort(a));
	// System.out.println("\nData organized(SelectionSort):\n" + s3);
	t = System.currentTimeMillis() - start;
	System.out.println("Time:" + t);

    }
}
