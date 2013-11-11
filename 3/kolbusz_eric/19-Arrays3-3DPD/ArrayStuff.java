import java.io.*;
import java.util.*;
import java.math.*;

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
	int sum = 0;
	for (int i=0; i<a.length; i++) {
	    sum = sum + a[i];}
	return (double)(sum) / (double)(a.length);
    }

    public double stddev() {
	//assuming population standard deviation
	//stddev = sqrt(sum((xi-mu)^2))/N)
	double mu = mean();

	double[] b = new double[a.length];
	for (int i=0; i<a.length; i++) {
	    b[i] = (double)(a[i]);}
	
	double Nvariance = 0;
	for (int i=0; i<b.length; i++) {
	    Nvariance = Nvariance + (Math.pow(b[i] - mu, 2));}
	
	double variance = Nvariance/ (double)(b.length); //sample stddev would be (b.length - 1)
	double stddev = Math.sqrt(variance);
	return stddev;					      
    }
}
