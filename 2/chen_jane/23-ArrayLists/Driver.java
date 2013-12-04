import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
	ArrayList<Integer> n = new ArrayList<Integer>();
	
	/*
	  PART ONE:
	  long time1,time2,time3;
	  time1 = System.currentTimeMillis();
	  for(int i=0; i<200000; i++) {
	  n.add(0,i);
	  }
	  time2 = System.currentTimeMillis();
	  for (int i=0; i<200000; i++) {
	  n.add(i);
	  }
	  time3 = System.currentTimeMillis();

	  System.out.println(time2 - time1);
	  System.out.println(time3 - time2);

	  ~~~~~~~~~~~ RESULTS ~~~~~~~~~~~
	  Add to beginning:
	  1000 nums --> 1 millisec
	  10000 nums --> 38 millisec
	  100000 nums --> 3945 millisec
	  200000 nums --> 20552 millisec

	  Add to end:
	  1000 nums --> 0 millisec
	  10000 nums --> 1 millisec
	  100000 nums --> 13 millisec
	  200000 nums --> 18 millisec

	  CONCLUSION: adding to the end is faster than adding to the beginning
	*/

	/*
	  PART TWO:
	  long time1,time2;

	  for(int i=0; i<1000; i++) {
	  n.add(i);
	  }
	  time1 = System.currentTimeMillis();
	  while (n.isEmpty() == false) {
	  n.remove(0);
	  }
	  time2 = System.currentTimeMillis();
	  System.out.println(time2-time1);


	  for(int i=0; i<10000000; i++) {
	  n.add(i);
	  }
	  time1 = System.currentTimeMillis();
	  while (n.isEmpty() == false) {
	  n.remove(n.size()-1);
	  }
	  time2 = System.currentTimeMillis();
	  System.out.println(time2-time1);


	  ~~~~~~~~~~~ RESULTS ~~~~~~~~~~~
	  Remove from beginning:
	  1000 nums --> 1 millisec
	  10000 nums --> 42 millisec
	  100000 nums --> 4288 millisec
	  200000 nums --> 22723 millisec
	  1000000 nums --> too long to test
	  10000000 nums --> too long to test

	  Remove from end:
	  1000 nums --> 0 millisec
	  10000 nums --> 1 millisec
	  100000 nums --> 1 millisec
	  200000 nums --> 2 millisec
	  1000000 nums --> 10 millisec
	  10000000 nums --> 110 millisec

	  CONCLUSION: removing from end is faster than removing from the beginning by far
	*/

	// PART THREE: REVERSE LSIT
	for (int i=0; i<10; i++) {
	    n.add(i*10);
	}
	System.out.println("Original list: " + n);

	ArrayList<Integer> tmp = new ArrayList<Integer>(); 
	for (int i=n.size(); i>0; i--) {
	    tmp.add(n.get(i-1));
	}
	n = tmp;
	System.out.println("Reversed list: " + n);
    }    
}
