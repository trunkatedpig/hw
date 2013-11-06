import java.io.*;
import java.util.*;

public class ArrayStuff{

    public int[] middleWay(int[] a, int[] b) {
	int[] c;
	c = new int[2];
	c[0] = a[1];
	c[1] = b[1];
	return c;
    }

    public int[] makeEnds(int[] nums) {
	int[] c = new int[2];
	int n = nums.length;
	c[0] = nums[0];
	c[1] = nums[n-1];
	return c;
    }

    public int[] fizzArray(int n) {
	int[] a = new int[n];
	for (int i = 0;i<n;i++){
	    a[i] = i;
	}
	return a;
    }

    public boolean only14(int[] nums) {
	int n = nums.length;
	for (int i = 0;i<n;i++){
	    if (nums[i]!=1&&nums[i]!=4)
		return false;
	}
	return true;
    }
}
