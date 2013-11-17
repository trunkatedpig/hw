import java.io.*;
import java.util.*;

public class Arrays{

    //Array-1>middleWay   
    public int[] middleWay(int[] a, int[] b) {
        int[] ans = new int[2];
        ans[0] = a[1];
        ans[1] = b[1]; 
        return ans;
    }

    //Array-1>makeEnds
    public int[] makeEnds(int[] nums) {
        int[] ans = new int[2];
        ans[0] = nums[0];
        ans[1] = nums[nums.length - 1];
        return ans;
    }

    //Array-2>fizzArray
    public int[] fizzArray(int n) {
        int i;
        int[] ans = new int[n];
        for (i = n; i>0 ; i--){
            ans[i-1] = i-1;
        } 
        return ans;
    }

    //Array-2>only14
    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 1 && nums[i] != 4){
                return false;
            }
        }
        return true;
    }

}
