import java.io.*;
import java.util.*;

public class Arrays2{
    public int[] RevFill(int n){
	int[] rev = new int[n];
	for (int i = 0; i < n; i++){
	    rev[i] = n - i;
	}
	return rev;
    }

    public int[] MakeRandom(int size, int min, int max){
	int[] randarr = new int[size];
	int range = max - min;
	Random r = new Random();
	for (int i = 0; i < size; i++){
	    randarr[i] = r.nextInt(range+1) + min;
	}
	return randarr;
    }

    public int sum13(int[] nums){
	if (nums.length == 0)
	    return 0;
	else{
	    int sum = 0;
	    for (int i = 0; i < nums.length; i++){
		if (nums[i] == 13)
		    i = i + 1;
		else
		    sum = sum + nums[i];
	    }
	    return sum;
	}
    }
    
    public boolean modThree(int[] nums){
	int countOdd = 0;
	int countEven = 0;
	for (int i = 0; i < nums.length; i++){
	    if (nums[i] % 2 == 0){
		countOdd = 0;
		countEven = countEven + 1;
		if (countEven == 3)
		    return true;
	    }
	    else{
		countEven = 0;
		countOdd = countOdd + 1;
		if (countOdd == 3)
		    return true;
	    }
	}
	return false;
    }

    public String toString(int[] nums){
	return Arrays.toString(nums);
    }
}
