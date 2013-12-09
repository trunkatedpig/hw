import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	
	  ArrayList<String> beginning = new ArrayList<String>();
	  ArrayList<String> end = new ArrayList<String>();
	
	  // Comparing al.add("x") and al.add(0,"x")
	  long start = System.currentTimeMillis();

	  for (int i = 0; i < 100000; i++) {
	  beginning.add(0,"x");
	  }

	  System.out.println("Adding to beginning: " + (System.currentTimeMillis() - start));

	  start = System.currentTimeMillis();

	  for (int i = 0; i < 100000; i++) {
	  end.add("x");
	  }

	  System.out.println("Adding to end: " + (System.currentTimeMillis() - start));
	

	  // Comparing a.remove("x") and a.remove(0)
	  start = System.currentTimeMillis();

	  for (int i = 0; i < beginning.size(); i++) {
	  beginning.remove(0);
	  }

	  System.out.println("Removing from beginning: " + (System.currentTimeMillis() - start));

	  start = System.currentTimeMillis();

	  for (int i = 0; i < beginning.size(); i++) {
	  end.remove("x");
	  }

	  System.out.println("Removing from end: " + (System.currentTimeMillis() - start))
	
	// ArrayList reverse method!

	public void reverse() {
	    ArrayList<Integer> temp = new ArrayList<Integer>();
	    for (int i = a.size() - 1; i >= 0; i--) {
		temp.add(a.get(i));
	    }
	    a = temp;
	}	

    }	
	
}
