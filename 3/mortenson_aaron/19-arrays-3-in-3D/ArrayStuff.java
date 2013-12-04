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
	int sum = 0;
	for (int i=0;i<a.length;i++) {
	    sum+=a[i];
	}
	return (double)(sum*1.0/a.length);
    }

    public double stddev() {
	double mean = mean();
	double newsum = 0.0;
	double[] things = new double[a.length];
	for (int i=0;i<a.length;i++) {
	    newsum+=(double)(Math.pow(a[i]+0.0-mean,2.0));
	}
	newsum = (double)(newsum/a.length*1.0);
	return Math.sqrt(newsum);	
    }
}