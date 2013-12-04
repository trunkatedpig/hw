import java.io.*;
import java.util.*;

public class ArrayList2 {
    
    public static void main (String[] args) {
	ArrayList <Integer> l = new ArrayList<Integer> ();
	for (int i = 0; i < 100000; i++)
	    l.add(i);
	long start = System.currentTimeMillis();
	for (int j = 0; j < 100000; j++)
	    l.remove(0);
	long checkpoint = System.currentTimeMillis();
	System.out.println(checkpoint - start);
	for (int k = 0; k < 100000; k++)
	    l.add(k);
	start = System.currentTimeMillis();
	for (int m = 0; m < 100000; m++)
	    l.remove(l.size() - 1);
	checkpoint = System.currentTimeMillis();
	System.out.println(checkpoint - start);
    }
}
	
