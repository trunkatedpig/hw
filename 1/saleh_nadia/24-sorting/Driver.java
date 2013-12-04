import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String [] args) {
	Sorter s = new Sorter();
	int[] a = new int[20];
	Random r = new Random();
	for (int i = 0; i <20; i ++) {
	    a[i] = r.nextInt(8999)+1000;//gives us random numbers 1000-9999
	}
	
    }
    public static int[] sort(int[] i){
	int n;
	int length = String.valueOf(i[0]).length();
	ArrayList[] buckets = new ArrayList[i.length];
	for (int a=0; a<i.length; a++){
	    buckets[a] = new ArrayList<Integer>();
	}
	for(n=0; n<length; n ++){
	    for (int a=0; a<i.length; a++){
		int d = (i[a] / Math.pow(10,n)) % 10;
		buckets[d].add(i[a]);
	    }
	    for (int a=0; a<i.length; a++){
		
	    }
	}
    }
}