import java.util.*;
import java.io.*;
import java.util.Arrays;


public class Array2{

    public String RevFill(int n){
	int[] retA = new int[n];
	int input = n;
	for (int i=0; i<retA.length; i++){
	    retA[i] = n;
	    n=n-1;
	    // System.out.println(retA[i]);
	}
        return Arrays.toString(retA);
    }

    public int[] MakeRandom(int size, int min, int max){
	int range = max-min;
	int[] retA = new int[size];
	Random r = new Random();
	int input = r.nextInt(range)+min;
	for (int i = 0; i<retA.length;i++){
	    retA[i] = input;
	    input = r.nextInt(range)+min;
	    //System.out.print(retA[i]+"\n");
	}
	return retA;
    }


    public int sum13(int[] nums) {
	int sum = 0;
	if (nums.length==0)
	    return sum;
	else {
	    for (int i=0;i<nums.length-1;i++){
		if (nums[i] == 13){
		    i = i+2;
		}
		else{
		    sum = nums[i] + sum;
		}
	    }
	    return sum; 

	}
    }



    public boolean modThree(int[] nums){
	int i=1;
	while (i <= nums.length-2){
	    if ((nums[i-1]%2==0 && nums[i]%2 ==0 && nums[i+1]%2 ==0) || (nums[i-1]%2!=0 && nums[i]%2 !=0 && nums[i+1]%2 !=0))
		return true;
	    else
		i = i+1;
	}
	return false;

    }
    


}
