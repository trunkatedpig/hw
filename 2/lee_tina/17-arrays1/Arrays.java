import java.io.*;
import java.util.*;

public class Arrays{


    public int[] middleWay (int[] a, int[] b){
	int[] intArray = {a[1], b[1]};
	return intArray;
    }
	
    public int[] makeEnds(int[] nums){
	int[] intArray = {nums[0], nums[nums.length - 1]};
	return intArray;
    }

    public int[] fizzArray(int n){
	int[] intArray = new int[n];
	for (int len = 0; len < n; len++){
	    intArray[len] = len;
	}
	return intArray;
    }

    public boolean only14(int[] num){
	for (int ind = 0; ind < num.length; ind++){
	    if (num[ind] != 1){
		if (num[ind] != 4){
		    return false;
		}
	    }
	}
	return true;
    }
}

