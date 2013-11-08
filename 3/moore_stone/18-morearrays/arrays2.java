import java.io.*;
import java.util.*;

public class arrays2{

    public int[] RevFill(int n){
	int[] result;
	result = new int[n];
	int i = 0;
	while (n > 0){
	    result[i] = n;
	    i = i + 1;
	    n = n - 1;
	}
	return result;
    }

    public int[] MakeRandom(int size, int min, int max){
        Random r = new Random();
	int[] result = new int[size];
	int i = 0;
	while (i < size){
	    result[i] = r.nextInt(max + 1 - min) + min;
	    i = i + 1;
	}
	return result;
    }
    
    public int sum13(int[] nums) {
	int i = 0;
	int result = 0;
	while (i < nums.length){
	    if (nums[i] == 13)
		i = i + 2;
	    else{
		result = result + nums[i];
		i = i + 1;
	    }
	}
	return result;
    }
    
    public boolean modThree(int[] nums) {
	int i = 0;
	while (i < nums.length - 2){
	    if (nums[i] % 2 == 0 && nums[i+1] % 2 == 0 && nums[i+2] % 2 == 0)
		return true;
	    if (nums[i] % 2 == 1 && nums[i+1] % 2 == 1 && nums[i+2] % 2 == 1)
		return true;
	    i = i + 1;
	}
	return false;
    }
}
