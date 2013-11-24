import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	if (args.length != 1){
	    System.out.println("Enter the size of the ArrayList");
	    System.exit(0);
	}
	ArrayList<Integer> a = new ArrayList<Integer> ();
	int size = Integer.parseInt (args[0]);
	long start = System.currentTimeMillis();
	for (int i = 0; i < size; i ++){
	    a.add(0);
	}
	long end = System.currentTimeMillis();
	System.out.println("When adding to the end of an ArrayList of size " + size + " the time taken is:");
	System.out.println(end - start);

	ArrayList<Integer> b = new ArrayList<Integer> ();
	start = System.currentTimeMillis();
	for (int i = 0; i < size; i ++){
	    b.add(0,0);
	}
	end = System.currentTimeMillis();
	System.out.println("When adding to the beginning of an ArrayList of size " + size + " the time taken is:");
	System.out.println(end - start);

	//worked with David in class and referenced Ben's code for some help

	/*in the beginning adding at the end and at the beginning are the same, 
	  but as the number of elements in the ArrayList laregely increases the adding at the beginning becomes
	  much slower to the point that it won't even calculate the time*/


	ArrayList<Integer> c = new ArrayList<Integer>();
	for (int i = 0; i < size; i ++){
	    c.add(0);
	}
	start = System.currentTimeMillis();
	for(int i = 0; i< size; i ++){
	    c.remove(0);
	}
	end = System.currentTimeMillis();
	System.out.println("When removing from the beginning of an ArrayLit of size " + size + " the time taken is:");
	System.out.println(end - start);


	ArrayList<Integer> d = new ArrayList<Integer>();
	for (int i = 0; i < size; i ++){
	    d.add(0);
	}
	start = System.currentTimeMillis();
	for (int i = 0; i < size; i ++){
	    d.remove(d.size() - 1);
	}
	end = System.currentTimeMillis();
	System.out.println("When removing from the end of an ArrayList of size " + size + " the time taken is:");
	System.out.println(end - start);

	/*The longer the size of the ArrayList becomes the greater the difference between 
	  removing from the beginning and removing from the end of the ArrayList. It takes longer to remove from 
	  the beginning than from the end as in the case of adding to the ArrayList.*/	
	    
	ArrayList<Integer> harry = new ArrayList<Integer>();
	for (int i = 0; i < 10; i ++){
	    harry.add(i * 10);
	}
	System.out.println(harry);

	ArrayList<Integer> ron = new ArrayList<Integer>();
	ron.ensureCapacity(harry.size());
	for(int i = 0; i < harry.size(); i ++){
	    ron.add(0);
	}

	int g = harry.size() - 1;
	for(int i = 0; i < harry.size(); i ++){
	    ron.set(i,harry.get(g));
	    g = g - 1;
	}
	System.out.println(ron);
    }
}

	
