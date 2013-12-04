import java.io.*;
import java.util.*;

public class codingBat {

/* Given two int arrays,a and b, each length 3,return
a new array length 2 containing their middle elements */

public int[] middleWay(int[] a, int[] b) {
	int[] middleInts = new int[2];
	middleInts[0] = a[1];
	middleInts[1] = b[1];
	return middleInts;
}

/* Given an array of ints, return a new array length 2 containing
the first and last elements from the orginal array. The original
array will be length 1 or more */

public int[] makeEnds(int[] nums) {
	int[] endPoints = new int[2];
	endPoints[0] = nums[0];
	endPoints[1] = nums[nums.length - 1];
	return endPoints;
}

/* Given a number n, create and return a new array of length n,
containing numbers 0, 1,2,...,n-1. The given n may be 0, in which
case return a length 0 array */

public int[] fizzArray(int n) {
  int[] Fizz = new int[n];
  for (int i=0; i<n; i++)
    Fizz[i] = i;
  return Fizz;

}

/* Given an array of ints, return true if every element is a 1 or 4 */

public boolean only14(int[] nums) {
   int i= 0;
   while (i<nums.length){
     if (nums[i]==1 || nums[i]==4)
       i++;
     else
       return false;}
    return true;
 }

}