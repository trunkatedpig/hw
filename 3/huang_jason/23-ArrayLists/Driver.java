import java.util.*;
import java.io.*;

public class Driver{

    public static void main(String[] args){

        // ArrayLists b = new ArrayLists();

	ArrayList<Object> c = new ArrayList<Object>();

        // long start1, time1, start2, time2;
	// int input = Integer.parseInt(args[0]);

	/*

	  b.addTest(input);
	  start1 = System.currentTimeMillis();
	  b.removeBackTest();
	  time1 = System.currentTimeMillis() - start1;
	  System.out.println(time1);
	
	  b.addTest(input);
	  start2 = System.currentTimeMillis();
	  b.removeFrontTest();
	  time2 = System.currentTimeMillis() - start2;
	  System.out.println(time2);

	*/

	for(int i=0; i<10; i++){
	    c.add(i);
	}

	System.out.println(c);

	ArrayList<Object> reverse = new ArrayList<Object>();
	for(int i=0; i<c.size(); i++){
	    reverse.add(i,c.get((c.size()-1)-i));
	}
	
	System.out.println(reverse);

	/*
	  addTest
	  100:1
	  1000:1
	  10000:7
	  100000:18
	  1000000:69

	  insertTest
	  100:0
	  1000:1
	  10000:45
	  100000:3663
	  1000000:took too long to finish

	  --> adding is faster than inserting

	  removeFrontTest
	  100:0
	  1000:1
	  10000:17
	  100000:1036
	  1000000:took too long to finish

	  removeBackTest
	  100:0
	  1000:0
	  10000:2
	  100000:7
	  1000000:12

	  --> removing from back is faster than removing from front

	*/

	/*
	  
	  Original: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
	  Reversal: [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

	*/

    }
}