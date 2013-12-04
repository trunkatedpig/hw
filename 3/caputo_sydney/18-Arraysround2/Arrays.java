import java.util.*;
import java.io.*;

public class Arrays {
    public int[]  RevFill(int n) {
	    int[] r = new int[n];
	    int i = 0;
	    for (;n>0;n--){
		r[i] = n;
		i++;}
	    return r;
        }

    //sara's answer that we reviewed in class
    public int[] MakeRandom(int size, int min, int max){
	int[] ans= new int[size];
	for(int i=0; i< size; i++){
	    ans[i]=((int)Math.round(Math.random()*(max-min-2)))+min+1;
	}
	return ans;

    }
    
    public int sum13(int[] nums) {
	int ans=0;
	int index=0;
	while (index<nums.length){
	    if (nums[index] !=13){
		ans=ans+nums[index];
		index++;
	    }
	    else {
		index=index+2;}
	}
	return ans;
    }

    public boolean modThree(int[] nums) {
           
	for (int i=0; i+2<nums.length; i++){
            if(nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0){
                return true;
            }
            else if(nums[i]%2 !=0 && nums[i+1]%2 !=0 && nums[i+2]%2 !=0){
                return true;
            }
        }
        return false;
    }
  


}
