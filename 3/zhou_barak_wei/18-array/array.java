import java.io.*;
import java.util.*;

public class array{
    public static int[] RevFill(int n) {
	int[] result = new int[n];
	int forward = 0;
	int reverse = n-1;
	while(forward < n) {
	    result[forward]=reverse;
	    forward = forward + 1;
	    reverse = reverse - 1;
	}
	return result;
    }

    public static int[] MakeRandom(int size, int min, int max) {
	int[] result = new int[size];
	Random r = new Random();
	for(int i=0; i<result.length; i++) {
	    result[i] = min + (int)(Math.random() * ((max - min) + 1));
	}
	return result;
    }

    public static int sums13(int[] nums) {
	int result = 0;
	if(nums.length<1) return 0;
	else {
	    for(int i=0;i<nums.length;i++){
		if(nums[i] == 13) {
		    result = result + 0;
		    if (i != nums.length-1) nums[i+1] = 0;
		}
		else result = result + nums[i];
	    }
	}
	return result;
    }

    public static boolean modThree(int[] nums) {
	boolean result = false;
	for (int i=0;i<nums.length-2;i++){
	    if (nums[i] % 2 == nums[i+1] % 2 && nums[i+2] % 2 == nums[i+1] % 2) result = true;  }
	return result;
    }


}