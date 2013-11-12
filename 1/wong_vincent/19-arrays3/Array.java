import java.util.*;
import java.io.*;

public class ArrayStuff {
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

    // mean and standard deviation

    public double mean (double[] d) {
	double x = 0;
	double y = 0;

	for(int a = 0; a<d.length; a++) {
	    x = x + d[a];
	}
	
	y = x / d.length;

	return y;
    }

    public double stdDev () {
	double x = mean(a);
	double[] b = new double[a.length];

	for(int i = 0; i<b.length; i++) {
	    b[i] = (a[i]-x)*(a[i]-x);
	}

	double y = Math.sqrt(mean(b));

	return y;
    }
}

