import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args){

	//1000 3-digit numbers
	//radix sort
        Radix r = new Radix(3,1000);
	long t1 = System.currentTimeMillis();
	r.radixSort();
	long t2 = System.currentTimeMillis();
	System.out.println(t2-t1);
	//bubble sort
	r = new Radix(3,1000);
	t1 = System.currentTimeMillis();
	r.bSort();
	t2 = System.currentTimeMillis();
	System.out.println(t2-t1);

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

    }
}
