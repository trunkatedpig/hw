import java.io.*;
import java.util.*;

public class classarraywork {
    
    public int[] revfill(int n) {
	int [] result = new int [n];
	int i = 0;
	for (int k = n; k > 0; k--) {
	    result [i] = k;
	    i = i + 1;
	}
	return result;
    }

    public int[] makeRandom(int n, int min, int max) {
	int [] result = new int [n];
	for (int i = 0; i < n; i++) {
	    Random r = new Random();
	    result[i] = r.nextInt(max - min + 1) + min;
	}
	return result;
    }
    
    public int sum13(int[] nums) {
	int i = 0;
	int result = 0;
	while (i < nums.length) {
	    if (nums[i] != 13) {
		result = result + nums[i];
		i = i + 1;
	    }
	    else {
		i = i + 2;
	    }
	}
	return result;
    }
 public boolean modThree(int[] nums){
        int oddStreak = 0;
        int evenStreak = 0;
        int i = 0;
        while (i < nums.length){
            if (nums[i]%2 == 0){
                evenStreak = evenStreak + 1;
                oddStreak = 0;
            }
            if (nums[i]%2 == 1){
                oddStreak = oddStreak + 1;
                evenStreak = 0;
            }

            i = i + 1;
            if (oddStreak == 3 || evenStreak == 3){
                return true;
            }
        }
        return false;

}
