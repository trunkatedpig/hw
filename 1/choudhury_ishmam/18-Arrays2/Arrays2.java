import java.io.*;
import java.util.*;

public int[] revFill(int n) {
	int[] intArray == new int[n];
	int num = n;
	for (int i = 0; i < n; i++) {
		intArray[i] = num;
		num = num - 1;
	}
	return intArray;
}

public int MakeRandom(int size, int min, int max) {
	int[] intArray == new int[size];
	Random r = new Random(); 
	for (int i = 0 ; i < size ; i++) {
		intArray[i] = r.nextInt(min) + (max - min);
	}
	return intArray;
}

public int sum13(int[] nums) {
  int sum = 0; 
  if (nums.length == 0) 
	{return 0;}
  
  else {
	for (int i = 0; i < nums.length; i++) {
		if (i == 0 && nums[i] != 13) {
			sum = sum + nums[i]; 
			}
		else if (nums[i] != 13 && nums[i-1] != 13) {
			sum = sum + nums[i];}
			}
		return sum;
	}
}

public boolean modThree(int[] nums) {
  int conOdd = 0;
  int conEven= 0;
  boolean res = false;
  for (int i = 0; i < nums.length; i++) {
	if (nums[i] % 2 == 0) {
		conEven = conEven + 1;
		conOdd = 0;
	}  
	if (nums[i] % 2 == 1) {
		conEven = 0;
		conOdd = conOdd + 1;
	}
	if ( (conOdd == 3) || (conEven == 3) ) {
		res = true;
		break;
		}
	}
  return res;  
}
