import java.io.*;
import java.util.*;

public class ArrayStuff{
    
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
	double m=0;
	double l;
	int i;
	for (i=0;i<a.length;i++){
	    m=m+a[i];
	}
	l=m/a.length;
	return l;
    }
    public double stddev(){
	int b=a.mean();
	int i;
	int[] l=new int[a.length];
	for (i=0;i<a.length;i++){
	    l[i]=(a[i]-b)*(a[i]-b);
	}
	int c=l.mean();
	int d=Math.sqrt(c);
	return d;
    }
}
