import java.io.*;
import java.util.*;

public class Arrays2 {

    public int[] RevFill(int num) {
	int[] intArray;
	intArray = new int[num];
	int count = num;
	for (int i=0; i<num; i++) {
	    intArray[i] = count;
	    count = count - 1;
	}
	return intArray;
    }

    public int[] makeRandom(int size, int min, int max) {
	Random r = new Random();
	int[] intArray = new int[size];
	for (int i=0; i < size; i++) {
	    intArray[i] = r.nextInt(max-min+1) + min;
	}
	return intArray;
    }

    public int sum13(int[] nums) {
	int sum = 0;
	for (int i=0; i<nums.length; i++) {
	    if (nums[i] == 13) {
		i++; // skip the number that comes immediately after 13
	    }
	    else {
		sum = sum + nums[i];
	    }
	}
	return sum;
    }

    public boolean modThree(int[] nums) {
	int streak = 1;
	int i = 0;
	while (i < nums.length-1) {
	    if (streak == 3) {
		return true;
	    }
	    else if (nums[i]%2 == nums[i+1]%2) {
		streak = streak + 1;
		i++;
	    }
	    else {
		streak = 1;
		i++;
	    }
	}
	return (streak == 3);
    }
}				    
