import java.util.*;
import java.io.*;

public class Arrays {
    
    public int[] middleWay(int[] a, int[] b) {
	int[] z = new int[2];
	z[0] = a[1];
	z[1] = b[1];
	return z;
    }

    public int[] makeEnds(int[] nums) {
	int[] other = new int[2];
	other[0] = nums[0];
	other[1] = nums[nums.length-1];
	return other;
    }

    public int[] fizzArray(int n) {
	int[] fizz = new int[n];
	for (int f=0;f<n;f++) {
	    fizz[f] = f;
	}
	return fizz;
    }

    public boolean only14(int[] nums) {
	for (int o=0;o<nums.length;o++){
	    if (nums[o] == 1 || nums[o] == 4) {
		;
	    }else{
		return false;}}
	return true;
    }
}
