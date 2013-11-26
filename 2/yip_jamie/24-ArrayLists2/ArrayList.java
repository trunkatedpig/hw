import java.util.*;
import java.io.*;

public class ArrayList{
    public static void main (String[] args){
	ArrayList[] buckets = new ArrayList[10];
	for (int i =0;i < 10;i++) 
	    buckets[i] = new ArrayList();

	int[] data = new int[10];
	Random r = new Random();
	for (int i = 0; i < 10; i++){
	    data[i] = r.nextInt(9999);
	}
	/*
	int n = 0;
	for (int i = 0;i < data.length;i++) {
	    ((data[i] / Math.pow(10, n)) % 10);
	}
	*/
	System.out.println(Arrays.toString(data));
	
	
	    
    }
}