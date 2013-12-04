import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	ArrayList<Integer> a1,a2,a3,a4;
	//100:0
	//1000:2
	//10000:8
	//100000:23
	//1000000:47
	a1 = new ArrayList<Integer>();
	long start, t;
	start = System.currentTimeMillis();
	for (int i = 0; i < 1000; i++) {
	    a1.add(3);
	}
	t = System.currentTimeMillis() - start;
	System.out.println("It took " + (t) +  " milliseconds to add to the end");
	//100:0
	//1000:3
	//10000:39
	//100000:5423
	a2 = new ArrayList<Integer>();
	start = System.currentTimeMillis();
	for (int i = 0; i < 1000; i++) {
	    a2.add(0,3);
	}
        t = System.currentTimeMillis() - start;
	System.out.println("It took " + (t) +  " milliseconds to add to the beggining");
	
	//Removing elements from the end of our list:
	//100:0
	//1000:1
	//10000:9
	//100000:11
	//1000000:38
        start = System.currentTimeMillis();
	for (int i = 0; i < 1000; i++) {
	    a1.remove(a1.size()-1);
	}
         t = System.currentTimeMillis() - start;
	System.out.println("It took " + (t) +  " milliseconds to remove from the end");

	//Removing elements from the beginning of our list:
	//100:0
	//1000:3
	//10000:44
	//100000:4972
	//1000000: Java failed me
        start = System.currentTimeMillis();
	for (int i = 0; i < 1000; i++) {
	    a2.remove(0);
	}
        t = System.currentTimeMillis() - start;
	System.out.println("It took " + (t) +  " milliseconds to remove from the begging");

	a3 = new ArrayList<Integer>();
	Random r = new Random();
	int q = 100;
	for (int i = 0; i < q; i++) {
	    a3.add(i,r.nextInt(1000));
	}
	System.out.println("Originally:" + a3.toString());
	a4 = new ArrayList<Integer>(a3.size());
	for (int i = 0; i < q; i++) {
	    int w = a3.get(q - 1 -i);
	    a4.add(i,w);
	}
	a3 = a4;
	System.out.println("Reversed:" + a3.toString());
    }
}
