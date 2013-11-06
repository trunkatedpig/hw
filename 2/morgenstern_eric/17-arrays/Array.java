import java.io.*;
import java.util.*;
public class Arrays{
    public int[] middleWay(int[] a, int[] b){
	int[] c = new int[2];
	c[0] = a[1];
	c[1] = b[1];
	return c;
    }
    public int [] makeEnds(int[] nums){
	int[] a = new int[2];
	int b = nums.length - 1;
	a[0] = nums[0];
	a[1] = nums[b];
	return a;
    }
    public int[] fizzArray(int n){
	int[] a = new int[n];
	int b = 0;
	while (b < n){
	    a[b] = b;
	    b++;
	}
	return a;
    }
    public boolean only14(int[] nums){
	boolean b = true;
	for (int a = 0; a < nums.length ; a++){
	    if ((nums[a] != 1) && (nums[a] != 4)){
		b = false;
	    }
	}
	return b;
    }
}
