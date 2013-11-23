import java.io.*;
import java.util.*;

public class Arraylist1 {
    
    public static void main (String[] args) {
	ArrayList <Integer> intlist = new ArrayList <Integer> ();
	long start = System.currentTimeMillis();
	/*for (int i = 0; i < 100000000; i++)
	    intlist.add(i);
	    long end = System.currentTimeMillis();*/
	intlist.add(5,5);
	System.out.println(end - start);
    }

}