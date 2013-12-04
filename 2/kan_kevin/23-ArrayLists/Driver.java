import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String args[]){
	ArrayList<String> a = new ArrayList<String>();
	ArrayList<String> b = new ArrayList<String>();
	long start = System.currentTimeMillis();
	long t;
	//(1) Comparing the Adds
	for (int i = 0; i < 100000; i++){
	    a.add("x");
	}
        t = System.currentTimeMillis() - start;
	System.out.println("add to end: " + t);
	//-----------------------------------------------------
        start = System.currentTimeMillis();
	for (int i = 0; i<100000; i++){
	    b.add(0, "x");
	}
        t = System.currentTimeMillis() - start;
        System.out.println ( "add to beginning: " + t );

	/*
	  Results:
	  add to end: 15
	  add to beginning: 15266
	*/

	//(2) Comparing the Removes
        start = System.currentTimeMillis();
	for (int i = 0; i<100000; i++){
	    a.remove(0);
	}
        t = System.currentTimeMillis() - start;
        System.out.println ( "remove from beginning: " + t );
	//-----------------------------------------------------
        start = System.currentTimeMillis();
	for (int i = 0; i<100000; i++){
	    b.remove(b.size() - 1);
	}
        t = System.currentTimeMillis() - start;
        System.out.println ( "remove from end: " + t );

	/*
	  Results:
	  remove from beginning: 13031
	  remove from end: 0
	*/

	//(3) Reverse-reverse!
        ArrayList <Integer> c = new ArrayList <Integer> ();
        for (int i = 0 ; i < 100 ; i++ ){
            c.add(i);
	}
	ArrayList <Integer> reversed = new ArrayList <Integer> ();
        for (int i = 0; i < c.size(); i++){
	    reversed.add(c.get(c.size()- 1 - i));
	}
	System.out.println(reversed.toString());
	
    }
}
	
