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
	int k = a.length;
	int sum = 0;
	double mean = 0;
	for (int i = 0; i < k;i++){
	    sum = sum + a[i];
	}
	mean = (double)sum / k;
	return mean;
    }

    public double dmean(double[]nums){
	int k = nums.length;
	double sum = 0;
	double mean = 0;
	for (int i = 0; i < k;i++){
	    sum = sum + nums[i];
	}
	mean = sum / (double)k;
	return mean;
    }

    public double stddev(){
	double[] doubles = new double[a.length];
        double d = mean();
	for (int i = 0; i < a.length; i++){
	    doubles[i] = (double)a[i]-d;
	    doubles[i] = doubles[i] * doubles[i];
	}
	double deviation = dmean(doubles);
	deviation = Math.sqrt(deviation);
	return deviation;

    }
    public String pArray(double[]a){
	return Arrays.toString(a);
	    }
}
