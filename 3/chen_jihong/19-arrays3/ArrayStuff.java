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
    public double mean() {
	double sum = 0;
	for (int i=0; i<a.length; i++){
	    sum = sum + a[i];
	    i = i + 1;
	}
	double result = sum / a.length;
	return result;
    }
    public double stddev() {
	double sum = 0;
	for (int i=0; i<a.length; i++){
	    sum = sum + a[i];
	    i = i + 1;
	}
	double mean = sum / a.length;
	double result = 0;
	for (int i=0; i<a.length;i++){
	    result = result + Math.pow(a[i]-mean,2);
	    i = i +1;
	}
	result = result/a.length;
	return result;
    }
	    
	    
	    
	    
	    
}
