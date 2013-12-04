import java.io.*;
import java.util.*;


public class ArrayStuff {
    private int[] a;
    
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
	int len = a.length;
	int i = 0;
	int result = 0;
	while (i < len){
	    result = result + a[i];
	    i = i + 1;
	}
	return result / len * 1.0;
    }
    
    public double stddev(int[] a){
	int result = 0;
	while (i < len){
	    (a[i] - mean(a)) * (a[i] - mean(a));
	    i = i + 1;
	}
	result = mean(a);
	result = Math.aqrt(a);
    }
}
