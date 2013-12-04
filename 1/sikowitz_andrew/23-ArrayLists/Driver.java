import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {

	//part 1
	ArrayList<String> a = new ArrayList<String>();
	int n = Integer.parseInt(args[0]);
	long t = System.currentTimeMillis();
	for (int i=0; i<n; i++)
	    a.add("x");

	t = System.currentTimeMillis() - t;
	System.out.println("Added to End: " + t);

	a = new ArrayList<String>();
	t = System.currentTimeMillis();
	for (int i=0; i<n; i++)
	    a.add(0, "x");
    
	t = System.currentTimeMillis() - t;
	System.out.println("Added to Front: " + t);

	//Adding to end was faster, by a lot: 3-34 at size 10000
    
	//part 2
	ArrayList<String> b = new ArrayList<String>(a); //Copies a into b
	t = System.currentTimeMillis();
	for (int i=0; i<n; i++)
	    a.remove(0);

	t = System.currentTimeMillis() - t;
	System.out.println("Removed from Front: " + t);

	t = System.currentTimeMillis();
	for (int i=0; i<n; i++)
	    b.remove(b.size()-1);

	t = System.currentTimeMillis() - t;
	System.out.println("Removed from End: " + t);

	//Removing from end was faster, by even more: 2-41 at size 10000

	//part 3
	
	ArrayList<Integer> c = new ArrayList<Integer>();
	for (int i=0; i<n; i++)
	    c.add(i);

	System.out.println("Original List: " + c);
	t = System.currentTimeMillis();
	c = reverse(c);
	t = System.currentTimeMillis() - t;
	System.out.println("Reversed List: " + c);
	System.out.println("Reverse Time: " + t);

    }

    private static ArrayList<Integer> reverse(ArrayList<Integer> a) {
	ArrayList<Integer> r = new ArrayList<Integer>();
	for (int i=a.size()-1; i>=0; i--)
	    r.add(a.get(i));
    
	return r;
    }

}
