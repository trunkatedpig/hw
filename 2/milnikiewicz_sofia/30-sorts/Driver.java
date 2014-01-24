import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {

        //1000 3-digit numbers
        //radix sort
	System.out.println("\n1000 digit numbers: ");
        Sorts s = new Sorts(3,1000);
        long t1 = System.currentTimeMillis();
        s.radixSort();
        long t2 = System.currentTimeMillis();
	System.out.print("Radix: ");
        System.out.println(t2-t1);
        //bubble sort
        Sorts s2 = new Sorts(3,1000);
        t1 = System.currentTimeMillis();
        s2.bSort();
        t2 = System.currentTimeMillis();
	System.out.print("Bubble: ");
        System.out.println(t2-t1);

        //10000 3-digit numbers
	System.out.println("\n10000 digit numbers: ");
        Sorts s3 = new Sorts(3,10000);
        long t3 = System.currentTimeMillis();
        s3.radixSort();
        long t4 = System.currentTimeMillis();
	System.out.print("Radix: ");
        System.out.println(t4-t3);
        //bubble sort
        Sorts s4 = new Sorts(3,10000);
        t3 = System.currentTimeMillis();
        s4.bSort();
        t4 = System.currentTimeMillis();
	System.out.print("Bubble: ");
        System.out.println(t4-t3);

        //100000 3-digit numbers
        //radix sort
	System.out.println("\n100000 digit numbers: ");
        Sorts s5 = new Sorts(3,100000);
        long t5 = System.currentTimeMillis();
        s5.radixSort();
        long t6 = System.currentTimeMillis();
	System.out.print("Radix: ");
        System.out.println(t6-t5);
        //bubble sort
        Sorts s6 = new Sorts(3,100000);
        t5 = System.currentTimeMillis();
        s6.bSort();
        t6 = System.currentTimeMillis();
	System.out.print("Bubble: ");
        System.out.println(t6-t5);
        
        //CONCLUSION: radix sort is a lot faster than bubble sort
    }
}
