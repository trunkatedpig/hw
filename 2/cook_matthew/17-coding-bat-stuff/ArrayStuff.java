import java.io.*;
import java.util.*;

public class ArrayStuff{ 
    public int[] middleWay(int[] a, int[] b) {
	int[] o = new int[2];
	o[0] = a[1];
	o[1] =b[1];
	return o;
    }
    
    public int[] makeEnds(int[] nums) {
	int[] o = new int[2];
	o[0]=nums[0];
	o[1]=nums[nums.length-1];
	return o;
    }
    public int[] fizzArray(int n) {
	int[] o = new int[n];
	for (int q=0; q!= n; q=q+1){
	    o[q]= q;
	}
	return o;
    }
    public boolean only14(int[] nums) {
	for (int q=0; q!= nums.length; q=q+1) {
	    if (nums[q] == 1 || nums[q] == 4){
	    }
	    else {
		return false;
	    }
	}
	return true;
    }

}