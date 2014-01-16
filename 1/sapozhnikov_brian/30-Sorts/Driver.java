import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
        int[] A = new int[100000];
	int[] B = new int[100000];
	int[] C = new int[100000]; 
	int[] D = new int[100000];
        Random r = new Random();
        for (int i = 0; i<A.length; i++){
	    A[i] = r.nextInt(100000);
	    B[i] = r.nextInt(100000);
	    C[i] = r.nextInt(100000);
	    D[i] = r.nextInt(100000);
        }

        Radix R = new Radix();
	/*
	System.out.println(Arrays.toString(A));
	A = R.myBubble(A);
	System.out.println(Arrays.toString(A));*/
	    
	  
	long start = System.currentTimeMillis();
	A = R.sort(A);
	long t = System.currentTimeMillis();
	System.out.println("Radix time: " + (t - start));
	  
	start = System.currentTimeMillis();
	B = R.myBubble(B);
	t = System.currentTimeMillis();
	System.out.println("Bubble time:" + (t-start));
	
	start = System.currentTimeMillis();
	C = R.selection(C);
	t = System.currentTimeMillis();
	System.out.println("Selection time:" + (t-start));

	start = System.currentTimeMillis();
	D = R.insertion(D);
	t = System.currentTimeMillis();
	System.out.println("Insertion time:" + (t-start));
	
    }
}
