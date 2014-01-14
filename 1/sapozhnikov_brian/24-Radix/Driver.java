import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
        int[] A = new int[10000];
	int[] B = new int[1000000];
        Random r = new Random();
        for (int i = 0; i<A.length; i++){
	    A[i] = r.nextInt(10000000);
	    B[i] = r.nextInt(10000000);
        }

        Radix R = new Radix();

	long start = System.currentTimeMillis();
		
	//A = R.sort(A);
	//A = R.bubble(A);
	A = R.myBubble(A);

	long t = System.currentTimeMillis();
	//System.out.println("Radix sort: " + (t - start));
	//System.out.println("Bubble sort: " + (t - start));
	System.out.println("New bubble sort: " + (t - start));
	System.out.println(Arrays.toString(A));	
	// System.out.println(Arrays.toString(A));
	
        // System.out.println(R.toString(R.sort(A)));

	start = System.currentTimeMillis();
	
	//Arrays.sort(B);

	t = System.currentTimeMillis();
	//System.out.println("Built-in sort: " + (t - start));
	// System.out.println(Arrays.toString(B));

	/*
	  Time Tests
	  
	    3-digit numbers
	         list size: 10,000
	                 Radix: 23
		      Built-in: 3
		 list size: 100,000
		         Radix: 1254
		      Built-in: 9
	         list size: 1,000,000
	                 Radix: 148,632
		      Built-in: 55
	    4-digit number
	         list size: 10,000
		         Radix: 16
		      Built-in: 3
		 list size: 100,000
		          Radix: 405
			  Built-in: 12
		 list size: 1,000,000
		          Radix: 40340
			  Built-in: 77

Rest in notebook
	 */
    }
}
