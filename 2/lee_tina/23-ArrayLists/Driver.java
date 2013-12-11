//Kelly Chen and Tina Lee

import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
	System.out.println("\n--------------------------------------------------");

	//Part 1
	ArrayList<String> end = new ArrayList<String>();
	ArrayList<String> beginning = new ArrayList<String>();
	ArrayList<Integer> intArray = new ArrayList<Integer>();

	long start = System.currentTimeMillis();
	for (int i = 0; i < 100000; i++){
	    end.add("x");
	}
	System.out.println("Adding to end: " + (System.currentTimeMillis() - start) + " milliseconds");

	start = System.currentTimeMillis();
	for (int i = 0; i < 100000; i++){
	    beginning.add(0,"x");
	}
	System.out.println("Adding to beginning: " + (System.currentTimeMillis() - start) + " milliseconds");
	//Adding to the end is much faster than adding to the beginning
	

	//Part 2
	start = System.currentTimeMillis();
	while (end.size() > 0){
	    end.remove(end.size() - 1);
	}
	System.out.println("\nRemoving from end: " + (System.currentTimeMillis() - start) + " milliseconds");

	start = System.currentTimeMillis();
	while (beginning.size() > 0){
	    beginning.remove(0);
	}
	System.out.println("Removing from beginning: " + (System.currentTimeMillis() - start) + " milliseconds\n"); 
	//Removing from the end was much faster than removing from the beginning


	//Part 3
	for(int i = 0; i< 10; i++){
	    intArray.add(i);
	}
	ArrayList<Integer> tmp = new ArrayList<Integer>();
	for(int i = intArray.size() - 1; i >= 0; i--){
	    tmp.add(intArray.get(i));
	}
	System.out.println(intArray.toString());
	System.out.println(tmp.toString());	
	System.out.println("--------------------------------------------------\n");

	
    }
}
