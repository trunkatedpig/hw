import java.util.*;
import java.io.*;

public class ArrayStuff{ 
    private int[] a;
    private Random r = new Random();
    public ArrayStuff() {
	a=new int[20];
	for (int i=0;i<a.length;i++) {
	    a[i]=r.nextInt(100);
	}
    }

    public String toString() {
	return Arrays.toString(a);
    }

    // return the index of the max element
    public int findMaxIndex() {
	if (a==null || a.length==0) 
	    return -1;

       	int maxi = 0;
	for (int i=0;i<a.length;i++) {
	    if (a[i] > a[maxi])
		maxi = i;
	}
	return maxi;
    }

    public int get(int n) {
	if (n>=0 && n < a.length) 
	    return a[n];
	else
	    return -1;
    }

    public int find(int n) {
	for (int i=0;i<a.length;i++) {
	    if (a[i]==n)
		return i;
	}
	return -1;
    }

    // Homework 19 - Arrays 3 - in 3D

    public double mean(){
	double ans = 0;
	for (int i=0; i<a.length;i++)
	    ans+=a[i];
	return ans/a.length;
    }

    public double stddev(){
	double mean = mean();
	double total = 0;
	for (int i=0; i<a.length; i++){
	    total+=Math.pow(mean-a[i],2);
	}
	return Math.pow(total/a.length,0.5);
    }
}


