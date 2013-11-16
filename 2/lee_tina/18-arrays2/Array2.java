import java.io.*;
import java.util.*;

public class Array2{

    public int[] RevFill(int n){
	int[] result = new int[n];
	for (int i = 0; i < n; i++){
	    result[i] = n - i;
	}
	return result;
    }

    public int[] makeRandom(int n, int min, int max){
	Random r = new Random();
	int[] result = new int[n];
	for (int i = 0; i < n; i++){
	    result[i] = r.nextInt(max - min) + min;
	}
	return result;
    }

    public int sum13(int[] nums){
	int sum = 0;
	for (int ind = 0; ind < nums.length; ind ++){
	    if (nums[ind] == 13)
		ind = ind + 1;
	    else
		sum = sum + nums[ind];
	}
	return sum;
    }

    public boolean modThree(int[] nums){
	int count = 0;
	if (nums.length < 3)
	    return false;
	else{
	    String last;
	    for (int ind = 1; ind < nums.length; ind ++){
		last = evenOdd(nums[ind - 1]);
		if (evenOdd(nums[ind]).equals(last)){
		    count = count + 1;
		    if (count == 2)
			return true;
		}
		else
		    count = 0;
	    }
	}
	return false;
    }
    public String evenOdd(int i){
	if (i % 2 == 0)
	    return "even";
	else
	    return "odd";
    }
    

	    
}
