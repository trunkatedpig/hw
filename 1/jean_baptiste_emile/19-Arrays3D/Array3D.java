import java.io.*;
import java.util.*;

public class Array3D {

    private int[] a;
    private Random r = new Random();
    public Array3D() {
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

    public double mean() {
	int sum = 0;
	for (int i = 0;i < a.length; i++) {
	    sum = sum + a[i]; }
	return (sum / a.length); }

    public double stddev() {
	double sum = 0.0;
	for (int i = 0; i < a.length; i++) {
	    sum = sum + ((a[i] - this.mean()) * (a[i] - this.mean())); }
	return Math.sqrt((sum / a.length)); }
	
}	    