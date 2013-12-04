import java.util.*;
import java.io.*;
public class Arrays2 {
    public int[] revFill(int n){
	int[] a = new int[n];
	for (int b = n;b>=0;b--){
	    a[n-b] = b;
	}
	return a;
    }
    public int[] MakeRandom(int size, int min, int max){
	int[] a = new int[size];
	Random r = new Random();
	for(int b=0;b<size;b++){
	    a[b] = r.nextInt(max - min + 1) + min;
	}
	return a;
    }
    public int sum13(int[] nums){
	int a = 0;
	int sum = 0;
	for(int b = 0;b>nums.length;b++){
	    if ((nums[b] != 13) && (a != 13)){
		sum = sum + nums[b];
	    }
	    a = nums[b];
	}
	return sum;
    }	
    public boolean modThree(int[] nums){
	for (int a = 0;a<nums.length-1;a++){
	    if (((nums[a] % 2) == 0) && ((nums[a+1] % 2) == 0) && ((nums[a+2] % 2) == 0))
		return true;
	    else if (((nums[a] % 2) == 1) && ((nums[a+1] % 2) == 1) && ((nums[a+2] % 2) == 1))
		return true;
	}
	return false;
    }
}
