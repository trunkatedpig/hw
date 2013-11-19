import java.io.*;
import java.util.*;

public class CodingBat {
    public int[] middleWay(int[] a, int[] b) {
	int[] c;
	c = new int[2];
	c[0] = a[1];
	c[1] = b[1];
	return c;
    }

    public int[] makeEnds(int[] nums) {
	int[] c;
	c = new int[2];
	c[0] = nums[0];
	c[1] = nums[nums.length-1];
	return c;
    }

    public int[] fizzArray(int n) {
	int[] ans;
	ans = new int[n];
	for (int i = n-1;i > 0;i--){
	    ans[i] = i;
	}
	return ans;
    }

    public boolean only14(int[] nums) {
	for(int i = 0; i < nums.length; i++) {
	    if (nums[i] != 1 && nums[i] != 4){
		return false;
	    }
	}
	return true;
    }
}