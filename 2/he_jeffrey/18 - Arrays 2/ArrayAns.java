import java.util.*;

public class ArrayAns {
	public int[] revFill(int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = n - 1 - i;
		}
		return result;
	}
	
	public int[] makeRandom(int size, int min, int max) {
		Random r = new Random();
		int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			result[i] = r.nextInt(max - min) + min;
		}
		return result;
	}
	
	public int sum13(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 13) {
				i = i + 1;
				continue;
			}
			result += nums[i];
		}
		return result;
	}
	
	public boolean modThree(int[] nums) {
		int odd = 0, even = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] % 2 == 0) {
				even += 1;
				odd = 0;
			}else{
				odd += 1;
				even = 0;
			}
			if (odd == 3)
				return true;
			else if(even ==3)
				return true;
		}
		return false;
	}
}