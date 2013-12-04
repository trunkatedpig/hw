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

    // HW Section

    public double mean (int[] t) {
	int x = 0;
	double y = 0;

	for(int i = 0; i<t.length; i++) {
	    x = x + t[i];
	}
	
	y = x / t.length;

	return y;
    }

    public double meanDouble (double[] d) {
	double x = 0;
	double y = 0;

	for(int i = 0; i<d.length; i++) {
	    x = x + d[i];
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

	double y = Math.sqrt(meanDouble(b));

	return y;
    }

    public int[] retArray () {
	return a;
    }

}


