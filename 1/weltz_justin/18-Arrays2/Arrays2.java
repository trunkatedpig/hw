import java.util.*;
import java.io.*;
public class Arrays2 {
    public int[] RevFill(int n){
	int[] answer = new int[n];
	for (int i = 0; i < answer.length; i++){
	    answer[i] = n;
	    n = n - 1;
	}
	return answer;
    }
    public int[] MakeRandom(int size, int min, int max){
	int[] answer = new int[size];
	Random r = new Random();
	for (int i = 0; i < size; i++)
	    answer[i] = r.nextInt(max - min - 1 ) + min + 1;
	return answer;
    }
      public int sum13(int[] nums) {
	if (nums.length == 0) return 0;
	boolean b = false;
	int answer = 0;
	for (int i = 0; i < nums.length; i++){
	    if (nums[i] == 13) b = true;
	    else if (!b) answer = answer + nums[i];
	    else b = false;
	}
	return answer;
		
      }
    public boolean modThree (int[] nums){
	int runeven  = 0;
	int runodd = 0;
	for ( int i = 0; i <  nums.length; i++){
	    if (nums[i] % 2 == 0) {
		runeven = runeven + 1;
		runodd = 0;
	    }
	    else {
		runeven = 0;
		runodd = runodd + 1;
	    }
	    if (runodd == 3 || runeven == 3) return true;
	}
	return false;
    }
}

    
