public class arrayPractice{
	//MiddleWay  http://codingbat.com/prob/p146449
	
	public int[] middleWay(int[] a, int[] b) {
		int[]c = {a[1], b[1]};
		return c;
	}

	//MakeEnds  http://codingbat.com/prob/p101230
	public int[] makeEnds(int[] nums) {
  		int len=nums.length;
  		int[]c={nums[0], nums[len-1]};
  		return c;
	}
	
	//FizzArray  http://codingbat.com/prob/p180920
	public int[] fizzArray(int n) {
 		int[]c=new int[n];
  		for (int i=0; i<n; i++){
  			c[i]=i;
  		}
 		return c;
	}

	//Only14  http://codingbat.com/prob/p186672
	public boolean only14(int[] nums) {
		for (int i=0; i<nums.length; i++){
			if (nums[i]!=1 && nums[i]!=4)
				return false;
			}
		return true;
	}


}