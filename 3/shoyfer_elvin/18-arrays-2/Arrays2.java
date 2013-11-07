import java.io.*;
import java.util.*;

// The solutions to these homework problems are contained within the class Arrays2.

public class Arrays2 {

	// Problem 1 
	public int[] RevFill(int n) {
		int[] answer = new int[n];
		int nCopy = n;
		for (int i = 0; i < n; i++) {
			answer[i] = nCopy;
			nCopy--;
		}
		return answer;
	}


	// Problem 2

	public int[] MakeRandom(int size, int min, int max) {
		int[] answer = new int[size];
		Random r1 = new Random();
		for (int i = 0; i < size; i++) {
			int rangeInclusive = max - min + 1;
			int baseRandom = r1.nextInt(rangeInclusive);
			int trueRandom = baseRandom + min; 
			answer[i] = trueRandom; 
		}
		return answer;
	}

	// Problem 3 

	public int sum13(int[] nums) {
		boolean ignore = false;
		int sum = 0; 
		int numsLength = nums.length;
		for (int i = 0; i < numsLength; i++) {
			int thisNum = nums[i];
			// 3 cases from here 
			if (thisNum == 13) {
				ignore = true;
			} else if (ignore) {
				if (thisNum != 13) { // Account for consecutive 13s.
					ignore = false;
				} 
			} else {
				sum = sum + thisNum;
			}
		}
		return sum;
	}

	// Problem 4

	public boolean isOdd(int num) {
		return (num % 2 != 0);
	}

	public boolean isEven(int num) {
		return !isOdd(num);
	}

	public boolean modThree(int[] nums) {
		int numsLength = nums.length;
		for(int i = 0; i < numsLength - 2; i++) {
			int thisNum = nums[i];
			int thisNum2 = nums[i+1];
			int thisNum3 = nums[i+2];
			// 3 consecutive nums of the array 
			if ((isOdd(thisNum) && isOdd(thisNum2) && isOdd(thisNum3))) {
				return true;
			}

			if ((isEven(thisNum) && (isEven(thisNum2) && (isEven(thisNum3))))) {
				return true;
			}

		}
		return false;
	}

}