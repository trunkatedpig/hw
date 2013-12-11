import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String args[]){
	long start, end;

	RadixSort a = new RadixSort(25,4);
	System.out.println(a);
	a.sort();
	System.out.println(a);

	RadixSort b = new RadixSort(1000000,10);
	start = System.currentTimeMillis();
	b.sort();
        end = System.currentTimeMillis();
	System.out.println("Time: " + (end-start));
	// Time : 1528 milliseconds


	int[] nums = new int[1000000];
	for (int i = 0; i < 1000000; i++){
	    nums[i] = (int) (Math.random() * Math.pow(10,10));
	}
	start = System.currentTimeMillis();
	Arrays.sort(nums);
        end = System.currentTimeMillis();
	System.out.println("Time: " + (end-start));
	// Time: 68 milliseconds

        
    }
}
