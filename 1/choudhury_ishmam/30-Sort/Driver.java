import java.io.*;
import java.util.*;


public class Driver{
    public static void main (String[] args){
        Sort a = new Sort(10000);
        Sort b = new Sort(10000);
        Long c = System.currentTimeMillis();
        a.radixSort();
        Long d = System.currentTimeMillis();
        System.out.println("radix: " + (d-c));
        Long e = System.currentTimeMillis();
        b.bSort ();
        Long f = System.currentTimeMillis();
        System.out.println("Bubblesort:" + (f-e));


	/*	Sort z = new Sort (100000);
        e = System.currentTimeMillis();
        z.bSort ();
        f = System.currentTimeMillis();
        System.out.println("Bubblesort:" + (f-e));
	
	
	Sort y = new Sort (1000000);
        e = System.currentTimeMillis();
        y.bSort ();
        f = System.currentTimeMillis();
        System.out.println("Bubblesort:" + (f-e));
	*/
	Sort m = new Sort(10000);
        Sort n = new Sort(10000);
        c = System.currentTimeMillis();
        m.selectionSort();
        d = System.currentTimeMillis();
        System.out.println("Selection: " + (d-c));

	    e = System.currentTimeMillis();
        n.insertionSort ();
        f = System.currentTimeMillis();
        System.out.println("Insertion:" + (f-e));
	
    }
}
