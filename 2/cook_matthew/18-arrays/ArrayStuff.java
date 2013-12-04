import java.io.*;
import java.util.*;

public class ArrayStuff {
    public int[] revFill(int n) { 
	int[] o = new int[n];
	int x=0;
	for (int q=(o.length-1); q>=0; q=q-1){
	    o[x]= q; 
	    x=x+1;
	} 
	return o; 
    }
    
    public int[] makeRandom(int size, int min, int max) {
	int[] o = new int[size];
	Random r = new Random();
	int diff=max-min+1;
	for (int q=0; q < size; q=q+1){
	    o[q]=r.nextInt(diff)+min;
	}
	return o;
    }
    public int sum13(int[] nums) {
	int ans=0;
	for (int q=0; q<nums.length; q++) {
	    if (nums[q]!=13) {
		ans=ans+nums[q];
	    }
	    else{
		q=q+1;
	    }
	}
	return ans;
    }
    public boolean modThree(int[] nums) {
	int oddStreak=0;
	int evenStreak=0;
	for (int q=0; q<nums.length; q++) {
	    if ((nums[q]%2) == 1) {
		oddStreak=oddStreak+1;
		evenStreak=0;
	    }
	    if ((nums[q]%2) == 0){
		oddStreak=0;
		evenStreak=evenStreak=evenStreak+1;
	    }
	    if (oddStreak==3) {
		return true;
	    }
	    if (evenStreak == 3) {
		return true;}
	    else 
		continue;
	}
	return false;
    }
   
}