
public class arrayStuff {
public int[] middleWay(int[] a, int[] b) {
  int[] ans;
  ans = new int[2];
  ans[0] = a[1];
  ans[1] = b[1];
  return ans;
}

public int[] makeEnds(int[] nums) {
  int[] ans;
  ans = new int[2];
  ans[0] = nums[0];
  ans[1] = nums[nums.length-1];
  return ans;
}

public int[] fizzArray(int n) {
  int[] ans;
  int i;
  ans = new int[n];
  for (i=0;i<n;i++) {
    ans[i] = i;  
  }
  return ans;
}

public boolean only14(int[] nums) {
 for (int i = 0; i < nums.length; ++i) 
if (nums[i] != 1 && nums[i] != 4) return false; 
return true; 
    
}

}