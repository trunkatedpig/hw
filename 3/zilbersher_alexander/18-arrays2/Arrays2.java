import java.io.*;
import java.util.*;

public class Arrays2 {

    public String printArray(int[] a) {
	String output = "";
	for (int i = a.length;i>0;i--) {
	    if (! output.equals("")){
		output = a[i-1] + ", " + output;
	    }else{
		output = a[i-1] + output;
	    }
	}
	return output;
    }

    public int[] Revfill(int n) {
	int[]output = new int[n];
        int i = 0;
        for(;n>0;n--) {
            output[i] = n-1;
            i ++;
        }
        return output;
    }

    public int[] makeRandom(int n, int min, int max) {
        int[]output = new int[n];
        Random r = new Random();
        for (;n>0;n--) {
            output [n-1] = r.nextInt(max-min-1)+min+1;
        }
        return output;
    }

    public int sum13(int[] a) {
        int output = 0;
        for (int n = 0;n<a.length;n++) {
	    if (a[n] != 13) {
		output = output + a[n];
	    } else {
		n++;
	    }
	}
        return output;
    }

    public boolean modThree(int[] nums) {
	boolean output = false;
	for (int i=0;i<nums.length-2;i++) {
	    if (nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0) {
		output = true;
	    } else if (nums[i]%2!=0 && nums[i+1]%2!=0 && nums[i+2]%2!=0) {
		output = true;
	    }
	}
	return output;
    }
}
