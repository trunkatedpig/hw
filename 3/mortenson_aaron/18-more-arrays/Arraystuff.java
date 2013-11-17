import java.util.*;
import java.io.*;

public class Arraystuff {
    public int[] RevFill(int n) {
	int[] result = new int[n];
	for (int i = n;n > 0;n--) {
	    result[i-n] = n;
	}
	return result;
    }

    public int[] MakeRandom(int size, int min, int max) {
	int[] result = new int[size];
	Random r = new Random();
	for (size-=1;size >=0;size--) {
	    result[size] = r.nextInt(max+1-min) + min;
	}
	return result;
    }
    
    public int sum13(int[] nums) {
	int result = 0;
	for (int n = nums.length-1;n >= 1;n--) {
	    if (nums[n] != 13 && nums[n-1] != 13)
		result += nums[n];
	}
	if (nums.length > 0 && nums[0] != 13)
	    result += nums[0];
	return result;
    }
    
    public boolean modThree(int[] nums) {
	int odd = 0;
	int even = 0;
	for (int i = nums.length-1;i >=0;i--) {
	    if (nums[i] % 2 == 0) {
		even +=1;odd = 0;
	    }
	    else {
		even = 0;odd +=1;
	    }
	    if (even == 3 || odd == 3)
		return true;
	}
	return false;
    }
}