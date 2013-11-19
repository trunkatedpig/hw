import java.io.*;
import java.util.*;

public class Array {
    public int[] RevFill(int n) {
	int[] result = new int[n];
	for (int i = 0;i < n;i++) {
	    result[i] = n - i;
	}
	return result;
    }

    public int[] MakeRandom(int size, int min, int max) {
	int[] result = new int[size];
	for (int i = 0;i < size;i++) {
	    Random r = new Random();
	    int num = r.nextInt(max - min) + min;
	    result[i] = num;
	}
	return result;
    }

    public int sum13(int[] nums) {
	int sum = 0;
	for (int i = 0; i < nums.length; i++) {
	    if (nums[i] != 13)
		sum = sum + nums[i];
	    else
		i = i + 1;
	}
	return sum;
    }

    public boolean modThree(int[] nums) {
	int evens = 0;
	int odds = 0;
	for (int i = 0;i < nums.length;i++) {
	    if (nums[i]%2 == 0) {
		odds = 0;
		evens = evens + 1;
	    }
	    else {
		evens = 0;
		odds = odds + 1;
	    }
	    if (evens == 3 || odds == 3)
		return true;
	}
	return false;
    }

}