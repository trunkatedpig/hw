import java.io.*;
import java.util.*;


public class ArraysStuff{
    
    private int[] a;
    private Random r;

    public ArraysStuff() {
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
        double outter = 0; 
	for (int i = 0; i < a.length; i ++){
	    outter = outter + a[i];            
	} 
	return outter/(a.length);
    }       
    
    public double stddev(){
	double[] x = new double[a.length];
	double mean = mean(x);
	for (int i = 0; i < a.length; i ++)
	    x[i] = ((a[i] - mean) * (a[i] - mean));   
	return Math.sqrt(mean(x));
    }
    
}

