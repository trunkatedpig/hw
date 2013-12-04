import java.util.*;
import java.io.*;

public class Arrays {
	
    /* methods:
     * ModThree
     * Sum13
     * MidWay
     * MakeEnds
     * FizzArray  
     * Only14
     * MakeRandom
     * RevFill
     */      
    
    public int[] FizzArray (int n){	
	int[] intArray = new int[n];
	for(int i = 0; i < n; i ++) {
	    intArray[i] = i;
	}
	return intArray;
    }
    
    public boolean only14(int[] nums) {
	for(int i = 0; i < nums.length; i ++){
	    if (nums[i] != 1 && nums [i] != 4)
		return false;
	}
	return true;
	
    }
    
    public int[] makeEnds(int[] nums) {
	int[] ret = new int[2];
	ret[0] = nums[0];
	ret[1] = nums[nums.length - 1];
	return ret;  
    }
    
    public int[] middleWay(int[] a, int[] b) {
	int ret[] = new int[2];
	ret[0] = a[1];
	ret[1] = b[1];
	return ret;
}
    
    
   

    
    //Getarray method?
    //I keep on getting bizarre outputs...
    //like this >>>> [I@3343c8b3
    //WTFWTFWTF!?!?!!?!

}
