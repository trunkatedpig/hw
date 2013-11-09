import java.io.*;
import java.util.*;

public class Array {
    public int[] Revfill(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
	 	   a[i] = n - i;
		}
		return a;
    }

    public int[] MakeRandom(int size, int min, int max) {
    	int[] a = new int[size];
    	Random r = new Random();
    	for (int i = 0; i < size; i++) { 
    		a[i] = r.nextInt(max - min + 1) + min;
    	}
    	return a;
    }
    public int sum13(int[] nums) {
  		int sum = 0;
  		if (nums.length != 0) {
  			for (int i = 0; i < nums.length; i++) {
  				if (nums[i] == 13) {
  					i = i + 1;
  				}
  				else {
  					sum = sum + nums[i];
  				}
  			}
  		}
  		return sum;
	}
	public boolean modThree(int[] nums) {
  		int evens = 0, odds = 0;
  		for (int i = 0; i < nums.length; i++){
  			if (nums[i] % 2 == 0) {
  				evens = evens + 1;
  				odds = 0;
  			}
  			else {
  				evens = 0;
  				odds = odds + 1;
  			}
  			if (evens == 3 || odds == 3) {
  				return true;
  			}
  		}
  		return false;
	}
}