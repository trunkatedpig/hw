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
	int answer=a[0];
	for (int i=1;i<a.length;i++){
	    answer=answer+a[i];}
	double mean=answer/(a.length*1.0);
	return mean;
    }

    public double meand(double[] a){
	double answer=a[0];
	for (int i=1;i<a.length;i++){
	    answer=answer+a[i];}
	double mean=answer/(a.length*1.0);
	return mean;
    }

    public double stddev(){
	double[] answer=new double[a.length];
	for (int i=0;i<a.length;i++){
	    answer[i]=(a[i]-mean())*(a[i]-mean());
	}
	return Math.sqrt(meand(answer));
    }

}
