import java.io.*;
import java.util.*;

public class ArrayStuff {
    public int[] Revfill(int n) { 
	int i;
	int[] array = new int[n];
	for (i=n;i>0;i--) {
	    array[n-i]= i;
	}
	return array;
    }

    public int[] MakeRandom(int size, int min, int max) { 
	int[] result = new int[size];	
	int[] array = new int[max - min + 1];
	int i;
	for (i=0;i<array.length;i++) {
	    array[i] = min + i;
	}
	int x;
	for (x=0;x<result.length;x++) {
	    result[x] = array[new Random().nextInt(array.length)];
	}
	return result;
    }

    public int sum13(int[] nums) { 
	int i;
	int result=0;
	for (i=0;i<nums.length;i++) { 
	    if (nums[i] != 13) 
		result = result + nums[i];
	    else 
		return result;
	}
	return result;	
    }

    public boolean modThree(int[] nums) { 
	int i;
	boolean b=false;
	for (i=0;i<nums.length-2;i++) {
	    if (nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0)
		return true;
	    else if (nums[i]%2==1 && nums[i+1]%2==1 && nums[i+2]%2==1)
		return true;
	    else 
		b=false;
	}
	if (b==false) 
	    return false;
        else
            return true;
    }
}
