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

    public double mean(double[] nums){
	double sum = 0;
        int index = 0;
	for (index = 0; index < nums.length; index ++){
	    sum = sum + nums[index];
	}
	return sum / nums.length;
    }

    public double stddev(double[] nums){
	double[] a = new double[nums.length];
	int index = 0;
	double mean = mean(nums);
	for (index = 0; index < nums.length;index++){
	    a[index] = Math.pow(nums[index]-mean,2);
	}
	return Math.sqrt(mean(a));
    }

}

