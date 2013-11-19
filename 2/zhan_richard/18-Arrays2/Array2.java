import java.io.*;
import java.util.*;

public class Array2{
    public int[] Revfill(int n){
	int[] result = new int[n];
	for (int i = 0; i < n; i++){
	    result[i] = n-i;
	}
	return result;
    }
    public int[] makeRandom(int n, int min, int max){
	Random r = new Random();
	int[] result = new int[n];
	for (int i = 0; i < n; i++){
	    result[i] = r.nextInt(max-min+1) + min;
	}
	return result;
    }
    public int sum13(int[] nums){
	int result = 0;
	int i = 0;
	while (i < nums.length){
	    if (nums[i] == 13){
		if (i != nums.length - 1)
		    i = i + 1;
	    }
	    else{
		result =result +  nums[i];
	    }
	    i = i + 1;
	}
	return result;
    }
    public boolean modThree(int[] nums){
	if (nums.length==0)
	    return false;
        boolean even = (nums[0]%2==0);
	int count = 1;
	for (int i = 1; i<nums.length;i++){
	    if ((nums[i]%2==0)==even){
		count = count + 1;
	    }
	    else{
		even = !even;
		count = 1;
	    }
	    if (count == 3){
		return true;
	    }
	}
	return false;
    }
}
