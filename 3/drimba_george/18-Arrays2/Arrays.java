import java.io.*;
import java.util.*;

public class Arrays {
    Random r = new Random();

    public int[] Revfill(int n) {
        int[] ans = new int[n];
        for (int i=n;i>0;i--) {
            ans[i] = i;
        }
        return ans;
    }

    public int[] makeRandom(int n, int min, int max) {
        int[] ans = new int[n];
        for (int i=0;i<n;i++) {
            ans[i] = min + r.nextInt(max-min);
        }
        return ans;
    }

    public int sum13(int[] a) {
        int ans = 0;
        for (int i=0;i<a.length;i++) {
            if (a[i] == 13) 
                ans = ans;
            else
                ans = a[i] + ans;
        }
        return ans;
    }

    public boolean modThree(int[] nums) {
        int ans = 0; 
        for (int i=0;i<nums.length;i++) {
            if (nums[i]%2 == 0) {
                if (ans < 0) {
                    ans = ans-1;
                    if (ans == -3)
                        return true;
                }
                else
                    ans = -1;
            } else {
                if (ans > 0) {
                    ans = ans+1;
                    if (ans == 3)
                        return true;
                }
                else
                    ans = 1; 
            }
        }
        return false;     
    }
}
