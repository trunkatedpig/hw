import java.util.*;
import java.io.*;

public class arrays {
    public static void main(String[] args){
	ArrayList<Integer> a = new ArrayList<Integer>();
	Random r = new Random();
    
	long start = System.currentTimeMillis();
	for(int i=0;i<10000;i++)
	    a.add(r.nextInt(2000));
	long end = System.currentTimeMillis();
	System.out.println("normal add time: " + (end - start));

	ArrayList<Integer> b = new ArrayList<Integer>();
	long start2 = System.currentTimeMillis();
	for(int i=0;i<10000;i++)
	    a.add(i,r.nextInt(2000));
	long end2 = System.currentTimeMillis();
	System.out.println("position add time: " + (end2 - start2));
	
	//Normal add time is shorter
    }
}