import java.io.*;
import java.util.*;

public class Arrays2 {
    public int[] RevFill(int n){
	int ans = new int[n];
	for(int i=0; i<n;i++){
	    ans[i] = n-i;
	}
	    return ans;
    }
    //returns an array of size n where a0=n, a1=n-1, etc.

    public int[] makeRandom(int size, int min, int max){
	int[] ans =  new int[size];
	for(int i=0;i<size;i++){
	    int r = new Random().nextInt(max-min) + min;
	    ans[i] = r;
	}
	return ans;
    }
    //create and return an array of size size
    //where each element is a random value b.t min and max

    public int sum13(int[] nums){
	int sum=0;
	int i=0;
	while(i < nums.length){
	    if(nums[i] == 13){
		i = i +2;
	    }
	    else{
		sum = sum + nums[i];
		i = i + 1;
	    }
	}
	return sum;
    }
    //sum of numbers in array, return 0 for empty
    //skip #13

    public boolean modThree(int[] nums){
        int countereven = 0;
	int counterodd = 0;
	for(int i=0;i<nums.length;i++){
	    if(nums[i]%2 == 0){
		counterodd = 0;
		countereven = countereven + 1;
	    }
	    else{
		counterodd = counterodd + 1;
		countereven = 0;
	    }
	    if((countereven==3) || (counterodd == 3)){
		return true;
	    }
	}
	return false;
    }
}
//given array of ints
//return true: if array contains either 3 even or 3 odd 
//all next to each other
