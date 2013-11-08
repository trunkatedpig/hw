import java.io.*;
import java.util.*;

public class Array {
    private int[] a;
    private Random r;
    
    public Array() {
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
	double sum = 0.0;
	for (int i=0;i<a.length;i++) {
	    sum = sum + a[i];
	}
	return sum/a.length;
    }

    public double stddev() {
	int[] b = new int[a.length];
	for (int i=0; i<a.length;i++) {
	    b[i] = (a[i]-a.mean())*(a[i]-a.mean());
	}
	return Math.sqrt(b.mean());
    }
}