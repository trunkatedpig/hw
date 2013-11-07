import java.io.*;
import java.util.*;

public class Arrays {

    public String printArray(int[] a) {
	String output = "";
	for (int i = a.length;i>0;i--) {
	    if (! output.equals("")){
		output = a[i-1] + ", " + output;
	    }else{
		output = a[i-1] + output;
	    }
	}
	return output;
    }

    public int[] middleWay(int[] a, int[] b) {
	int[]output = new int[2];
	output[0] = a[1];
	output[1] = b[1];
	return output;
    }
    
    public int[] makeEnds(int[] nums) {
	int[]output = new int[2];
	output[0] = nums[0];
	output[1] = nums[nums.length-1];
	return output;
    }

    public int[] fizzArray(int n) {
	int[]output = new int[n];
	for(;n>0;n--) {
	    output[n-1] = n-1;
	}
	return output;
    }

    public boolean only14(int[] nums) {
	for(int i=nums.length;i>0;i--){
	    if (nums[i-1] != 1 && nums[i-1] != 4) {
		return false;
	    }
	}
	return true;
    }
}
