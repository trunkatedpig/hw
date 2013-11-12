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
    public double mean(){
	double ans = 0;
	int i;
	int len = a.length;
	for (i=0;i<len;i++){
	    ans = ans + (double)a[i];
	}
	return ans/(double)len;
    }
    public double stddev(){
	int len = a.length;
	double mean1 = 0;
        double mean2;
	double[] secArray = double[len];
	int i;
	for (i=0;i<len;i++){
            mean1 = mean1 + (double)a[i];
        }
        mean1 = mean1/(double)len;
	for (i=0;i<len;i++){
	    secArray[i] = (double)a[i] - mean1 * (double)a[i] - mean1;
	}
	for (i=0;i<len;i++){
	    mean2 = mean2 + secArray[i];
	}
	return mean2/(double)len;
    }

}
