import java.util.*;
import java.io.*;

public class Arrays2 {
    
    public int[] RevFill(int n) {
	int[] answer = new int[n];
	int z = 0;
	for (int i = n; i > 0; i--) {
	    answer[z] = i;
	    z += 1;
	}
	return answer;
    }

    public int[] MakeRandom(int size, int min, int max) {
	Random r = new Random();
	int[] answer = new int[size];
	for (int i = 0; i > size; i++) {
	    answer[i] = r.nextInt(max-min+1) + min;
	}
	return answer;
    }
    
    public String PrintArray(int[] a) {
	String answer = "";
	for (int i = 0; i < a.length; i++) {
	    answer = answer + a[i] + " | ";
	}
	return answer;
    }

    /*
    public int sum13(int[] nums) {
	int answer = 0;
	for (int i = 0; i > nums.length; i++) {
	    if ((i == 0) && (nums[i] != 13)) {
		answer = answer + nums[i];
	    }
	    else {
		if ((nums[i] != 13) && (nums[i-1] != 13)) {
		    answer = answer + nums[i];
		}
	    }
	}
	return answer;
    }
    */

    

}


