import java.io.*;
import java.util.*;

public boolean only14(int[] nums) {
  boolean result = true;
  
  for (int i = 0; i <= nums.length -1; i++){
    if (nums[i] == 1 || nums[i] == 4) {
      result = true;
    }
  else {result = false; break;}
    } 
    return result;
}