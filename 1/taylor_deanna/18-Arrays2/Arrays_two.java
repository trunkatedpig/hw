import java.io.*;
import java.util.*;

public class Arrays_two{
    
    public int[] RevFill(int n){
	int[] intArray = new int[n];
	for (int j=0; j<=n; j++){
	    intArray[n-j]= j;
	}
	return intArray;
    }

    public int[] MakeRandom(int size, int min, int max){
	int[] nextArray;
	nextArray = new int[size];
	int difference = max - min;
	for (int j= 0; j<size; j++){
	    int r = (int)(min + (Math.random()*difference));
	    nextArray[j]= r;
	}
	return nextArray;
    }

    public int sum13(int[] nums) {
	// Couldnt get this to work in every case on codingbat but not sure why.
	int answer = 0;
	for (int j=0; j<nums.length; j++){
	    if (nums[j] == 13 || nums[j-1] == 13) {
		j = j+1;
	    }
	    else{
		answer = answer + nums[j];
	    }
	}
	return answer;
    }

    public boolean even(int n){
	return n/2 == n/2.0;
    }
    
    public boolean modThree(int[] nums){
	if (nums.length<3){
	    return false;
	}
	boolean e = even(nums[0]);
	int n=1;
	for (int j=1; j<nums.length; j++){
	    if (even(nums[j])==e){
		n = n+1;
	    }
	    else {
		n = 1;
		e = !e;
	    }
	    if (n>=3){
		return true;
	    }
	}
	return false;
    }
}
	    
	
