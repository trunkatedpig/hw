import java.io.*;
import java.util.*;

public class codingBat{
    public int[] middleWay(int[] a, int[] b) {
	int[] middle = new int[2];
	middle[0] = a[1];
	middle[1] = b[1];
	return middle;  
    }
    public int[] makeEnds(int[] nums) {
	int[] ends = new int[2];
	ends[0] = nums[0];
	ends[1] = nums[nums.length - 1];
	return ends;
    }
    public int[] fizzArray(int n) {
	int a = 0;
	int[] fizz = new int[n];
	while (a<n){
	    fizz[a] = a;
	    a = a + 1;
	}
	return fizz;
    }
    public boolean only14(int[] nums) {
	for (int i=0; i<nums.length;i++){
	    if (nums[i] != 1 && nums[i] != 4) {
		return false;}
	}
	return true;
    }
}
