import java.io.*;
import java.util.*;

public class ArrayList2{
    public static void main (String[] args){

	ArrayList[] buckets = new ArrayList[10];

	int n=0, j = 0;
	int[] data = new int[10];
	Random r = new Random();

	for (int i =0;i < 10;i++) 
	    buckets[i] = new ArrayList();

	for (int i = 0; i < 10; i++)
	    data[i] = r.nextInt(9999-1000) +1000;

	for (int i = 0;i < data.length;i++) {
	    j = (int)((data[i] / (Math.pow(10, n))) % 10);
	    buckets[j].add(data[i]);
	}


	System.out.println(Arrays.toString(data));
	
	System.out.println(Arrays.toString(buckets));
	
	    
    }
}

//Run timing test compared Array.sort