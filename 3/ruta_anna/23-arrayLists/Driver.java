import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	System.out.println();
	System.out.println("*-* Using class ArrayList *-*");
	System.out.println();

	long start, timer;

	ArrayList<String> s1 = new ArrayList<String>();
	ArrayList<String> s2 = new ArrayList<String>();

	//Compare the speeds of the two arrayList add methods
	System.out.println("PART 1: TESTING SPEED OF ADD METHODS");
	start = System.currentTimeMillis();
	for (int i=0; i<10000000; i++)
		s1.add("Hey");
	timer = System.currentTimeMillis()-start;
	System.out.println("Time for add('x'): " + timer);
	start = System.currentTimeMillis();
		for (int i=0; i<10000000; i++)
			s2.add(i,"Hey");
	timer = System.currentTimeMillis()-start;
	System.out.println("Time for add(0,'x'): " + timer);
	System.out.println();
	/* The add("x") is gets to be significantly faster once the number
	of elements in the ArrayList becomes enormous. The reason for this is
	that add("x") only takes one parameter while add(0,"x") takes two
	parameters. There begins to be a difference in speed (a difference of 1)
	when the number of elements is 100000, but the difference in the two speeds
	greatly increases as the number of elements increases.*/


	//Compare the speeds of removing an element from the front and back of an arrayList
	System.out.println("PART 2: TESTING SPEED OF REMOVE");
		s1 = new ArrayList<String>();
		for (int i=0; i<100000; i++)
			s1.add("Hey");
		int size1 = s1.size();
		start = System.currentTimeMillis();
		for (int i=0; i<size1; i++)
			s1.remove(0);
		timer = System.currentTimeMillis()-start;
		System.out.println("Time for removing from the front: " + timer);
		s2 = new ArrayList<String>();
		for (int i=0; i<100000; i++)
			s2.add("Hey");
		start = System.currentTimeMillis();
		for (int i=s2.size()-1; i>=0; i--)
			s2.remove(i);
		timer = System.currentTimeMillis()-start;
		System.out.println("Time for removing from the back: " + timer);
		System.out.println();
	/*In a large ArrayList, it is a lot faster to remove elements from the back than to remove
	elements from the front. This is because everytime that an element is removed from the front,
	all of the other elements must shift down a spot. When an element is removed from the back, the
	ArrayList must be scanned from the beginning until it reaches the last spot, however none of the
	elements have to shift.*/

	/*Create a new ArrayList, fill it with some values, then write code to
	reverse the ArrayList*/
	System.out.println("PART 3: REVERSING AN ARRAYLIST");
		ArrayList<Integer> int1= new ArrayList<Integer>();
			for(int i=0; i<10; i++)
				int1.add(i+1);
		System.out.println("Orignial Integer ArrayList:");
		System.out.println(int1);
		ArrayList<Integer> ans = new ArrayList<Integer>();
		for (int i = int1.size()-1; i>=0; i--)
			ans.add(int1.get(i));
		int1 = ans;
		System.out.println("Reversed Integer ArrayList: ");
		System.out.println(int1);


	}
}