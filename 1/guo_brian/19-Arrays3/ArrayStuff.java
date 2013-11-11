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
    	double r = 0.0;
    	int sum = 0;
    	for (int i = 0; i < a.length; i++) {
    		sum = sum + a[i];
    	}
    	r = sum / a.length;
    	return r;
    }

    public double stddev() {
    	double m = mean();
    	double n = 0.0;
    	for (int b = 0; b < a.length; b++){
    		n = n + Math.pow(a[b]-m,2);
    	}
    	double x = n / a.length;
    	double result = Math.sqrt(x);
    	return result;
    }

}


