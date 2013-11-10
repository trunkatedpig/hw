import java.io.*;
import java.util.*;

public class ArrayStuff3{
    public double mean(double[] nums){
	int n=nums.length;
	double sum = 0;
	for (int i = 0; i<n;i++){
	    sum=sum+nums[i];
	}
	return sum/n;
    }

    public double stddev(double[] nums){
	int n = nums.length;
	double avr= mean(nums);
	double[] sqdiffs = new double[n];
	for (int i = 0;i<n;i++){
	    sqdiffs[i]=nums[i]-avr;
	}
	for (int j=0;j<n;j++){
	    sqdiffs[j]=sqdiffs[j]*sqdiffs[j];
	}
	double vari= mean(sqdiffs);
	double stddev = Math.sqrt(vari);
	return stddev;
    }
}
