import java.io.*;
import java.util.*;

public class Sorting {

    public static void main(String[] args){
	Sorting s = new Sorting();

	Random r = new Random();
	int[] a = new int[10000];
	for (int i = 0; i <10000; i ++) {
	    a[i] = r.nextInt(899)+100;
	}
	int[] b = new int[100000];
	for (int i = 0; i <100000; i ++) {
	    b[i] = r.nextInt(899)+100;
	}
	int[] c = new int[1000000];
	for (int i = 0; i <1000000; i ++) {
	    c[i] = r.nextInt(899)+100;
	}
	int[] g = new int[10000];
	for (int i = 0; i <10000; i ++) {
	    g[i] = r.nextInt(899)+100;
	}
	int[] h = new int[100000];
	for (int i = 0; i <100000; i ++) {
	    h[i] = r.nextInt(899)+100;
	}
	int[] i = new int[1000000];
	for (int n = 0; n <1000000; n ++) {
	    i[n] = r.nextInt(899)+100;
	}

	
	long t = System.currentTimeMillis();
	s.bsort(a);
	System.out.println(System.currentTimeMillis()-t);
	t = System.currentTimeMillis();
	s.radixSort(a);
	System.out.println(System.currentTimeMillis()-t);
	t = System.currentTimeMillis();
	s.bsort(b);
	System.out.println(System.currentTimeMillis()-t);
	t = System.currentTimeMillis();
	s.radixSort(b);
	System.out.println(System.currentTimeMillis()-t);
	t = System.currentTimeMillis();
	s.bsort(c);
	System.out.println(System.currentTimeMillis()-t);
	t = System.currentTimeMillis();
	s.radixSort(c);
	System.out.println(System.currentTimeMillis()-t);
	t = System.currentTimeMillis();
	s.bsort(g);
	System.out.println(System.currentTimeMillis()-t);
	t = System.currentTimeMillis();
	s.radixSort(g);
	System.out.println(System.currentTimeMillis()-t);
	t = System.currentTimeMillis();
	s.bsort(i);
	System.out.println(System.currentTimeMillis()-t);
	t = System.currentTimeMillis();
	s.radixSort(i);
	System.out.println(System.currentTimeMillis()-t);
    }

	

    public int[] bsort(int[] a){
	int swaps = 0;
	int checks = 0;
	
	for(int b=0; b<a.length-1; b++){
	    for(int c = 0; c<a.length-b-1; c++){
		if (a[c] > a[c+1]){
		    int tmp = a[c];
		    a[c] = a[c+1];
		    a[c+1] = tmp;
		    swaps++;
		}
		checks++;
	    }
	}
	System.out.println(swaps);
	System.out.println(checks);
	return a;
    }
    
    
    public static int exp(int i, int n){//lolwut
	int result = 1;
	for (int a = 0; a<n; a++){
	    result = result * i;
	}
	return result;
    }
    public int[] radixSort(int[] i){
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
    
}

