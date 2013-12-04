import java.io.*;
import java.util.*;

public class Arrays{
  
  //Arrays-1>middleWay
  public int[] middleWay(int[] a, int[] b) {
    int[] middle = new int[2];
    middle[0] = a[1];
    middle[1] = b[1];
    return middle;
}

  //Arrays-2>makeEnds
  public int[] makeEnds (int[] nums) {
    int[] ends = new int[2];
    ends[0] = nums[0];
    ends[1] = nums[nums.length-1];
    return ends;
  }
  
  //Arrays-2>fizzArray
  public int[] fizzArray (int n){
    int[] array = new int[n];
    int j = 0;
    int z = 0;
    for (j = 0; n>j; j=j+1) {
      array[j]= z;
      z = z + 1;
            }
    return array;
  }
  
  //Array-2>only14
  public boolean only14 {int[] nums} {
   for (int i = 0; i<nums.length; i=i+1){
     if (nums[i] != 1 && nums[i] != 4) {
       return false;
     }
   }
     return true;
  }
}
   
    
   
  
  
  
