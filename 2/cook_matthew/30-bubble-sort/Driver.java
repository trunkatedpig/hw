import java.util.*;
import java.io.*;

public class Driver {
    public static void main (String[] args) {
	long start,end;
	/*
	RadixSort r = new RadixSort(25,4);
	System.out.println(r);
	r.sort();
	System.out.println(r);
	RadixSort b = new RadixSort(25,4);
	System.out.println(b);
	b.bsort();
	System.out.println(b);
	
	int[] a = {5,3,67,2,11,787,3,6,1};
	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
     	System.out.println(Arrays.toString(a));
	*/
	
	RadixSort radiz = new RadixSort(100000,6);
	start=System.currentTimeMillis();
	radiz.sort();
	end = System.currentTimeMillis();
	System.out.println("Radix Time: " + (end-start));
	// Time: 239
	
	RadixSort bubble = new RadixSort(100000,6);
	start=System.currentTimeMillis();
	bubble.bsort();
	end = System.currentTimeMillis();
	System.out.println("Bubble Time: " + (end-start));
	// Time:  27187 

	RadixSort sel = new RadixSort(100000,6);
	start=System.currentTimeMillis();
	//System.out.println(Arrays.toString(sel.ssort()));
	sel.ssort();
	end = System.currentTimeMillis();
	System.out.println("Selection Time: " + (end-start));
	// Time:  
 
	RadixSort ins = new RadixSort(100000,6);
	start=System.currentTimeMillis();
	ins.isort();
	end = System.currentTimeMillis();
	System.out.println("Insertion Time: " + (end-start));
	// Time:  
	
	/*
	int[] nums = new int[10000000];
	for (int q=0; q<1000000; q++) {
	    nums[q] = (int) (Math.random() * Math.pow(10,10));
	}
	start=System.currentTimeMillis();
	Arrays.sort(nums);
        end = System.currentTimeMillis();
        System.out.println("Time: " + (end-start));
	//Time: 111 
	*/

	
	
    }
}