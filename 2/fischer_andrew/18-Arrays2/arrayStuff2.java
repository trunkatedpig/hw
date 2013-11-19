import java.io.*;
import java.util.*;
import java.util.Arrays;

//Finish int RevFill(int n) which returns an array of size n where a0=n, a1=n-1 etc.
//Finish int MakeRandom(int size, int min, int max) which will create and return an array of size size where each element is a random value between min and max.
//sum13 – this is a codingbat problem.
//modthree – this is also a codingbat problem.

public class arrayStuff2 {
    
    public int[] RevFill(int n){
	int[] ans = new int[n];
	for(int i = n;i > 0; i--) {
	    ans[n-i] = i;
	}
	return ans;
    }
    
    public int MakeRandom(int size, int min, int max){
	int[] ans = new int[size];
	for(int i=size; i > 0;i--){
	    Random r = new Random();
	    int randomNum;
	    randomNum = min + (int)(r.nextInt()*max); 
	    ans[i] = randomNum;
	}
	return ans;
    }
    

    public int sum13(int[] nums) { 
	int ans = 0; 
	for(int i = 0; i < nums.length; i++) { 
	    if(nums.length != 0) { 
		if(nums[i] == 13 || i != 0 && nums[i - 1] == 13) {
		} 
		else {
		    ans = ans + nums[i]; 
		}
	    } 
	    else { 
		return 0; 
	    }
	} 
	return ans;
    }


    public boolean modThree(int[] nums) {
	boolean ans = false;
	for (int i = 0; i < nums.length-2; i++) { //not really sure why it's minus 2... it just works
	    if (
		(nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2 ==0) 
		|| 
		((nums[i] % 2 == 0) && (nums[i+1]%2==1) && (nums[i+2]%2= 1)))
		ans = true;
	}
	return ans;
    }
}
