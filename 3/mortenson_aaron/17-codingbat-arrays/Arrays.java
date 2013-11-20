import java.io.*; //Note: I did this on codingbat on time, but in my haste forgot to post it to bart. You told me I didn't need to link to the timestamps.
import java.util.*;

public class Arrays {
    
    public int[] middleWay(int[] a, int[] b) {
	int a1 = a[1];
	int b1 = b[1];
	int[] result = {a1,b1};
	return result;
    }
    
    public int[] makeEnds(int[] nums) {
	int[] result = {nums[0],nums[nums.length - 1]};
	return result;
    }
    
    public int[] fizzArray(int n) {
	int [] result;
	result = new int[n];
	for (;n>0;n--) {
	    result[n-1] = n-1;
	}
	return result;
    }
    
    public boolean only14(int[] nums) {
	for(int n = nums.length - 1;n >= 0; n--) {
	    if (nums[n] != 1 && nums[n] != 4)
		return false;
	}
	return true;
    }   
}