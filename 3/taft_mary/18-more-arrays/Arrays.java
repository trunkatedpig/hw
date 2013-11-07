import java.io.*;
import java.util.*;

public class Arrays {

    // Returns an array of size n where a_0=n, a_1=n-1, etc.
    public int[] revFill(int n) {
        int[] a = new int[n];
        for (int i=0; i<n; i++)
            a[i] = n - i;
        return a;
    }

    // Return an array betweeen min & max, with n random ints
    public int[] makeRandom(int n, int min, int max) {
        int[] a = new int[n];
        while (n>0) {
            Random r = new Random();
            a[n-1] = r.nextInt(max-min) + min;
            n--;
        }
        return a;
    }

    //  Return the sum of the numbers in the array, returning 0 for an empty array; however, since the number 13 is very unlucky, it and numbers that come immediately after it (13) do not count.  (http://codingbat.com/prob/p127384)
    public int sum13(int[] nums) {
  	int i = 0;
        for (int n = 0; n < nums.length; n++) {
            if (nums[n] != 13)
	   i += nums[n];
            else
                n++;
	}
	return i;
    }

    // Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.  (http://codingbat.com/prob/p159979)
    public boolean modThree(int[] nums) {
	int[] temp = new int[3];
	for(int l = 2; l < nums.length; l++) {
	    if ((nums[l-2] % 2 == 0 &&
	          nums[l-1] % 2 == 0 &&
	          nums[l] % 2 == 0) ||
	         (nums[l-2] % 2 != 0 &&
	          nums[l-1] % 2 != 0 &&
	          nums[l] % 2 != 0))
		return true;
	}
	return false;
    }

}
