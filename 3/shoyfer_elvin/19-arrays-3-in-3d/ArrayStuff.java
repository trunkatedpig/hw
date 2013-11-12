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

    // Problem 1 

    // The mean() function can be called with two signatures.
    // The first one returns the mean of the ArrayStuff object instance variable array.
    // The second one takes a double array as an input (used in standard deviation).

    public double mean() {
    	int arrayLength = a.length;
    	int sum = 0;
    	for (int i = 0; i < arrayLength; i++) {
    		int thisElement = a[i];
    		sum = sum + thisElement;
    	}
    	double mean = sum / arrayLength;
    	return mean;
    }

    public double mean(double[] a) {
    	int arrayLength = a.length;
    	double sum = 0;
    	for (int i = 0; i < arrayLength; i++) {
    		double thisElement = a[i];
    		sum = sum + thisElement;
    	}
    	double mean = sum / arrayLength;
    	return mean;
    }

	// Problem 2 

    public double stddev() {
    	double mean = this.mean();
    	int arrayLength = this.a.length;
    	double[] squaredMeanDifferences = new double[arrayLength];
    	for(int i = 0; i < arrayLength; i++) {
    		int thisElement = this.a[i];
    		double meanDifference = thisElement - mean;
    		double squaredMeanDifference = Math.pow(meanDifference, 2);
    		squaredMeanDifferences[i] = squaredMeanDifference;
    	}
    	double meanOfSquaredMeanDifferences = mean(squaredMeanDifferences);
    	double standardDeviation = Math.pow(meanOfSquaredMeanDifferences, 0.5);
    	return standardDeviation;
    }
}