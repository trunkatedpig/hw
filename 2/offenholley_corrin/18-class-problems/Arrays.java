import java.io.*;
import java.util.*;

public class Arrays{

    public int[] RevFill(int n){
        int[] ans;
        ans = new int[n];
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
        for(int i = n; i>0; i--){
            r = (int)(math.random()*max + min);
            ans[i-1] = r;
        }
        return ans;
    }
    public int sum13(int[] nums) {
	 int ans = 0;
	 int i = 0;
	 int badluck=0;
	 while (i<nums.length){
	    ans+=nums[i];
	    if (badluck==1 && nums[i] != 13){
	 	ans= ans - nums[i];
	    }
	    badluck=0;
	    if (nums[i]==13){
		ans=ans - 13;
		badluck=1;
	    }
	    i+=1;
	 }
	 return ans;
    }
    public boolean modThree(int[] nums) {
	 int third;
	 int second;
	 int first;
	 third=-1;
	 second=-1;
	 first=-1;
	 int i=0;
	 while (i<nums.length){
	    third=second;
	    second=first;
 	    first=nums[i] % 2;
	    if (third==second && second==first){
		return true;
	    }
	    i+=1;
	 }
	 return false;
    }

}
