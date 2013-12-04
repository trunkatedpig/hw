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
	double sum = 0;
	for (int i=0;i<a.length;i++) {
	    sum = sum + (double)a[i];
	}
	return (sum / 20);
    }

    public double stddev() {
	double mean = mean();
	double[] difsq = new double[20];
	double sum = 0;
	for (int i=0;i<a.length;i++) {
	    double dif = (double)a[i] - mean;
	    difsq[i] = dif * dif;
	    sum = sum + difsq[i];
	}
	return Math.sqrt(sum / 20);
    }
}
