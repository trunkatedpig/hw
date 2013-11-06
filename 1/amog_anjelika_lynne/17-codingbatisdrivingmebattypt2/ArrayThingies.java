import java.io.*;
import java.util.*;

public class ArrayThingies{
    public int[] middleWay(int[] a, int[] b){
	int am, bm;
	am = a[1];
	bm = b[1];
	int[] mid = {am, bm};
	return mid;
    }
    public int[] makeEnds(int[] nums){
	int first = nums[0];
	int last = nums[nums.length - 1];
	int[] ends = {first, last};
	return ends;
    }
    public int[] fizzArray(int n){
	int[] argh = new int[n];
	for (int i = 0; i < n; i++){
	    argh[i] = i;
	}
	return argh;
    }
    public boolean only14(int[] nums){
	for (int i = 0; i < nums.length; i++){	
	    if (nums[i] != 1 && nums[i] != 4)
		return false;
	}
	return true;
    }
	                           
}