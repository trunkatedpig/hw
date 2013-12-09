import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
	int times = 10;
	ArrayList<Integer> a1,a2,a3,temp;
	//Adding elements to the end of our list:
	//100:1
	//1000:1
	//10000:6
	//100000:21
	//1000000:44
	a1 = new ArrayList<Integer>();
	long start = System.currentTimeMillis();
	for (int i = 0; i < times; i++) {
	    a1.add(3);
	}
	long stop = System.currentTimeMillis();
	System.out.println("It took " + (stop-start) +  " milliseconds to add " + times + " elements to the end.");
	
	//Adding elements to the beginning of our list:
	//100:0
	//1000:1
	//10000:42
	//100000:3362
	//1000000:A long time
	a2 = new ArrayList<Integer>();
	 start = System.currentTimeMillis();
	for (int i = 0; i < times; i++) {
	    a2.add(0,3);
	}
        stop = System.currentTimeMillis();
	System.out.println("It took " + (stop-start) +  " milliseconds to add " + times + " elements to the beginning.");
	
	//Removing elements from the end of our list:
	//100:0
	//1000:1
	//10000:5
	//100000:8
	//1000000:20
        start = System.currentTimeMillis();
	for (int i = 0; i < times; i++) {
	    a1.remove(a1.size()-1);
	}
	stop = System.currentTimeMillis();
	System.out.println("It took " + (stop-start) +  " milliseconds to remove " + times + " elements to from end.");

	//Removing elements from the beginning of our list:
	//100:0
	//1000:1
	//10000:40
	//100000:4119
	//1000000:a long time
        start = System.currentTimeMillis();
	for (int i = 0; i < times; i++) {
	    a2.remove(0);
	}
        stop = System.currentTimeMillis();
	System.out.println("It took " + (stop-start) +  " milliseconds to remove " + times + " elements from the beginning.");

	//Reversing our list:
	a3 = new ArrayList<Integer>();
	Random r = new Random();
	for (int i = 0; i < a3.size(); i++) {
	    a3.add(i,r.nextInt(100));
	}
	System.out.println("List before:" + a3.toString());
	temp = new ArrayList<Integer>(a3.size());
	int j = a3.size()-1;
	for (int i = 0; i < a3.size(); i++) {
	    int w = a3.get(j);
	    temp.add(i,w);
	}
	a3 = temp;
	System.out.println("List after:" + a3.toString());
    }
}

        
	
