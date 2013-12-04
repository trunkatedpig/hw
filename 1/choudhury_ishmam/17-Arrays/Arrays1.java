import java.io.*;
import java.util.*;

public int[] middleWay(int[] a, int[] b) {
  int x = a[1];
  int y = b[1];
  int[] fin = {x, y};
  return fin;
}

public int[] makeEnds(int[] nums) {
  int[] fin = new int[2];
  fin[0] = nums[0];
  fin[1] = nums[nums.length-1];
  return fin;
}

public int[] fizzArray(int n) {
  int[] x = new int[n];
  for (int i = 0; i < n; i++) {
	x[i] = i; 
	}
  return x;
}

public boolean only14(int[] nums) {
  boolean x = true;
  for (int i = 0; i < nums.length; i++) {
	if (nums[i] == 1 || nums[i] == 4)
		x = true;
	else {
		x = false;
		break;}
	}
  return x;   
}

