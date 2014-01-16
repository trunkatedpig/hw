import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args){

	//10000 3-digit numbers
	//radix sort
        Radix r = new Radix(3,1000);
	int[] bubbleA = r.getArray();
	int[] insertionA = r.getArray();
	int[] selectionA = r.getArray();

	long t1 = System.currentTimeMillis();
	r.radixSort();
	long t2 = System.currentTimeMillis();
	long radixClock = t2-t1;

	t1 = System.currentTimeMillis();
	r.bSort(bubbleA);
	t2 = System.currentTimeMillis();
	long bubbleClock = t2-t1;
	int bCompare = r.bubbleCompare;
	int bSwap = r.bubbleSwap;

	t1 = System.currentTimeMillis();
	r.insertion(insertionA);
	t2 = System.currentTimeMillis();
	long insertionClock = t2-t1;
	int iCompare = r.insertCompare;
	int iSwap = r.insertSwap;

	t1 = System.currentTimeMillis();
	r.selection(selectionA);
	t2 = System.currentTimeMillis();
	long selectionClock = t2-t1;
	int sCompare = r.selectCompare;
	int sSwap = r.selectSwap;

	System.out.println("Compare Times: ");
	System.out.println("Radix: " + radixClock);
	System.out.println("Bubble: " + bubbleClock);
	System.out.println("Insertion: " + insertionClock);
	System.out.println("Selection: " + selectionClock);

	System.out.println("Compare Swaps: ");
	System.out.println("Bubble: " + bSwap);
	System.out.println("Insertion: " + iSwap);
	System.out.println("Selection: " + sSwap);

	System.out.println("Compare Comparisons: ");
	System.out.println("Bubble: " + bCompare);
	System.out.println("Insertion: " + iCompare);
	System.out.println("Selection: " + sCompare);






	/*
	//10000 3-digit numbers
	//radix sort
	r = new Radix(3,10000);
	t1 = System.currentTimeMillis();
	r.radixSort();
	t2 = System.currentTimeMillis();
	System.out.println(t2-t1);
	//bubble sort
	r = new Radix(3,10000);
	t1 = System.currentTimeMillis();
	r.bSort();
	t2 = System.currentTimeMillis();
	System.out.println(t2-t1);

	//100000 3-digit numbers
	//radix sort
	r = new Radix(3,100000);
	t1 = System.currentTimeMillis();
	r.radixSort();
	t2 = System.currentTimeMillis();
	System.out.println(t2-t1);
	//bubble sort
	r = new Radix(3,100000);
	t1 = System.currentTimeMillis();
	r.bSort();
	t2 = System.currentTimeMillis();
	System.out.println(t2-t1);
	
	//CONCLUSION: radix sort is a lot faster than bubble sort
	*/





    }
}
