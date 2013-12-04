import java.io.*;
import java.util.*;

public class ArrayStuff {

public int[] middleWay(int[] a, int[] b) {
  
  int[] intArray;
  intArray = new int[2];
  intArray[0] = a[1];
  intArray[1] = b[1] ;
  return intArray;
}

public int[] makeEnds(int[] nums) {
  int[] intArray;
  int end = 0;
  intArray = new int[2];
  end = nums.length;
  intArray[0] = nums[0];
  intArray[1] = nums[end-1];
  return intArray;
}

public int[] fizzArray(int n) {
  int[] intArray;
  intArray = new int[n];
  for (int count = 0; count < n; count++) {
  intArray[count] = count;
  
  }
  return intArray;
  
  public boolean only14(int[] nums) {
  int num = nums.length;
  boolean test=true;
  for (int count = 0; count < num; count++) {
       if(nums[count] != 1 && nums[count] != 4) {
            test = false;
       } 
   }
  return test;
}

  
  
}

}