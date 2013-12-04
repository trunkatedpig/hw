import java.io.*;
import java.util.*;

public class moreArrays {

	public String makePretty (int[] a) {
		String result = "[";
		for (int x = 0; x < a.length; x++) {
			result += a[x] + ", ";
		}
		result = result.substring (0, result.length() - 2);
		result += "]";
		return result;
	}
			
	public int [] RevFill (int n) {
		int a = n;
		int[] result = new int [n];
		for (int x = 0; x < n; x++) {
			result [x] = a;
			a = a - 1;
		}
		return result;
	}
	
	public int[] makeRandom (int size, int min, int max) {
		int [] result = new int [size];
		Random r = new Random ();
		for (int x = size - 1; x > 0; x --) {
			result [x] = (r.nextInt(max - min) + min);
		}
		return result;
	}

	public int sum13(int[] nums) {
		int sum = 0;
  		int x = 0;
  		if (nums.length == 0) {
			return 0;
		}
		if (nums[x] != 13) {
			sum += nums[x];
		}
		x += 1;
		while (x < nums.length) {
			if ( (nums[x] != 13) && (nums[x-1] != 13) ) {
				sum += nums[x];
			}
		x += 1;
		}
  		return sum;
	}
	
	public boolean modThree (int[] nums) {
		if (nums.length < 3) {
			return false;
		}
		for (int x = 0; x < nums.length - 2; x ++) {
			if (
			(nums[x] % 2 == 0) && 
			(nums[x + 1] % 2 == 0) && 
			(nums[x + 2] % 2 == 0) ) {
				return true;
			}
			if ( 
			(nums[x] % 2 == 1) &&
			(nums[x + 1] % 2 == 1) &&
			(nums[x + 2] % 2 == 1) ) {
				return true;
			}
		}
		return false;	
	}
}
