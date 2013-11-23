import java.util.*;

public class Driver {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
////////////////////////////////////////////////////////		
		/*
		Adding 100000 strings to the end: 15 ms
		*/
		
        long start = System.currentTimeMillis();
        int n = 100000;
        for (int i=0;i<n;i++) {
            a.add("x");
        }
        long stop = System.currentTimeMillis();
        System.out.println("Time for " + n + " additions to the end: " + (stop-start));
////////////////////////////////////////////////////////
		/*
		Adding 100000 strings to the beginning: 1534 ms
		*/
		
        a = new ArrayList<String>();
        start = System.currentTimeMillis();
        for (int i=0;i<n;i++) {
            a.add(0, "x");
        }
        stop = System.currentTimeMillis();
        System.out.println("Time for " + n + " additions to the beginning: " + (stop-start));
////////////////////////////////////////////////////////		
		/*
		Removing 100000 strings from the beginning: 997 ms
		*/
		
        a = new ArrayList<String>();
        for (int i=0;i<n;i++) {
            a.add(0, "x");
        }
        start = System.currentTimeMillis();
		for (int i=0;i<n;i++) {
			a.remove(0);
		}
		stop = System.currentTimeMillis();
        System.out.println("Time for " + n + " removals from the beginning: " + (stop-start));
////////////////////////////////////////////////////////	
		/*
		Removing 100000 strings from the end: 1 ms
		*/
		
		a = new ArrayList<String>();
        for (int i=0;i<n;i++) {
            a.add(0, "x");
        }
        start = System.currentTimeMillis();
		for (int i=0;i<n;i++) {
			a.remove(a.size()-1);
		}
		stop = System.currentTimeMillis();
        System.out.println("Time for " + n + " removals from the end: " + (stop-start));
////////////////////////////////////////////////////////
		/*
		Reversing the ArrayList
		*/
		
		a = new ArrayList<Integer>();
		for (int i=0;i<10;i++) { //10 items
            a.add(0, i);
        }
		
		b = new ArrayList<Integer>();
		a_index = a.size()-1;
		b_index = 0;
		while (b_index >=0) {
			b.set(b_index, a.get(a_index));
			a_index = a_index - 1;
			b_index = b_index - 1;
		}
		a = b;
	}
}