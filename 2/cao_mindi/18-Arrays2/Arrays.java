import java.io.*;
import java.util.*;

public class Arrays{

public int[] RevFill(int n){
	int x = 0;
	int[] intArray;
	intArray = new int[n];
	while (n > 0){
	    intArray[x] = n;
	    x = x + 1;
	    n = x -1;
	}
	return intArray;
}

public int[] MakeRandom(int size, int min, int max){
    int[] intArray;
    int r = 0;
    intArray = new int[size];
    while (size > 0){
	r = min + (int)(Math.random()*(max - min + 1));
	intArray[size - 1] = r;
			
}
    return intArray;
}

public int sum13(int[] nums) {
  int result = 0;
  for (int n =0; n < nums.length; n = n + 1){
  if (nums[n] == 13){
  n = n +1;
  }
  else{
  result = result + nums[n];
  }
  }
  return result;
}

public boolean modThree(int[] nums) {
  boolean b = false;
  for (int n = 0; n < nums.length - 2; n = n + 1){
  if (nums[n]%2 == nums[n + 1]%2 && nums[n]%2 == nums[n + 2]%2){
  b = true;
  }
}
return b;
}

    }
    
