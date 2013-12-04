import java.io.*;
import java.util.*;

public class ArrayStuff {
    private int[] a;
    private Random r;

//Constructor for ArrayStuff
    public ArrayStuff() {
		r = new Random();
		a = new int[20];
		for (int i=0;i<a.length;i++)
		    a[i]=r.nextInt(100);
    }

//ToString method will print out all array elements instead of array location
    public String toString() {
		return Arrays.toString(a);
    }

 //Returns the element at index location n
    public int get(int n) {
		return a[n];
    }

//Returns the index of the largest element
    public int findMaxIndex() {
		int maxi = 0;
		for (int i=0;i<a.length;i++) {
		    if (a[i]>a[maxi])
			maxi=i;
		}
		return maxi;
    }

//Returns the index of the desired element n (returns -1 of n is not in array)
    public int find(int n) {
		for (int i=0;i<a.length;i++) {
		    if (a[i]==n)
			return i;
		}
		return -1;
    }

//Returns the mean of the array
    public double mean(){
		double sum = 0;
		double average = 0;
		for (int i=0; i<a.length; i++)
			sum = sum + a[i];
		average = sum/a.length;
		return average;
	}

//Returns the standard deviation of the array
	public double stddev(){
		double average = mean();
		double[] meanDiffSquared = new double[a.length];
		for (int i=0; i<a.length; i++){
			meanDiffSquared[i] = ((a[i] - average) * (a[i] - average));
		 }
		double sum = 0;
		for (int i=0; i<a.length; i++)
			sum = sum + meanDiffSquared[i];
    	double variance = sum/a.length;
    	double standardDev = Math.sqrt(variance);
    	return standardDev;
	}
}