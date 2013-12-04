import java.io.*;
import java.util.*;

public class Arrays2 {

    public int[] Revfill(int n) {
	int[] result = new int[n];

	for (int i = 0; i < n; i++) {
	    result[i] = n - i;
	}
	return result;
    }

    public int[] makerandom(int size, int min, int max) {
	int[] result = new int[size];
	Random r = new Random();
	for (int i = 0; i < size; i++) {
	    result[i] = r.nextInt(max - min  + 1) + min; 
		}
	return result;
    }

    public int sum13(int[] nums) {
	int result = 0;

	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 13) {
		i = i + 1;
	    }
	    else 
		result = result + nums[i];
	}
	return result;
    }

    public boolean modthree(int[] nums) {
	boolean result = false;
	int odd, even;
	odd = 0;
	even = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i]%2 == 0) {
		even = even + 1;
		odd = 0;
	    }
	    else {
		even = 0;
		odd = odd + 1;
	    }
	    if (odd == 3 || even == 3) {
		result = true;
		break;
	    }
	}
	return result;
    }
}