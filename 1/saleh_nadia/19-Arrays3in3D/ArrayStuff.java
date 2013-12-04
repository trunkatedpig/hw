import java.util.*;
import java.io.*;

public class ArrayStuff{
    private int[] a;
    private Random r = new Random();
    public ArrayStuff() {
	a=new int[20];
	for (int i=0;i<a.length;i++) {
	    a[i]=r.nextInt(100);
	}
    }

    public String toString() {
	return Arrays.toString(a);
    }

    // return the index of the max element
    public int findMaxIndex() {
	if (a==null || a.length==0) 
	    return -1;

       	int maxi = 0;
	for (int i=0;i<a.length;i++) {
	    if (a[i] > a[maxi])
		maxi = i;
	}
	return maxi;
    }

    public int get(int n) {
	if (n>=0 && n < a.length) 
	    return a[n];
	else
	    return -1;
    }
    public int find(int n) {
	for (int i=0;i<a.length;i++) {
	    if (a[i]==n)
		return i;
	}
	return -1;
    }
    public double mean() {
	double sum = 0;
	for (int i = 0; i<a.length; i ++) {
	    sum += a[i];
	}
	return sum/(a.length + 0.0);
    }
    
    public double mean2 (double [] a) {
	double sum = 0;
	for (int i = 0; i<a.length; i ++) {
	    sum += a[i];
	}
	return sum/(a.length + 0.0);
    }

    public double stddev() {
	double b = mean();
	double [] c = new double [a.length];
	for (int x = 0; x<a.length;x ++) {
	    c[x] = Math.pow(a[x] - b,2);
	}
	double d = mean2(c);
	return Math.pow(d, 0.5);

    }
}


