import java.io.*;
import java.util.*;

// The first add method, the one that accepts only an integer as a parameter, ran much faster than the second one//

// Remove is faster when you remove an object from the end of a list rather than the beginning//

public class Driver {

    public static void main(String[] args) {
	ArrayList<Integer> l = new ArrayList<Integer>();
	for (int i = 0; i< 1000; i++) {
	    l.add(i);
	}
	ArrayList<Integer> m = new ArrayList<Integer>();
	for (int i = l.size()-1; i >=0; i--) {
	    m.add(l.get(i));
	}
	l = m;
	System.out.println(Arrays.toString(m.toArray()));
    }
}

	
