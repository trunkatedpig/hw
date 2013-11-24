import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	MyList m = new MyList(5);
	for (int i = 0;i < 11;i++) {
	    m.add((int)(Math.random() * 10));
	}
	System.out.println("Original Array: " + m);
	m.add(4);
	System.out.println("4 Added: " + m);
	m.set(2,5);
	System.out.println("5 Set As 2nd Index: " + m);
	m.remove(3);
	System.out.println("3rd Index Removed: " + m);
	m.add(5,9);
	System.out.println("9 Inserted in 5th Index: " + m);
	m.fremove(7);
	System.out.println("First Instance of 7 Removed: " + m);
	System.out.println(Arrays.toString(m.rewrite(m)));
	System.out.println("Values of Final List: \nSize: " + m.size() + "\nFull?: " + m.isFull() + "\n0th Index: " + m.get(0));
    }
}