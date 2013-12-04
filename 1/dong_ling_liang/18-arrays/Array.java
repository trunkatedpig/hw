import java.io.*;
import java.util.*;

public class Array{
    public int[] RevFill(int n){
	int[] ret = new int[n];
	for (int i = n; i > 0; i--){
	    ret[n-i]=i;
	}
	return ret;
    }
    public int[] MakeRandom(int size, int min, int max){
	int[] ret = new int[size];
	Random rand = new Random();
	for (int i = 0; i < size ; i++){
	    ret[i]=rand.nextInt((max+1)-min)+min;
	}
	return ret;
    }
    public int sum13(int[] nums) {
	int sum = 0;
	for (int i = 0; i < nums.length; i++){
	    if (nums[i]!=13 && i==0){
		sum+=nums[i];
	    }
	    else if (nums[i]!=13 && nums[i-1]!=13){
		sum+=nums[i];
	    }
	}
	return sum;
    }
    public boolean modThree(int[] nums) {
	boolean n = false;
	for (int i = 0; i<nums.length-2; i++){
	    if (nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0){
		return true;
	    }
	    else if (nums[i]%2!=0 && nums[i+1]%2!=0 && nums[i+2]%2!=0){
		return true;
	    }
	}
	return n;
    }
}