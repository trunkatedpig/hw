import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	ArrayList <String> a,a2,a3;
	a = new ArrayList<String>();
	a2 = new ArrayList<String>();
	a3 = new ArrayList<String>();
	ArrayList <Object> a4 = new ArrayList<Object>();
	boolean front = true;
	long start, time;

	start = System.currentTimeMillis();
	for (int i=0; i<10000;i++)
	    a.add("Hello!");
	time = System.currentTimeMillis() - start;
	System.out.println("Add Method #1: " + time + " milliseconds");

	start = System.currentTimeMillis();
	for (int i=0; i<10000;i++)
	    a2.add(i,"Hello!");
	time = System.currentTimeMillis() - start;
	System.out.println("Add Method #2: " + time + " milliseconds");
	
	//Inserting an object into a specific position takes a bit longer:
	//At 11,250,000 objects inserted (The highest amount before there's 
	//no space left), Method #1 takes about 375 milliseconds, while
	//Method #2 takes around 675 milliseconds

	start = System.currentTimeMillis();
	for (int i=0; i<a.size();i++)
	    a.remove(0);
	time = System.currentTimeMillis() - start;
	System.out.println("Remove Method #1: " + time + " milliseconds");

	start = System.currentTimeMillis();
	for (int i=a2.size(); i>0;i--)
	    a2.remove(i-1);
	time = System.currentTimeMillis() - start;
	System.out.println("Remove Method #2: " + time + " milliseconds");

	//With an arraylist with 100,000 objects, Method #1 takes about  
	//2900 milliseconds (3 seconds), while Method #2 takes almost no time

	for (int i=0; i<10000;i++)
	    a3.add("Hello!");
	start = System.currentTimeMillis();
	for (int i=a3.size(); i>0;i--) {
	    if (front) {
		a3.remove(0);
		front = false;
	    } else {
		a3.remove(i-1);
		front = true;
	    }
	}
	time = System.currentTimeMillis() - start;
	System.out.println("Remove front and back: " + time + " milliseconds");
		
	//It takes around 7500 milliseconds (7.5 seconds) to dismantle
	//an 200,000 object arraylist by alternating removing from its 
	//front and back

	for (int i=0; i<10;i++)
	    a4.add((i+1)+"");
	System.out.println(a4);
	ArrayList <Object> temp = new ArrayList <Object>();
	for (int i=a4.size(); i>0; i--)
	    temp.add(a4.get(i-1));
	a4 = temp;
	System.out.println("Reverse: " + a4);
	
    }
}

