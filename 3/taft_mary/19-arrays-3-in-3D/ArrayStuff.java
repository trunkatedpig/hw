import java.io.*;
import java.util.*;

public class ArrayStuff {
    private int[] a;
    private double[] d;
    private Random r;
    
    public ArrayStuff() {
	r = new Random();
	a = new int[20];
	for (int i=0;i<a.length;i++)
	    a[i]=r.nextInt(100);
	d = new double[a.length];
    }

    public ArrayStuff(String description) {
	a = new int[] {9, 2, 5, 4, 12, 7, 8, 11, 9, 3, 7, 4, 12, 5, 4, 10, 9, 6, 9, 4};
	d = new double[a.length];
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
	double t = 0;
	for (int i=0;i<a.length;i++)
	    t+=a[i];
	return t/a.length;
    }

    public double variance() {
	double mean = mean(), sum = 0;
	for (int i=0;i<a.length;i++)
	    sum += (a[i]-mean)*(a[i]-mean);
	return sum/a.length;
    }

    public double stddev() {
	return Math.sqrt(variance());
    }

}
