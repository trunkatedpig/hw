import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Arrays {
    
    public int RevFill(int n){
	int[] ans = new int[n];
	int i = 0;
	while(i < n){
	    ans[i] = n-i;
	    i = i + 1;
	}
	return ans;
    }

    public int[] makeRandom(int size, int min, int max){
	int[] ans = new int[size];
	for (int i =0; i < size; i++){
	    int r = new.Random().nextInt(max-min) + min;
	    ans[i] = r;
	}
	return ans;
    }

    public int sum13(int[] nums){
	int sum = 0;
	int i = 0;
	while (i < nums.length){
	    if (nums[i] == 13){
		i = i + 2}
	    else {
		sum = sum + nums[i];
		i = i + 1;
	    }
	}
	return sum;
    }

    public boolean modThree(int[] nums){
	int oddStreak = 0;
	int evenStreak = 0;
	int i = 0;
	while (i < nums.length){
	    if (nums[i]%2 == 0){
		evenStreak = evenStreak + 1;
		oddStreak = 0;
	    }
	    if (nums[i]%2 == 1){
		oddStreak = oddStreak + 1;
		evenStreak = 0;
	    }

	    i = i + 1;
	    if (oddStreak == 3 || evenStreak == 3){
		return true;
	    }
	}
	return false;
    }
