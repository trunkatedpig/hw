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

    public int sum() {
	int r = 0;
	for (int i=0; i<a.length; i++) {
	    r=r+a[i];
	}
	return r;
    }
    
    public double mean() {
	return sum()/a.length;
    }

    public double stddev() {
	double r = 0;
	double m = mean();
	for (int i=0; i<a.length; i++) {
	    r = r + (a[i]-m)*(a[i]-m);
	}
	return Math.sqrt(r/a.length);
    }
}
