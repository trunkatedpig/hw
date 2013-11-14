import java.io.*;
import java.util.*;

public class ArrayStuff {
    private int[] a;
    private Random r;

    public ArrayStuff() {
	r = new Random();
	a = new int[5];
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
	double sum = 0;
	int counter;
	for (counter = 0; counter < a.length; counter++){
	    sum = sum + a[counter];
	}
	return sum / counter;
    }

    public double mean2(double[] nums){
	double sum = 0;
	int counter;
	for (counter = 0; counter < nums.length; counter++){
	    sum = sum + nums[counter];
	}
	return sum / counter;
    }


    public double stddev(){
	double mean = mean();
	double[] newArray = new double[a.length];
	for (int i = 0; i < a.length; i ++){
	    newArray[i] = (a[i] - mean)*(a[i] - mean);
	}
	//System.out.println(Arrays.toString(newArray));
	double newMean = mean2(newArray);
	return Math.sqrt(newMean);
	    }

}
