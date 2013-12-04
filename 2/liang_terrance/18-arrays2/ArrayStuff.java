import java.io.*;
import java.util.*;

public class ArrayStuff{
    public int[] RevFill(int n){
	int i = 0;
	int[] answer = new int[n];
	for (i = 0; i < n; i ++){
	    answer[i] = n - i;
	}
	return answer;
    }

    public int[] MakeRandom(int size, int min, int max){
	int[] answer = new int[size];
	Random r = new Random();
	int diff = max - min;
	int i = 0;
	for (i=0; i < size; i ++){
	    answer[i] = r.nextInt(diff) + 1;
	}
	return answer;
    }

    public int sum13(int[] nums) {
	int sum=0;
	int i = 0;
	while (i < nums.length){
	    if (nums[i]== 13){
		i = i + 2;
	    }
	    else {
		sum = sum + nums[i];
		i = i + 1;
	    }
	}
	return sum;
    }

    public boolean modThree(int[] nums) {
	boolean answer = false;
	String status = "odd";
	int streak = 0;
	int i = 0;
	for (i=0;i<nums.length;i++){
	    if (nums[i]%2 == 0){
		if (status.equals("even")){
		    streak = streak + 1;
		}
		else {
		    status = "even";
		    streak = 1;
		}
	    }
	    else {
		if (status.equals("odd")){
		    streak = streak + 1;
		}
		else {
		    status = "odd";
		    streak = 1;
		}
	    }
	    if (streak == 3){
		answer = true;
	    }
	}
	return answer;
    }

}
