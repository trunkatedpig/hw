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

    
    public double mean(){
	double sum = 0;
	for (int i =0; i < a.length; i = i + 1){
	    sum = sum + a[i];
	}
	double average = sum / a.length;
	return average;
    }

    public double stddev(){
	double variance = 0;
	double mean = mean();
	for (int i = 0; i < a.length; i = i + 1){
	    double difference = a[i] - mean;
	    variance = variance + (difference * difference);
	    difference = 0;
	}
	variance = variance / a.length;
	double ans = Math.sqrt(variance);
	return ans;
    }
}
