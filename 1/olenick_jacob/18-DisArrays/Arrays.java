import java.io.*;
import java.util.*;

public class Arrays{
    public int[] revFill(int n){
        int [] result = new int[n];
        for (int x = 0;x < n; x++){
            result[x] = n - x;
        }
        return result;
    }

    public int[] makeRandom(int n, int min, int max){
        Random r = new Random();
        int x = (max - min) + 1;
        int [] result = new int[n];
        for (int y = 0; y > 0; y ++){
            int z = r.nextInt(x);
            result[y] = min + z;
        }
    }

    public int sum13(int[] nums) {
	int sum = 0;
	if (nums.length == 0){
	    return 0;
	}
	else if (nums[0] != 13) {
	    sum += nums[0];
	}
	for (int a = 1; a < nums.length; a++){
	    if (nums[a] != 13 && nums[a-1] != 13){
		sum += nums[a];
	    }
	}
	return sum;
    }

    public boolean modThree(int[] nums) {
	Boolean result = false;
	Boolean e = false;
	Boolean o = false;
	int even = 0;
	int odd = 0;
	for (int i = 0; i < nums.length; i++){
	    if (nums[i] % 2 == 0){
		even += 1;
		odd = 0;
	    }
	    else {
		odd += 1;
		even = 0;
	    }
	    if (even == 3){
		e = true;
	    }
	    else if (odd == 3){
		o = true;
	    }
	}
	result = (o && !e) || (e && !o);
	return result;    
    }

            
}
