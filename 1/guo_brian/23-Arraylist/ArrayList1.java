import java.io.*;
import java.util.*;

public class ArrayList1 {
    
    public static void main (String[] args) {
	ArrayList <Integer> intlist = new ArrayList <Integer> ();
	long start = System.currentTimeMillis();
	for (int i = 0; i < 100000; i++)
	    intlist.add(i);
	long checkpoint = System.currentTimeMillis();
	System.out.println(checkpoint - start);
	for (int x = 0; x < 100000; x++)
	    intlist.add(5,5);
	long end = System.currentTimeMillis();
	System.out.println(end - checkpoint);
    }
}
