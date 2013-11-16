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
	double d = 0;
	for (int i = 0;i < a.length;i++){
	    d = d + a[i];
	}
	return d/a.length;
    }
    public double mean(int[] n){
	double d = 0;
	for (int i = 0;i < n.length;i++){
	    d = d + n[i];
	}
        return d/n.length;
    }
    public double stddev(){
	double d = 0;
	double e = 0;
	d = mean();
	for(int i = 0;i < a.length;i++){
	    e = e + a[i] - d;
	}
	return Math.sqrt(e/a.length);
    }
    public double stddev(int[] b){
	double d = 0;
	double e = 0;
	d = mean();
	for(int i = 0;i < b.length;i++){
	    e = e + b[i] - d;
	}
	return Math.sqrt(e/b.length);
    }
}
