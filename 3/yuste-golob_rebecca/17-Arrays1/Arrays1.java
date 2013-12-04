import java.io.*;
import java.util.*;

public class Arrays1{
    public int[] middleWay(int[] a, int[] b) {
	int middleA = a[1];
	int middleB = b[1];
	int[] middle = {middleA, middleB};
	return middle;
    }

    public int[] makeEnds(int[] nums) {
	int first = nums[0];
	int l = nums.length - 1;
	int last = nums[l];
	int[] result = {first, last};
	return result;
    }

    public int[] fizzArray(int n) {
	int[] result = new int[n];
	for (int i = 0; i < n; i = i+1){
	    result[i] = i;
	}
	return result;

	public boolean only14(int[] nums) {
	    int i = 0;
	    while (index < nums.length){
		if (nums[i] != 4 && nums[i] !=1)
		    return false;
		i = i+1;
	    }
	    return true; 
	}
    }

