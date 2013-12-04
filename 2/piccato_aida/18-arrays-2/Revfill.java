import java.util.Arrays;
import java.util.Random;
import java.io.*;

public class Revfill {
    public String makeRandom(int size, int min, int max) {
	int diff = max - min;
	Random r = new Random();
	int [] newArray = new int[size];
	for (int i = 0; i < size; i ++) {
	    newArray[i] = r.nextInt(diff) + min;
	}
	return Arrays.toString(newArray);	
    }

    public String RevFill(int n) {
	int[] newArray = new int[n];
	for (int i = 0; i < n; i ++) {
	    newArray[i] = n-i;
	}
	return Arrays.toString(newArray);
    }

    public int sum13(int[] nums) {
	int sum = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (i != 0) {
		if ((nums[i-1] != 13) && (nums[i] != 13)) {
		    sum = sum + nums[i];
		}
	    }
	    else {
		if (nums[i] != 13) {
		    sum = sum + nums[i];
		}
	    }
	}
	return sum;
    }

    public boolean modThree(int[] nums) {
	if (nums.length < 3) {
	    return false;
	}
	for (int i = 0; i <= nums.length - 3; i ++) {
	    if ((nums[i] % 2 == 0) && (nums[i+1] % 2 == 0) && (nums[i+2] % 2 == 0)) {
		return true;
	    }
	    else if ((nums[i] % 2 != 0) && (nums[i+1] % 2 != 0) && (nums[i+2] % 2 != 0)) {
		return true;
	    }
	}
	return false;
      
    }


}



