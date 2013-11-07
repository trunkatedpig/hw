import java.io.*;
import java.util.*;

public class Arrays {

    public int[] RevFill(int n) {
        int[] rev = new int[n];
        for(int i = 0; i < n; i++) {
            rev[i] = n - i;
        }
        return rev;
    }

    public int[] MakeRandom(int size, int min, int max) {
        int diff = max - min;
        int[] a = new int[size];
        Random r = new Random();
        for(int i = 0; i < size; i++) {
            a[i] = min + r.nextInt(diff+1);
        }
        return a;
    }

    public int sum13(int[] numss) {
        int sum = 0;
        for(int i = 0; i < nums.length ; i++) {
            if(nums[i] != 13)
                sum = sum + nums[i];
            if(nums[i] == 13)
                i = i+1;
        }
        return sum;
    }

    public boolean modThree(int[] nums) {
        for(int i = 0; i <nums.length -2 ; i++) {
            if (nums[i] %2 == nums[i+1] %2 && nums[i+1] %2 == nums[i+2] %2)
                return true; 
        }
        return false;
    }
}
