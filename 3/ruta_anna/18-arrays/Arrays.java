import java.io.*;
import java.util.*;

public class Arrays {

/* Given an integer n, create and return an new array,
length n, which counts down from n to 1*/
public int[] RevFill(int n) {
	int[] reverse = new int[n];
	for (int i=0; i<n; i++){
			reverse[i] = n-i;
	}
	return reverse;
}

/* Given the size, max and min, create and return a new array,
length size, where each element is a random value between
max and min*/
public int[] MakeRandom(int size,int min,int max) {
	int[] randArray = new int[size];
	Random generator = new Random();
	for (int i=0; i<size; i++){
		int rand = generator.nextInt(max-min+1)+min;
		randArray[i] = rand;
	}
	return randArray;
}

/* CODING BAT EXERCISE
Return the sum of the numbers in the array, returning 0 for an empty array.
Except the number 13 is very unlucky, so it does not count and numbers
that come immediately after a 13 also do not count. */
public int sum13(int[] nums) {
  	int sum = 0;
 	for (int i= 0; i<nums.length; i++){
  		if (nums[i] == 13)
    	   i++;
    	 else
    	   sum = sum + nums[i];
  	}
  	return sum;
}

/* CODING BAT EXERCISE
Given an array of ints, return true if the array contains
either 3 evenor 3 odd values all next to each other. */
public boolean modThree(int[] nums){
	 for (int i=0; i<=nums.length-3; i++){
	     if(nums[i]%2 == nums[i+1]%2 && nums[i+1]%2 == nums[i+2]%2)
	         return true;
	      }
	 return false;
}


}