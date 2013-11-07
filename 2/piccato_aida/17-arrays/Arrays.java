import java.util.*;
import java.io.*;

public class Arrays {
    public int[] middleWay(int[] a, int[] b) {
	int[] newArray = new int[2];
	newArray[0] = a[1];
	newArray[1] = b[1];
	return newArray;
    }
    
    public int[] makeEnds(int[] nums) {
	int[] newArray = new int[2];
	newArray[0] = nums[0];
	newArray[1] = nums[nums.length - 1];
	return newArray;
    }

    public int[] fizzArray(int n) {
	int[] array = new int[n];
	for (int i = 0; i < n; i++) {
	    array[i] = i;
	}
	return array; 
    }
     
    public boolean only14(int[] nums) {
	for (int i = 0; i < nums.length; i++) {
	    if ((nums[i] != 1) && (nums[i] != 4))
		return false;
	}
	return true;
    }

}
