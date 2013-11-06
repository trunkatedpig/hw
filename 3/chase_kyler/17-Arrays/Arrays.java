import java.util.*;
import java.io.*;

public class Arrays {
	
	public int[] middleWay(int[] a, int[] b) {
		int[] r = {a[1], b[1]};
		return r;
	}

	public int[] makeEnds(int[] nums) {
		int[] r = {nums[0], nums[nums.length - 1]};
		return r;
	}

	public int[] fizzArray(int n) {
		int[] r = new int[n];
		n = n - 1;
		while (n >= 0) {
			r[n] = n;
			n = n - 1;}
		return r;
	}

	public boolean only14(int[] nums) {
		int n = nums.length - 1;
		while (n >= 0) {
			if (nums[n] == 1 || nums[n] == 4)
				n = n - 1;
			else
				return false;
		}
		return true;
	}
	

}
