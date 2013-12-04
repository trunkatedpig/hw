import java.util.*;
import java.io.*;

public class Arrays {
    Random r = new Random ();

    public int[] Revfill (int n) {
	int [] a = new int [n];
	for (int i = n; i > 0; i = i - 1) {
	    a [n - i] = i;
	}
	return a;
    }

    public int[] MakeRandom (int size, int min, int max) {
	int [] a = new int [size];
	for (int i = 0; i < size; i = i + 1) {
	    a[i] = r.nextInt (max-min) + min;
	}
	return a;
    }

    public int sum13 (int[] nums) {
	int sum = 0;
	int n = 0;

	while (n < nums.length) {
	    if (nums [n] != 13) {
		sum = sum + nums[n];
		n = n + 1;
	    }
	    else {
		n = n + 2;//it is plus 2 because the number after a 13 doesn't count as well
	    }
	}
	return sum;
    }
    
    public boolean modThree(int[] nums) {
	int even = 0;
	int odd = 0;
	
	for (int i = 0; i < nums.length; i = i + 1) {
	    if (nums [i] % 2 == 0) {
		even = even + 1;
		odd = 0;
	    }
	    else {
		odd = odd + 1;
		even = 0;
	    }
	    if (even == 3 || odd == 3) {
		return true;
	    }
	}
	return false;
    }
}
