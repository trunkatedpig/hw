import java.io.*;
import java.util.*;

public class Arrays{
    //#1
    public int[] middleWay(int[] a, int[] b) {
	int x = a[1];
	int y = b[1];
	int[] ans = {x,y};
	return ans;
    }

    //#2
    public int[] makeEnds(int[] nums) {
	int[] ans = new int[2];
	ans[0] = nums[0];
	ans[1] = nums[nums.length-1];
	return ans;
    }

    //#3
    public int[] fizzArray(int n) {
	int[] ans = new int[n];
	for (int i=0;i<n;i++)
	    ans[i]=i;
	return ans;
    }
    
    //#4
    public boolean only14(int[] nums) {
	boolean ans = true;
	for (int i = 0;i<nums.length;i++){
	    if (nums[i] != 1 && nums[i] != 4)
		ans = false;
	}
	return ans;
    }

}
