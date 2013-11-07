import java.io.*;
import java.util.*;

public class Arrays {
  
  public int[] middleWay(int[] a, int[] b) {
    int[] c = new int[2];
    int first = a[1];
    int last = b[1];
    c[0] = first;
    c[1] = last;
    return c;
  }

  public int[] makeEnds(int[] nums) {
    int[] a = new int[2];
    int first = nums[0];
    int last = nums[nums.length - 1];
    a[0] = first;
    a[1] = last;
    return a;
  }
  
  public int[] fizzArray(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i ++) {
      a[i] = i;
    }
  return a;
  }
  
  public boolean only14(int[] nums) {
    for (int i = 0; i < nums.length; i ++) {
      if (nums[i] != 1 && nums[i] != 4)
          return false;
    }
    return true;
  }

//tested all code on CodingBat
}
