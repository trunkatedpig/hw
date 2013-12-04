import java.io.*;
import java.util.*;

public class Arrays3 {
    private int[] a;
    private Random r;
    
    public Arrays3() {
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

    public double mean() {
	double avg = 0;
	for (int i = 0; i < a.length; i++) {
	    avg = avg + a[i];
	}
	avg = avg/(a.length);
	return avg;
    }


    public double stddev() {
	double sd = 0;
	double j = 0;
	double[] temp = new double[a.length];

	for (int i = 0; i < a.length; i++) {
	    temp[i] = (mean()-a[i])*(mean()-a[i]);
	}
	for (int i = 0; i < temp.length; i++) {
	    j = j + temp[i];
	}
	j = j/temp.length;
	sd = Math.sqrt(j);
	return sd;
    }
    
}
