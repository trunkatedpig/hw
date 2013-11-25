import java.io.*;
import java.util.*;

public class ArrayLists{
    public static void main(String[] args){
	int n = 30;   ;
	ArrayList<Integer> a = new ArrayList<Integer>(n);

	/* MUCH FASTER TO ADD AT END THAN BEGINNING
 	long t1  = System.currentTimeMillis();
	for (int i = 0; i<n;i++) { 
	    a.add(0);
	}
	long t2 = System.currentTimeMillis();
	System.out.print("Adding at end: ");
	System.out.println(t2-t1);

	long t3 = System.currentTimeMillis();
	for (int i =0; i<n; i++) {
	    a.add(0,0);
	}

	long t4 = System.currentTimeMillis();
	System.out.print("Adding at beginning: ");
	System.out.print(t4-t3);
	*/
	/* MUCH FASTER TO REMOVE AT END THAN BEGINNING 
	for (int i = 0; i<n;i++) { 
	    a.add(0);
	}
	long t1 = System.currentTimeMillis();
	for (int i =0; i<n; i++) {
	    a.remove(0);
	}
	long t2 = System.currentTimeMillis();
	System.out.print("Remove at beginning: ");
	System.out.println(t2-t1);

	for (int i = 0; i<n;i++) { 
	    a.add(0);
	}
	int s = a.size();
x	long t3 = System.currentTimeMillis();
	for (int i=s-1; i>=0; i--) {
	    a.remove(i);
	}
	long t4 = System.currentTimeMillis();
	System.out.print("Removing at end: ");
	System.out.print(t4-t3);
	*/
	
	for (int i = 0; i<n; i++) { 
	    a.add(i);
	}
	System.out.println(a);
	int i;
        int s = a.size();
	for (i=0;i<s/2;i++) { 
	    int beg = a.get(i);
	    int end = a.get(s-1-i);
	    a.set(i,end);
	    a.set(s-1-i,beg);
	}
	System.out.println(a);
    }
}
