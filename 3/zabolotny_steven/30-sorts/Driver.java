import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	/*
	Bubble b3 = new Bubble();
	int[] a = {9,3,5,2,6,4,7,8,1,0};
	System.out.println(Arrays.toString(b3.bubbleSort(a)));
	Buckets b = new Buckets(100000,3);
	int[] orig = b.get();
	System.out.println("Sorting 100,000 3 digit numbers.");
	double time = System.currentTimeMillis();
	b.rsort();
	System.out.println("Radix: " + (System.currentTimeMillis() - time));
	b.set(orig);
	time = System.currentTimeMillis();
	Arrays.sort(b.get());
	System.out.println("Arrays.sort: " + (System.currentTimeMillis() - time));
	Bubble b2 = new Bubble();
	time = System.currentTimeMillis();
	b2.bubbleSort(orig);
	System.out.println("Bubble: " + (System.currentTimeMillis() - time));

	b = new Buckets(100000,20);
	int[] orig2 = b.get();
	System.out.println("\nSorting 100,000 20 digit numbers.");
	time = System.currentTimeMillis();
	b.rsort();
	System.out.println("Radix: " + (System.currentTimeMillis() - time));
	b.set(orig2);
	time = System.currentTimeMillis();
	Arrays.sort(b.get());
	System.out.println("Arrays.sort: " + (System.currentTimeMillis() - time));
	time = System.currentTimeMillis();
	b2.bubbleSort(orig2);
	System.out.println("Bubble sort: " + (System.currentTimeMillis() - time));
	*/
	Buckets b = new Buckets(10000,3);
	int[] a = b.get();
	Sort s = new Sort();

	double time = System.currentTimeMillis();
	s.bubbleSort(a);
	System.out.println("Bubble Sort: \nTime: " + (System.currentTimeMillis() - time));
	System.out.println("Comparisons: " + s.getComparisons() + "\nAssignments: " + s.getAssignments());
	//System.out.println(Arrays.toString(s.bubbleSort(a)));

	b = new Buckets(10000,3);
	a = b.get();
	//System.out.println(Arrays.toString(a));
	time = System.currentTimeMillis();
	s.insertionSort(a);
	System.out.println("\nInsertion Sort: \nTime: " + (System.currentTimeMillis() - time));
	System.out.println("Comparisons: " + s.getComparisons() + "\nAssignments: " + s.getAssignments());
	//System.out.println(Arrays.toString(s.insertionSort(a)));

	b = new Buckets(10000,3);
	a = b.get();
	time = System.currentTimeMillis();
	s.selectionSort(a);
	System.out.println("\nSelection Sort: \nTime: " + (System.currentTimeMillis() - time));
	System.out.println("Comparisons: " + s.getComparisons() + "\nAssignments: " + s.getAssignments());
	//System.out.println(Arrays.toString(s.selectionSort(a)));
    }
}