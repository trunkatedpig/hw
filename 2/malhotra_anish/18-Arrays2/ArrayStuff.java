import java.io.*;
import java.util.*;

public class ArrayStuff {
	// # 1
	public int[] Revfill(int n){
		int[] result = new int[n];
		for(int i = 0;i<n;i++){
			result[i] = n - i;
		}
		return result;
	}
	
	//#2
	public int[] makeRandom(int size,int min,int max){
		int[] result = new int[size];
		Random randgen = new Random();
		int range = max - min + 1;
		for(int i = 0;i<result.length;i++){
			result[i] = randgen.nextInt(range) + min;
		}
		return result;
	}
	
	/*public String printArray(int[] result){
		String res = "[";
		for(int i = 0;i<result.length;i++){
			res += result[i];
			if(i<(result.length) - 1)
				res += ",";
		}
		res += "]";
		return res;
	}*/
	
	//#3
	public int sum13(int[] nums) {
	    int sum = 0;
	    boolean prev13 = false;
	    int i = 0;
	    while(i<nums.length){
	         if(nums[i] == 13){
	             i = i + 1;
	             prev13 = true;
	         }else if (prev13){
	             i = i + 1;
	             prev13 = false;
	         }else{
	             sum = sum + nums[i];
	             i = i + 1;
	         }
	    }
	    return sum;
	}
	
	//#4
	public boolean isEven(int n){
	     if (n % 2 == 0){
	          return true;
	     }
	     return false;
	}

	public boolean modThree(int[] nums) {
	  int evenCount = 0;
	  int oddCount = 0;
	  
	  for(int i = 0;i<nums.length;i++){
	      if (isEven(nums[i])){
	           evenCount = evenCount + 1;
	           oddCount = 0;
	      }else{
	           oddCount = oddCount + 1;
	           evenCount = 0;
	      }
	      
	      if(evenCount ==  3 || oddCount == 3){
	           return true;
	      }
	  }
	  return false;
	}

}
