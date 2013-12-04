import java.io.*;
import java.util.*;

public class ArrayStuff {
    private int[] a;
    private Random r;
    
    public ArrayStuff() {
	r = new Random();
	a = new int[20];
	for (int i=0;i<a.length;i++)
	    a[i]=r.nextInt(100);
    }

    public String toString() {
	return Arrays.toString(a);
    }

    public int get(int n) {
	return a[n];
    }
    
    public int findMaxIndex() {
	int maxi = 0;
	for (int i=0;i<a.length;i++) {
	    if (a[i]>a[maxi])
		maxi=i;
	}
	return maxi;

    }


    public int find(int n) {
	for (int i=0;i<a.length;i++) {
	    if (a[i]==n)
		return i;
	}
	return -1;
    }

	public double mean() {
		double s = 0.0;
		for (int i=0;i<a.length;i++)
			s = s + a[i];
		return s/a.length;
	}

	public double mean2(double[] d) {
		double s = 0.0;
		for (int i=0;i<d.length;i++)
			s = s + d[i];
		return s/d.length;
	}

	public double stddev() {
		double m = mean();
		double[] x = new double[a.length];
		ArrayStuff as = new ArrayStuff();
		for (int i=0;i<x.length;i++) {
			double b = (a[i] - m);
			x[i] = b*b;}
		m = as.mean2(x);
		return Math.sqrt(m);
	}

}






















