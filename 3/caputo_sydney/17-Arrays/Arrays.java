import java.io.*;
import java.util.*;

public class ArrayStuff {

    public int[] middleWay(int[] a, int[] b) {
  
	int[] intA;
	intA = new int[2];
	intA[0] = a[1];
	intA[1] = b[1] ;
	return intA;
    }

    public int[] makeEnds(int[] nums) {
	int[] endArray;
	int end = 0;
	endArray = new int[2];
	end = nums.length;
	intArray[0] = nums[0];
	intArray[1] = nums[end-1];
	return intArray;
    }

    public int[] fizzArray(int n) {
	int[] b = new int[n];
        for (int x=0; x!= n; x=x+1){
            b[x]= x;
        }
        return b;    }
    public boolean only14 (int[] nums){
	for (int x=0; x!= nums.length; x=x+1) {
            if (nums[x] == 1 || nums[x] == 4){
            }
            else {
                return false;
            }
        }
        return true;
    }



}   

