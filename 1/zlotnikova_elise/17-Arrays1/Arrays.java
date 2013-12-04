import java.io.*;
import java.util.*;

public class Arrays {
    public int[] middleWay(int[] a, int[] b) { 
	int[] c;
        c = new int[2];
	c[0] = a[1];
	c[1] = b[1];
	return c;
    }

    public int[] makeEnds(int[] nums) { 
	int[] result;
	result = new int[2];
	int l = nums.length;
	result[0] = nums[0];
	result[1] = nums[l-1];
	return result;
    }

    public int[] fizzArray(int n) { 
	int[] result;
	result = new int[n];
	int i;
	for (i=0;i<n;i++) { 
	    result[i] = i;
	}
	return result;
    }

    public boolean only14(int[] nums) { 
	boolean b; 
	int i; 
	for (i=0;i<nums.length;i++) { 
	    if (nums[i]==1 || nums[i]==4) {
		b = true;
	    }
	    else {
		b = false;
		return b;
	    }
	} 
	return true;
    }
