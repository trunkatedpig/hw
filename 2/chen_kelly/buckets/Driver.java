import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
	long start;

	//makes new set of buckets
	ArrayList[] buckets = new ArrayList[10];
	for(int m = 0; m<10; m++)
	    buckets[m] = new ArrayList();

	//fills int array a  with random ints
	int[] a = new int[100000];
	Random r = new Random();
	for(int n = 0; n < a.length; n++){
	    a[n] = r.nextInt(999);
	    //    System.out.println(a[n]);
	}
     
	start = System.currentTimeMillis();

       	for(int k = 0; k<=2 ; k++){ 
	    for(int i = 0; i < a.length; i++){
		int val = (int)((a[i] / Math.pow(10,k)) % 10);
		buckets[val].add(a[i]);
	   
		int j = 0;
		for (int z = 0; z < 10; z++){
		    for(int count = 0;count < buckets[z].size(); count++){
			a[j] = (Integer)(buckets[z].get(count));
			j++;
		    }
		}
	    }
	    for(int m = 0; m<10; m++)
		buckets[m] = new ArrayList();
	}
	System.out.println("Radixsort: " + (System.currentTimeMillis()-start));
	//	System.out.println("---------------------------------");
	//	for(int n = 0; n < a.length; n++)
	//	    System.out.println(a[n]);

	start = System.currentTimeMillis();
	Arrays.sort(a);
	System.out.println("built in sort: " + (System.currentTimeMillis()-start));
	
    }
}
