import java.util.*;
import java.io.*;

public class Arrays {

    public int[] middleWay (int[] a, int[] b) {
	int[] x = {a[1], b[1]};
	return x;
    }

    public int[] makeEnds(int[] nums) {
	int[] x = {nums[0], nums[nums.length-1]};
	return x;
    }

    public int[] fizzArray(int n) {
	int[] x;
	x = new int[n];
	for(int y=0; y<n; y++) {
	    x[y] = y;
	}
	return x;
    }

    public boolean only14(int[] nums) {
	for(int x = 0; x<nums.length; x++){
	    if(nums[x]!=1 && nums[x]!=4){
		return false;
	    }
	}
	return true;
    }

}
