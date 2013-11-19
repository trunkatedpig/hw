import java.io.*;
import java.util.*;

public class Arrays2{ 
    public int[] RevFill(int n){
	int[] a = new int[n];
	for (int i=0;i<n;i++){
	    a[i]= n - i;}
	return a;
    }


    public int[] MakeRandom(int size, int min, int max){
	Random r = new Random();
	int[] a = new int[size];
	for (int i = 0; i < size; i ++){
	    a[i] = r.nextInt(max - min) + min;}
	return a;
    }
    public int sum13(int[] nums) {
	int a = 0;
	for (int i = 0; i < nums.length; i ++){
      if (nums[i] == 13){
	  i ++;}
      else { a = a + nums[i];}
	}
	return a;
    }
    public boolean modThree(int[] nums) {
	int j= 0;
	int k= 0;
	for (int i=0; i < nums.length; i ++){
	    if (nums[i] % 2 == 0){
		j = j + 1;
		k = 0;} 
	    else {
		k = k + 1;
		j = 0;}
	    if ( j == 3 || k == 3) {return true;}}
	return false;
    }
}
