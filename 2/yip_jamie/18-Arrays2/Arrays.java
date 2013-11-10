import java.io.*;
import java.util.*;

public class Arrays {
    public int[] revFill(int n){
	int[] a = new int[n];
	for (int i = 0; i < n; i++){
	    a[i] = i;
	}
	return a;
    }

    public int[] makeRandom(int size, int min, int max){
	Random r = new Random();
	int[] a = new int[size];
	for (int i = 0; i < size; i++){
	    a[i] = r.nextInt(max - min) + min;
	}
	return a;
    }

    public int sum13(int[] nums) {
	int a = 0;
	for (int i = 0; i <nums.length; i++){
	    if (nums[i] == 13){
		i++;}
	    else a = a + nums[i];
	}
	return a;
    }

    public boolean modThree(int[] nums) {
	int i = 0;
	int j = 0;
	for (int k = 0; k< nums.length; k++){
	    if (nums[k] % 2 == 0) {
		i = 0;
		j = j + 1;
	    }
	    else{
		i = i + 1;
		j = 0;
	    }
	    if (j == 3 || i == 3){
		return true;}}
	return false;
    }
}
