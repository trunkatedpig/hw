import java.io.*;
import java.util.*;

public class Arrays{

    //everthing has been tested in the coding bat

    public int[] middleWay(int[] a, int [] b){
	int x = a[1];
	int y = b[1];
	int [] mid = {x,y};
	return mid; 
    }

    public int[] makeEnds(int[] nums){
	int i = nums.length;
	int x = nums[0];
	int y = nums[i-1];
	int[] ends = {x,y};
	return ends;
    }

    public int[] fizzArray(int n){
	int[] fizz = new int[n];
	for (int x = 0; x < n; x ++){
	    fizz[x] = x;
	}
	return fizz;
    }

    public boolean only14(int[] nums){
	boolean b = true;
	int i = nums.length;
	for (int x = 0; x < i && b == true; x++){
	    b = (nums[x]==1 || nums[x]==4);
	}
	return b;
    }
}
