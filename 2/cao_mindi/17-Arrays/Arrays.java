import java.io.*;
import java.util.*;

public class Arrays{
    public int[] middleWay(int[] a, int[] b) {
	int[] intArray;
	intArray = new int[2];
	intArray[0] = a[1];
	intArray[1] = b[1];
	return intArray;
    }
  

 public int[] makeEnds(int[] nums) {
  int[] intArray;
  intArray = new int[2];
  intArray[0] = nums[0];
  intArray[1] = nums[nums.length - 1];
  return intArray;
}

public int[] fizzArray(int n) {
  int[] intArray;
  intArray = new int[n];
  for(int x = 0; x < n; x = x + 1){
  intArray[x] = x;
  }
  return intArray;  
}

public boolean only14(int[] nums) {
  int a = 0;
  for (int x = 0; x < nums.length; x = x + 1){
  if (nums[x] != 1 && nums[x] != 4){
  a = 1;
  }
  }
  return a == 0;
}
}
