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

    public int[] returnArray() { 
	return a;
    }

    public double mean(int[] nums) { 
	int sum=0;
	int i;
	for (i=0;i<nums.length;i++) { 
	    sum = sum + nums[i];
	}
	double avg = sum/nums.length;
	return avg;
    }

    public double meanDouble(double[] nums) { 
	double sum=0;
	int i;
	for (i=0;i<nums.length;i++) { 
	    sum = sum + nums[i];
	}
	double avg = sum/nums.length;
	return avg;
    }

    public double stddev() { 
	double mean = mean(a);
	double[] array = new double[a.length];
	int i;
	for (i=0;i<a.length;i++) { 
	    array[i] = (mean-a[i])*(mean-a[i]);
	}
	double mean2 = meanDouble(array);
	return Math.sqrt(mean2);
    }

}


