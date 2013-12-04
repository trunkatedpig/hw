import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Arrays2{
    public int[] RevFill(int n){
	int[] ans = new int[n];
	int i = 0;
	while(i<n){
	    ans[i] = n-i;
	    i +=1;
	}
	return ans;
    }

    public int[] makeRandom(int n, int min, int max){
	int[] ans;
	ans = new int[n];
	for(int i = 0; i<n ; i++){
	    int r = new Random().nextInt(max-min) + min;
	    ans[i] = r;
	}
	return ans;
    }

    public int sum13(int[] nums) {
	int sum = 0;
	int i = 0;
	while (i < nums.length){
	    if (nums[i] == 13){
		i = i + 2;
	    }
	    else{
		sum = sum + nums[i];
		i = i + 1;
	    }
	}
	return sum;
    }


    public boolean modThree(int[] nums) {
	int len = nums.length;
	int streak = 1;
	int curmod = 2;
	for(int i = 0; i <len; i++){
	    if (streak == 3){
		return true;
	    }
	    else if (nums[i]%2 == curmod){
		streak = streak +1;
		if(streak == 3){
		    return true;
		}
	    }
	    else if (nums[i]%2 != curmod){
		curmod = nums[i]%2;
		streak = 1;
	    }
	}
	return false; 
    }


}
