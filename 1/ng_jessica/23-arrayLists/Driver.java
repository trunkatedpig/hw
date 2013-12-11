import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args){

	long b = System.currentTimeMillis()
	
	ArrayList<Integer> a = new ArrayList<Integer>();
	int n = Integer.parseInt(args[0]);
	long t = System.currentTimeMillis();
	for (int i=0; i<n; i++)
	    a.add("x");

	t = b - t;
	System.out.println(t);

	a = new ArrayList<String>();
	b = System.currentTimeMillis();
	for (int i=0; i<n; i++)
	    a.add(0, "x");
    
	t = b - t;
	System.out.println(t);

	//It's faster to add to the end. 
    
	//part 2
	ArrayList<String> c = new ArrayList<String>(a); 
	t = System.currentTimeMillis();
	for (int i=0; i<n; i++)
	    a.remove(0);

	t = System.currentTimeMillis() - t;
	System.out.println(t);

	t = System.currentTimeMillis();
	for (int i=0; i<n; i++)
	    c.remove(c.size()-1);

	t = System.currentTimeMillis() - t;
	System.out.println (t);

	//It's faster to remove the end

	//part 3
	
	ArrayList<Integer> d = new ArrayList<Integer>();
	for (int i=0; i<n; i++)
	    d.add(i);

	System.out.println(d);
	t = System.currentTimeMillis();
	c = reverse(c);
	t = System.currentTimeMillis() - t;
	System.out.println(d);
	System.out.println(d);

    }

    private static ArrayList<Integer> reverse(ArrayList<Integer> a) {
	ArrayList<Integer> r = new ArrayList<Integer>();
	for (int i=a.size()-1; i>=0; i--)
	    r.add(a.get(i));
    
	return r;
    }

}
