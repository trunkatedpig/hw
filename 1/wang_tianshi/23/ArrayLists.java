import java.util.*;
import java.io.*;

public class ArrayLists{
    public static void main (String[] args){

	ArrayList <Integer> a = new ArrayList <Integer>();
	

	//Part 1
	System.out.println("Testing add time:");

        long start = System.currentTimeMillis();
	for (int i=0;i<100;i++)
	    a.add(i);	
        long end = System.currentTimeMillis();
	System.out.println("a.add(i) for i<100 took: " + (end-start) + " ms.");

        start = System.currentTimeMillis();
	for (int i=0;i<100;i++)
	    a.add(0,i);	
        end = System.currentTimeMillis();
	System.out.println("a.add(0,i) for i<100 took: " + (end-start) + " ms.");

        start = System.currentTimeMillis();
	for (int i=0;i<1000;i++)
	    a.add(i);	
        end = System.currentTimeMillis();
	System.out.println("a.add(i) for i<1000 took: " + (end-start) + " ms.");

        start = System.currentTimeMillis();
	for (int i=0;i<1000;i++)
	    a.add(0,i);	
        end = System.currentTimeMillis();
	System.out.println("a.add(0,i) for i<1000 took: " + (end-start) + " ms.");

        start = System.currentTimeMillis();
	for (int i=0;i<10000;i++)
	    a.add(i);	
        end = System.currentTimeMillis();
	System.out.println("a.add(i) for i<10000 took: " + (end-start) + " ms.");

        start = System.currentTimeMillis();
	for (int i=0;i<10000;i++)
	    a.add(0,i);	
        end = System.currentTimeMillis();
	System.out.println("a.add(0,i) for i<10000 took: " + (end-start) + " ms.");
	//a.add(0,i) begins taking longer than a.add(i) at around i=1000.

	//Part 2
	System.out.println("Testing remove time:");

        start = System.currentTimeMillis();
	for (int i=0;i<100;i++)
	    a.remove(0);	
        end = System.currentTimeMillis();
	System.out.println("a.remove(0) for i<100 took: " + (end-start) + " ms.");

        start = System.currentTimeMillis();
	for (int i=0;i<100;i++)
	    a.remove(a.size()-1);	
        end = System.currentTimeMillis();
	System.out.println("a.remove(size()-1) for i<100 took: " + (end-start) + " ms.");

        start = System.currentTimeMillis();
	for (int i=0;i<1000;i++)
	    a.remove(0);	
        end = System.currentTimeMillis();
	System.out.println("a.remove(0) for i<1000 took: " + (end-start) + " ms.");

        start = System.currentTimeMillis();
	for (int i=0;i<1000;i++)
	    a.remove(a.size()-1);	
        end = System.currentTimeMillis();
	System.out.println("a.remove(size()-1) for i<1000 took: " + (end-start) + " ms.");
	//removing from the beginning of the arraylist takes way longer.

	//Part 3
	System.out.println("Reverse");
	ArrayList <Integer> a2 = new ArrayList <Integer>();
	for (int i =0; i<50; i++)
	    a2.add((int)(Math.random()*100));


	ArrayList <Integer> ans = new ArrayList <Integer>();
	for (int i=0; i<a2.size(); i++)
	    ans.add(0,a2.get(i));
	//Test Reverse
	System.out.println(a2.toString());
	System.out.println(ans.toString());
    }
}
