import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String [] args) {
	Sorter s = new Sorter();
	int[] a = new int[10];
	Random r = new Random();
	for (int i = 0; i <10; i ++) {
	    a[i] = r.nextInt(8999)+1000;//gives us random numbers 1000-9999
	}
	System.out.println(Arrays.toString(sort(a)));
    }

    public static int[] sort(int[] i){
	int n;
	int length = String.valueOf(i[0]).length();
	ArrayList[] buckets = new ArrayList[i.length];
	for (int a=0; a<i.length; a++){
	    buckets[a] = new ArrayList<Integer>();
	}
	for(n=0; n<length; n++){
	    for (int a=0; a<i.length; a++){
		int d = (i[a] / exp(10,n)) % 10;
		buckets[d].add(i[a]);
	    }
	    int c=0;
	    for (int a=0; a<buckets.length; a++){
		int b=0;
		while (b < buckets[a].size()){
		    i[c]=(Integer)buckets[a].get(b);
		    b++;
		    c++;
		}
	    }
	    for (int a=0; a<i.length; a++){
		buckets[a] = new ArrayList<Integer>();
	    }
	}
	return i;
    }

    public static int exp(int i, int n){//lolwut
	int result = 1;
	for (int a = 0; a<n; a++){
	    result = result * i;
	}
	return result;
    }
}