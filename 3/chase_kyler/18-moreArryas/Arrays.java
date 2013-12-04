import java.util.*;
import java.io;*

public class Arrays {

	public int[] RevFill(int n) {
		int[] r = new int[n];
		int i = 0;
		for (;n>0;n--){
			r[i] = n;
			i++;}
		return r;
	}
	
	public int[] MakeRandom(int size, int min, int max) {
		int[] r = new int[size];
		Random rand = new Random()
		int i = 0;
		for (;i<size;i++)
			r[i] = r.nextInt(max-min) + min;
		return r;
	}

	public int sum13(int[] nums) {
		int r = 0;
		int i = 0;
		for (;i<nums.length;i++) {
			if (i > 0) {
				if (nums[i] != 13 && nums[i-1] != 13)
					r = r + nums[i];}
			else if (nums[i] != 13)
				r = r + nums[i];}
		return r;
	}

	public boolean modThree(int[] nums) {
		if (nums.length == 0)
			return false;
		int i = 1;
		int n = 1;
		int a;
		if (nums[0]%2 == 0)
			a = 1;
		else
			a = -1;
		for(;i<nums.length;i++) {
			if (nums[i]%2 == 0) {
				if (a == 1)
					n++;
				else if (a == -1) {
					a = 1;
					n = 1;}
			}
			else if (nums[i]%2 != 0) {
				if (a == -1)
					n++;
				else if (a == 1) {
					a = -1;
					n = 1;}
			}
			if (n==3)
				return true;
		}
		return false;
	}


	



}























