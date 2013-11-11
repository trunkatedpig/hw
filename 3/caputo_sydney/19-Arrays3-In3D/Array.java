import java.util.*;
import java.io.*;

public class Array {
    public double mean(double[] nums){
	double total=0;
	double  ans=0.0;
	int divis= nums.length;
	for(int i=0; i<nums.length; i++){
	    total=total+nums[i];
	}
	ans= total/divis;
	return ans;}
    
    public double stddev(double[] nums){
	double m=mean(nums);
	//ms= meansquared 
	double[] ms= new double[nums.length];
	for(int i=1; i<nums.length; i++){
	    ms[i]=((nums[i]-m)*(nums[i]-m));
	}
	double m2=mean(ms);
	return Math.sqrt(m2);
}
    //for some reason does not work correctly

}





