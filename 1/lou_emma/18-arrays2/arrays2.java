import java.io.*;
import java.util.*;

public class arrays2{

public String toString(int[]n){
	String abc="";
	for (int i=0; i<n.length; i++){
		abc=abc + n[i] + ",";
	}
	return abc;
} 

//1) Finish int RevFill(int n) which returns an array of size n where a0=n, a1=n-1 etc.
	public int[] revFill(int n){
		int[] c = new int[n];
		int newN=n;
		for (int i=0; i<n; i++){
			c[i]=newN;
			newN=newN-1;
		}
		return c;
	}
	
//2) Finish int MakeRandom(int size, int min, int max) which will create and return an array 
//of size size where each element is a random value between min and max.	
	public int[]MakeRandom(int size, int min, int max){
		int[] c = new int[size];
		Random r = new Random();
		
		int range=max-min;
		
		for (int i=0; i<size; i++){
			c[i]=r.nextInt(range)+1+min;
		}
		return c;
	}
	
//3) Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 
//is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.

//http://codingbat.com/prob/p127384

	public int sum13(int[] nums) {
		int sum = 0;
	  	for (int i=0; i<nums.length; i++){
	    	if (nums[i]!=13)
	      		sum=sum+nums[i];
	    	else 
	      		i=i+1; 
	  	}
	  return sum;
	}
	
//4) Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other. 

//http://codingbat.com/prob/p159979

	public boolean modThree(int[] nums) {
		int even = 0;
		int odd = 0;
		boolean really;
		really = false;
		  
		for (int i=0; i<nums.length; i++){
		  if (nums[i]%2==0){
		    even=even + 1;
		    odd = 0;
		    if (even == 3)
		      really = true;
		  }
		  else {
		    even = 0;
		    odd = odd + 1;
		    if (odd == 3)
		      really = true;
		  }
		}
		return really;
		}


	
}