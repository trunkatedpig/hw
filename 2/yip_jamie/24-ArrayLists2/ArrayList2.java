import java.io.*;
import java.util.*;

public class ArrayList2{
    public static void main (String[] args){

	ArrayList[] buckets = new ArrayList[10];

	int digits = 4, j = 0, numItems = 10, ArrayCount = 0;
	int[] data = new int[10], tempArray = new int[numItems];
	Random r = new Random();

	for (int i = 0;i < 10; i++) 
	    buckets[i] = new ArrayList();

	for (int i = 0; i < numItems; i++)
	    data[i] = r.nextInt(9999-1000) +1000;
	System.out.println(Arrays.toString(data));

	long start = System.currentTimeMillis();
	for (int k = 0; k < digits; k++){
	    System.out.println("Digits " + k);
	    for (int i = 0; i < data.length; i++) {
		j = (int)((data[i] / (Math.pow(10, k))) % 10);
		buckets[j].add(data[i]);
	    }

	    for (int i = 0; i < 10; i ++){
		for (int n = 0; n <buckets[i].size(); n++){
		    tempArray[ArrayCount] = (int) buckets[i].get(n);
		    ArrayCount++;
		}
	    }
	    
	    for (int i = 0;i < 10; i++) 
		buckets[i] = new ArrayList();
	    
	    data = tempArray;

	    System.out.println(Arrays.toString(data));

	}    

	long end = System.currentTimeMillis();
        System.out.println ( end  - start );

        start = System.currentTimeMillis();
        Arrays.sort ( data );
        end = System.currentTimeMillis();
        System.out.println ( end  - start );
    }
}
