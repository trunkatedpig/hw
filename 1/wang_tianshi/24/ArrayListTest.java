import java.util.*;
import java.io.*;

public class ArrayListTest{
    public static void main (String[] args){

	ArrayList <Integer> a = new ArrayList <Integer>();
	
	long start=System.currentTimeMillis();
	
	for (int i=0;i<10000000;i++){
	    a.add(i);
	}
	
	long end = System.currentTimeMillis();
	
	System.out.println("Took: " + (end-start) + " milliseconds.");
    }
}