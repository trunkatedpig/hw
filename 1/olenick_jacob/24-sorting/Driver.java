import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String [] args) {
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
	long[] d = new long[10000];
	for (int i = 0; i <10000; i ++) {
	    d[i] = r.nextLong();
	}
	long[] e = new long[100000];
	for (int i = 0; i <100000; i ++) {
	    e[i] = r.nextLong();
	}
	long[] f = new long[1000000];
	for (int i = 0; i <1000000; i ++) {
	    f[i] = r.nextLong();
	}
	int[] A = new int[10000];
	for (int i = 0; i <10000; i ++) {
	    A[i] = r.nextInt(899)+100;
	}
	int[] B = new int[100000];
	for (int i = 0; i <100000; i ++) {
	    B[i] = r.nextInt(899)+100;
	}
	int[] C = new int[1000000];
	for (int i = 0; i <1000000; i ++) {
	    C[i] = r.nextInt(899)+100;
	}
	long[] D = new long[10000];
	for (int i = 0; i <10000; i ++) {
	    D[i] = r.nextLong();
	}
	long[] E = new long[100000];
	for (int i = 0; i <100000; i ++) {
	    E[i] = r.nextLong();
	}
	long[] F = new long[1000000];
	for (int i = 0; i <1000000; i ++) {
	    F[i] = r.nextLong();
	}
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