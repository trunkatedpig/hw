import java.io.*;
import java.util.*;

public class Arrays2{

    public int[] RevFill(int n){
	int[] result = new int[n];
	for (i = 0; i < result.length; i = i + 1){
	    result[i] = n;
	    n = n - 1;
	}
	return result;
    }

    public int[] MakeRandom(int size, int min, int max){
	Random r = new Random();
	int range = max-min;
	int[] result = new int[size];
	for (i = 0; i < result.length; i = i + 1){
	    result[i] = r.nextInt(range) + min;
	}
	return result;
    }

    public int sum13(int[] nums) {
	int result = 0;
	int i = 0;
	while (i < nums.length){
	    if (nums[i] != 13){
		result = result + nums[i];
		i = i + 1;
	    } else {
		i = i + 2;
	    }
	}
	return result;
    }

    public boolean modThree(int[] nums) {
	if (nums.length < 3){
	    return false;
	}
	for (int i = 1; i < nums.length-1; i = i + 1){
	    if (nums[i-1]%2 == 0 && nums[i]%2 == 0 && nums[i+1]%2 == 0){
		return true;
	    }
	    if (nums[i-1]%2 != 0 && nums[i]%2 != 0 && nums[i+1]%2 !=0){
		return true;
	    }
	}
	return false;
    }



}
