import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args){
	Sorts test = new Sorts();
	double[] list = {9133,9283,8193,9232,2813,8329,1823,1982,1111,9999};
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
    }
}