public class bat{
	public int[] middleWay(int[] a, int[] b) {
	  int ans[];
	  ans = new int[2];
	  ans[0] = a[1];
	  ans[1] = b[1];
	  return ans;
	}
	public int[] makeEnds(int[] nums) {
	  int[] ans;
	  ans = new int[2];
	  ans[0] = nums[0];
	  ans[1] = nums[nums.length - 1];
	  return ans;
	}
	public int[] fizzArray(int n) {
	  int i;
	  i=0;
	  int[] ans;
	  ans = new int[n];
	  while (i<n){
	     ans[i]=i;
	     i+=1;
	  }
	  return ans;
	}
	public boolean only14(int[] nums) {
	  int i;
	  i=0;
	  while (i<nums.length){
	     if (nums[i]!=1){
		if (nums[i] != 4){
		   return false;
		}
	     }
	     i+=1;
	  }
	  return true;
	}
}
