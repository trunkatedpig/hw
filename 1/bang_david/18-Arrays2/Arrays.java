import java.io.*;
import java.util.*;

public class Arrays {
    Random r = new Random ();

    public int [] RevFill (int n) {
	int [] a = new int [n];
	for (int b = 0 ; b < n ; b++) {
	    a [b] = n - b;
	}
	return a;
    }

    public int [] MakeRandom (int size, int min, int max) {
	int [] a = new int [size];
	for (int b = 0; b < size; b++){
	    a [b] = (min +  r.nextInt(max - min + 1));
	}
	return a;
    }


    public int sum13(int[] nums) {
	int a = 0;
        for(int b=0;b<nums.length;b++){
            if(nums[b]==13){
                b++;
	    }
            else {
                a = a + nums[b];
	    }
        }
        return a;
    }

    public boolean modThree(int[] nums) {
	int even = 0;
	int odd = 0;
	for (int b = 0; b < nums.length; b ++) {
	    if (nums [b] % 2 == 0){
		even = even + 1;
		odd = 0;
	    }
  
	    else {
		odd = odd + 1;
		even = 0;
	    }
	    if (even == 3 || odd == 3) {
		return true;
	    }
	}
	return false;
    }
}



				
