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

    public double mean(int[] a){
		double mean = 0.0;
			for (int i=0;i<a.length;i++){
			    mean += a[i];
			}
		return (mean/a.length);
    }

    public double stddev(int[] a){
    	double mean = mean(a);
    	for (int i=0;i<a.length;i++){
    		a[i] = (a[i]-(int)mean)*(a[i]-(int)mean);
    	}
    	mean = mean(a);
    	return Math.pow(mean, 0.5);
    }





}
