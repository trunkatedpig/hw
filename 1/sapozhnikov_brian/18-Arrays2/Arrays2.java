import java.io.*;
import java.util.*;

public class Arrays2 {
    public int[] Revfill(int n){
	int[] ans = new int[n];
	for (int i=n;i>0;i--){
	    ans[n-i]=i;
	}
	return ans;
    }

    public int[] MakeRandom(int size, int min, int max){
	int[] ans = new int[size];
	for (int i=0;i<size;i++){
	    int r = (int)(min + (Math.random()*(max-min)));
	    ans[i] = r;
	}
	return ans;
    }

    public int sum13(int[] nums) {
	int ans = 0;
	for(int i=0;i<nums.length;i++){
	    if(nums[i]==13)
		i=i+1;
	    else
		ans = ans + nums[i];
	}
	return ans;
    }

    public boolean isEven(int n){
	return n/2 == n/2.0;
    }
    
    public boolean modThree(int[] nums) {
	if(nums.length<3)
	    return false;
	boolean b=isEven(nums[0]);
	int n=1;
	for(int i=1;i<nums.length;i++){
	    if(isEven(nums[i])==b)
		n = n + 1;
	    else{
		n = 1;
		b = !b;
	    }
	    if(n>=3)
		return true;
	}
	return false;
    }
}
