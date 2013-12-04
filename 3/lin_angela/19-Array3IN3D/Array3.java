import java.io.*;
import java.util.*;

public class Array3 {
    private int[] a;
    private Random r;
    
    public Array3() {
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

    public double mean(){
        double sum =0;
	double average;
	for (int i=0; i<a.length;i++){
	    sum = sum + a[i];
	}
	average = sum/a.length;
	return average;
    }
 
    public double stddev(){
	double mean = mean();
	double newSum = 0;
	for (int i = 0; i<a.length; i++){
	    newSum = newSum + Math.pow((a[i] - mean),2);
	}
	double newMean = newSum/a.length;
	return Math.sqrt(newMean);
    }




   
}
