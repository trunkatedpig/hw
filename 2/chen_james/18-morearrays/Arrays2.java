import java.io.*;
import java.util.*;


public class Arrays2 {

	
	//Finish int RevFill(int n) which returns an array of size n where a0=n, a1=n-1 etc.
	public int[] Revfill (int n) {
		int [] intArray;
		intArray = new int[n];
		int arrayCount = 0;
		for (int count = n; count > 0; count--) {
			intArray[arrayCount] = count;
			arrayCount++;	
		}
		return intArray;
	}
	
	//Finish int MakeRandom(int size, int min, int max) which will create
	//and return an array of size size where each element is a random value between min and max.

	public int[] MakeRandom(int size, int min, int max) {
		Random r = new Random();
		int [] intArray = new int[size];
		for (int count = 0; count < size; count ++) {
			intArray[count] = min + r.nextInt(max);
		}
		return intArray;
	
	}
	//Return the sum of the numbers in the array, returning 0 for an empty array. 
	//Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count. 
	
	public int sum13(int[] nums) {
  		int sum = 0;
  		for (int count = 0; count < nums.length; count ++) {
  			if (nums[count] != 13) {
  				sum = sum + nums[count];
 			}
  			else {
  				count++;
  			}
  		}
  		return sum;
	}
	
	//Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other. 
	
	public boolean modThree(int[] nums) {
		int amteven = 0;
		int amtodd = 0;
		for (int count = 0; count < nums.length; count ++) {
			if ((nums[count] % 2) == 0) {
				amteven = amteven + 1;
				amtodd = 0; 
			}
			else {
				amtodd = amtodd + 1;
				amteven = 0;
			}
			if (amteven == 3 || amtodd ==3) {
				return true;
			}
		}
		return false;
	}
}