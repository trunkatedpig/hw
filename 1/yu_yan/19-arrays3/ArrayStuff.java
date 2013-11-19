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
    
    public int[] getA(){
	return a;
    }

    public double mean(int[] a){
	double total = 0;
	double num = 0;
	for (int x = 0; x< a.length; x++){
	    total = total + (double)a[x];
	    num = num + 1;
	}
	return (total/num);
    }

    public double stdd(int[] a){
	double mean = mean(a);
	double[] a1 = new double[a.length];
	for (int x = 0; x<a.length; x++){
	    double y = a[x] - mean;
	    a1[x] = y * y;
	}
	return mean(a1);
    }
}


