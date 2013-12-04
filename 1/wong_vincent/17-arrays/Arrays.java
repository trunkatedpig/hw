import java.util.*;
import java.io.*;

public class Arrays {

    public int[] middleWay (int[] z, int[] x) {
	int[] a = {z[1], x[1]};
	return a;
    }

    public int[] makeEnds(int[] a) {
	int[] b = {a[0], a[a.length-1]};
	return b;
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
