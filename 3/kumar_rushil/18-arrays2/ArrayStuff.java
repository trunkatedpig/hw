import java.io.*;
import java.util.*;

public class ArrayStuff{

    public int[] RevFill(int n){
	int[] rev = new int[n];
	int y = n;
	for (int x = 0; x < n; x ++){
	    rev[x] = y;
	    y--;
	}
	return rev;
    }

    public int[] MakeRandom(int size, int min, int max){
	Random r = new Random();
	int x,y;
	x = max - min;
	int[] mr = new int[size];
	for (int i = 0; i < size; i++){
	y = r.nextInt(x - 1);
	y = y + min + 1;
	mr[i] = y;
	}
	return mr;
    }
    //CodingBat problems are tested on the website
    public int sum13(int[] nums){
	int sum = 0;
	int x = nums.length;
	for (int i = 0; i < x; i ++)
	    if (nums[i] == 13){
		i++;
	    }
	    else {
		sum = sum + nums[i];
	    }
	return sum;
    }

    public boolean modThree(int[] nums){
	int k = nums.length;
	boolean b = false;
	for (int i = 0; (i < (k-2)) && b == false; i ++){
	    int x = nums[i];
	    int y = nums[i+1];
	    int z = nums[i+2];
	    x = x%2;
	    y = y%2;
	    z = z%2;
	    if (x == 0 && y == 0 && z == 0){
		b = true;
	    }
	    else {
		if (x == 1 & y == 1 && z == 1){
		    b = true;
		}
		else {
		    b = false;
		}
	    }
	}
	return b;
    } 

}
