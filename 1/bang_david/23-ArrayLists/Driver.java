import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<Integer>();

	long b = System.currentTimeMillis ();

        for(int i = 0; i<100000; i++) {
            A.add(i);
	}	
	
        long c = System.currentTimeMillis();
	System.out.println (c - b);

	// 20 

	A.clear ();

        long d = System.currentTimeMillis();
        for(int i = 0; i<100000; i++) {
            A.add(0,i);
	}
        long e = System.currentTimeMillis();
	System.out.println (e - d);
	// 2163

	// adding to the end of the list is much faster than adding to the beginning and the difference only gets more noticeable as the list grows longer.

	System.out.println ("=====================================");
	ArrayList<Integer> B = new ArrayList<Integer>();
	
	for(int i = 0; i<100000; i++) {
	    B.add(i);
	}

	long f = System.currentTimeMillis ();
	
	for (int i = 0; i < B.size (); i ++) {
	    B.remove (0);
	}

	long g = System.currentTimeMillis ();
	System.out.println (g - f);
	//2294


	B.clear ();
	for(int i = 0; i<100000; i++) {
	    B.add(i);
	}

	long h = System.currentTimeMillis ();
	
	for (int i = 0; i < B.size (); i ++) {
	    B.remove (B.size () - 1 - i);
	}

	long j = System.currentTimeMillis ();
	System.out.println (j - h);

	//644

	//removing from the end of the list is faster

	System.out.println ( "=========================");
	ArrayList<Integer> C = new ArrayList<Integer>();
	
	for(int i = 0; i<A.size(); i++) {
	    C.add(A.get(A.size ()- 1 - i));
	}

	
	//	System.out.println (C);
	

	
    
    }
}

