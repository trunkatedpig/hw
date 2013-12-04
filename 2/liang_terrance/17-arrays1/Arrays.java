import java.io.*;
import java.util.*;

public class Arrays{
    public int[] middleWay(int[] a, int[] b) {
	int[] n = new int[2];
	n[0]=a[1];
	n[1]=b[1];
	return n; 
    }

    public int[] makeEnds(int[] nums) {
	int[] answer = new int[2];
	int i = nums.length;
	answer[0]=nums[0];
	answer[1]=nums[i-1];
	return answer;
    }

    public int[] fizzArray(int n) {
	int[] answer = new int[n];
	int a = 0;
	for (a = 0; a < n; a++){
	    answer[a]=a;
	}
	return answer;
    }

    public boolean only14(int[] nums) {
	int a = 0;
	boolean answer = true;
	for (a = 0; a<nums.length; a++){
	    if ((nums[a] != 1)&&(nums[a] != 4)){
		answer = false;
	    }
	}
	return answer;
    }

}
