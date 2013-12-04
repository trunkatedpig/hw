import java.io.*;
import java.util.*;

public class ArrayStuff {

    public int[] revFill(int n) {
        int[] o = new int[n];
        for (int q=(o.length-1); q>=0; q=q-1){
            o[q] = q;
        }
        return o;
    }
    //^haven't tested this :/

    public int[] makeRandom(int size, int min, int max){
	int[] o = new int[size];
	Random r = new Random();
	for (int i=0;i<=size;i++){
	    o[i] = r.nextInt(max-min+1) + min;
	}
	return o;
    }
    //^haven't tested this :/

    public int sum13(int[] nums) {
	int sum = 0;
	int n = nums.length;
	for (int i=0;i<n;i++){
	    if (nums[i] == 13){
		continue;
	    }
	    else if ((i>0)&&(nums[i-1] == 13)){
		continue;
	    }
	    else
		sum += nums[i];
	}
	return sum;
    }
    //^works

    public boolean modThree(int[] nums) {
	int n = nums.length;
	int oddrow = 0;
	int evenrow = 0;
	for (int i=0;i<n;i++){
	    if (nums[i]%2==1){
		oddrow += 1;
		evenrow = 0;
	    }
	    if (nums[i]%2 == 0){
		oddrow = 0;
		evenrow += 1;
	    }
	    if (oddrow == 3){
		return true;
	    }
	    if (evenrow == 3){
		return true;
	    }
	    else
		continue;
     
	}
	return false;
    }
    //^works


}
