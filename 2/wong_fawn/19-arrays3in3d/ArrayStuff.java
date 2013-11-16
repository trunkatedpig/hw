import java.io.*;
import java.util.*;

public class ArrayStuff {
    private int[] a;
    private Random r;

    public ArrayStuff() {
		r = new Random();
		a = new int[5];
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
		for (int i =0 ; i < a.length;i++) {
		    if (a[i]>a[maxi]) 
			maxi = i;
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
    	for (int i = 0; i < a.length; i++) {
    		sum = sum + a[i]; 
    	}
    	return sum / a.length;
    }

    public double stddev() {
    	double mean = mean();
    	double sum = 0;
    	for (int i = 0; i < a.length; i++){
    		sum = sum + a[i] - mean;
    	}
    	return Math.sqrt(sum / a.length);
    }
}
