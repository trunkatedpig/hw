import java.io.*;
import java.util.*;

public class ArrayStuff {

    public double mean(double[] nums){
	double s = 0.0;
	int n = nums.length;
	for (int i=0;i<n;i++){
	    s += nums[i];
	}
	return (s/n);
    }

     public double stddev(double[] nums){
	double mean = mean(nums);
	int n = nums.length;
	double[] argh = new double[n];
	for (int i=0;i<n;i++){
	    argh[i] = Math.pow(nums[i]-mean,2);
	}
	double mean2 = mean(argh);
	return Math.sqrt(mean(argh));
    }
}
