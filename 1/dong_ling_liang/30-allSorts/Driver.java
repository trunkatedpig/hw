import java.io.*;
import java.util.*;

public class Driver {
    public static void printList(double[] name){
	for (double i : name){
	    System.out.print (i + " ");
	}
	System.out.println(" ");
    }
    public static void main(String[] args){
	Sorts test = new Sorts();
	double[] list = {9133,9283,8193,9232,2813,8329,1823,1982,1111,9999,2931,3242,4563,5467,6896,6557,3432,2342,5324,2533,6456,8768};
	long start = System.currentTimeMillis();
	double[] alist = new double[list.length];
	alist = test.bubbleSort(list);
	System.out.println ("Bubble sort time is " + (System.currentTimeMillis() - start));
	for (double i : alist){
	    System.out.print(i + " ");
	}
	System.out.println(" ");
	
	start = System.currentTimeMillis();
	double[] otherList = new double[list.length];
	otherList = test.radixSort(list, 4);
	System.out.println("Radix sort time is " + (System.currentTimeMillis() - start));
	for (double i : otherList){
	    System.out.print(i + " ");
	}
	System.out.println(" ");
	
	start = System.currentTimeMillis();
	double[] anotherList = new double[list.length];
	anotherList = test.selectionSort(list);
	System.out.println("Sel. sort time is " + (System.currentTimeMillis() - start));
	printList(anotherList);

	start = System.currentTimeMillis();
	double[] oneMoreList = new double[list.length];
	oneMoreList = test.insertionSort(list);
	System.out.println("Insert. sort time is " + (System.currentTimeMillis() - start));
	printList(oneMoreList);
    }
}
