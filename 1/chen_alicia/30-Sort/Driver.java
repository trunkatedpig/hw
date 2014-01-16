import java.io.*;
import java.util.*;
 
public class Driver{
    public static void main (String[] args){
	Sorts s = new Sorts();
        int[] a = s.makeArray(3,10);
        int[] b = s.makeArray(3,10);
        int[] c =s.makeArray(3,10);
        int[] d = s.makeArray(3,10);

	//radix sorting
        System.out.println("Original Array: ");
     System.out.println(Arrays.toString(a));
        long t1 = System.currentTimeMillis();
	System.out.println("Radix: ");
	System.out.println(Arrays.toString(s.radixSort(a)));              
        long t2 = System.currentTimeMillis();
        System.out.println("Time :" + (t2-t1));
        System.out.println();

        //bubble sorting
       System.out.println("Original Array: ");
     System.out.println(Arrays.toString(b));
         t1 = System.currentTimeMillis();
	System.out.println("Bubble: ");
	System.out.println(Arrays.toString(s.bSort(b)));              
       t2 = System.currentTimeMillis();
        System.out.println("Time :" + (t2-t1));
        System.out.println();

	//insertion sort
	System.out.println("Original Array: ");
     System.out.println(Arrays.toString(c));
        t1 = System.currentTimeMillis();
	System.out.println("Insertion: ");
	System.out.println(Arrays.toString(s.insertionSort(c)));              
        t2 = System.currentTimeMillis();
        System.out.println("Time :" + (t2-t1));
        System.out.println();

        //selection sort
       System.out.println("Original Array: ");
     System.out.println(Arrays.toString(d));
       t1 = System.currentTimeMillis();
	System.out.println("Slection: ");
	System.out.println(Arrays.toString(s.selectionSort(d)));              
      t2 = System.currentTimeMillis();
        System.out.println("Time :" + (t2-t1));
        System.out.println();
    }
}
