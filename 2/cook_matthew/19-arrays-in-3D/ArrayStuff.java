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
    public double mean(){
        int sum=0; 
        for (int q=0; q< a.length; q++) {
            sum = sum + a[q];
        }
        double fin = (double) sum;
        return fin/a.length;
    }
    public double stddev() {
	double i= this.mean();
	double std=0.0;
	for (int q=0; q<a.length; q++) {
	    std= std + ((a[q]-i)*(a[q]-i));
	}
	std = std/a.length;
	std = Math.sqrt(std);
	return std;
    }
}
