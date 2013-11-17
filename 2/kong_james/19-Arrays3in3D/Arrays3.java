import java.io.*;
import java.util.*;

public class Arrays3 {
    private int[] a;
    private Random r;
    private double mean;

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
    public double mean(){
	int sum = 0;
	for (int i = 0; i < a.length; i ++){
	    sum = sum + a[i];
	}
	mean =  sum/a.length;
	return mean;
    }

    public double stddev(){
	double sum = 0;
	for (int i = 0; i < a.length; i ++){
	    sum =sum + (a[i]- mean )* (a[i]-mean);
	}
	return Math.sqrt(sum/a.length);
    }
	    
	    
	    

}
