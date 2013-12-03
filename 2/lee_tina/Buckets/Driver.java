import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){

	//makes new set of buckets
	ArrayList[] buckets = new ArrayList[10];
	for(int i = 0; i<10; i++)
	    buckets[i] = new ArrayList();

	//fills int array a  with random ints
	int[] a = new int[10];
	Random r = new Random();
	for(int i = 0; i < a.length; i++){
	    a[i] = r.nextInt(9999);
	    System.out.println(a[i]);
	}
     
	public void sort(int n){
	    for(int i = 0; i < a.length; i++){
		int val = (a[i] / Math.pow(10,n)) % 10;
		buckets[val].add(a[i]);
	    }
	    int j = 0;
	    for (int i = 0; i < buckets.size(); i++){
		int count = 0;
		while (buckets[i].get(count) != "null"){
		    a[j] = (Integer)(buckets[i].get(count));
		    j++;
		}
	
	    }
	}
	
	System.out.println(a.sort(1));
    }
}