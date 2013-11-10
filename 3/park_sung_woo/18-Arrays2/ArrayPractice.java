import java.util.*;
import java.io.*;

public class ArrayPractice{
    
    Random rand = new Random();

    public int[] RevFill(int n){
        int[] ans = new int[n];
        int counter = 0;
        for (int i=n;i>0;i--){
            ans[counter] = i;
            counter ++;
        }
        return ans;
    }

    public int[] MakeRandom(int size, int min, int max){
        int[] ans = new int[size];
        for (int i=0;i<ans.length;i++){
            ans[i] = rand.nextInt(max-min+1)+min;
        }
        return ans;
    }

    public int sum13(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if (nums[i] != 13){
                sum = sum + nums[i];
            }else if(nums[i] == 13 && i != nums.length-1){
                nums[i+1] = 0;
            }   
        }
        return sum;  
    }
    
    public boolean only14(int[] nums) {
        boolean ans = true;
        for (int i=0;i<nums.length;i++){
            if (nums[i] != 1 && nums[i] != 4){
                ans = false;
            }
        }
        return ans;
    }
}
