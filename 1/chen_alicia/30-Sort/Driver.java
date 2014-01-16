import java.io.*;
import java.util.*;
 
public class Driver{
    public static void main (String[] args){

	//radix sorting
        Sorts s = new Sorts(3,1000);
        long t1 = System.currentTimeMillis();
	System.out.println("Radix: ");
        s.radixSort();
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);

        //bubble sorting
        s = new Sorts(3,1000);
        t1 = System.currentTimeMillis();
	System.out.println("Bubble: ");
        s.bSort();
        t2 = System.currentTimeMillis();
        System.out.println(t2-t1);

	//radix sort
        s = new Sorts(3,10000);
        t1 = System.currentTimeMillis();
	System.out.println("Radix: ");
        s.radixSort();
        t2 = System.currentTimeMillis();
        System.out.println(t2-t1);

        //bubble sort
        s = new Sorts(3,10000);
        t1 = System.currentTimeMillis();
	System.out.println("Bubble: ");
        s.bSort();
        t2 = System.currentTimeMillis();
        System.out.println(t2-t1);

        //radix sort
        s = new Sorts(3,100000);
        t1 = System.currentTimeMillis();
	System.out.println("Radix: ");
        s.radixSort();
        t2 = System.currentTimeMillis();
        System.out.println(t2-t1);

        //bubble sort
        s = new Sorts(3,100000);
        t1 = System.currentTimeMillis();
	System.out.println("Bubble: ");
        s.bSort();
        t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
    }
}
