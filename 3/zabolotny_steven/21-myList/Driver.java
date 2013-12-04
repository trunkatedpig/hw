import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	MyList m = new MyList(5);
	for (int i = 0;i < 11;i++) {
	    m.add((int)(Math.random() * 10));
	}
	System.out.println("Original Array: " + m);
	m.remove(3);
	System.out.println("3rd Element Removed: " + m);
	m.insert(5,9);
	System.out.println("9 Inserted in 5th Element: " + m);
    }
}