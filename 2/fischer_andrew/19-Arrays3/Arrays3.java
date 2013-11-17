public class Arrays3{

    // Write a routine double mean() which will return the arithmetic mean (average) of the array.
    public double mean(int[] nums){
	int sum = 0;
	double ans = 0;
	int i;
	for(i=0;i<nums.length;i++) {
	    sum += nums[i];
	}
	ans = sum / (nums.length+1);
	return ans;	
    }

// Write a routine double stddev() which will calculate the standard deviation of the array.
    public double stddev(int[] nums) {
	  double mean = mean(nums);
	  double diff = 0;
	  for (int i = 0; i < nums.length; i++) {
	      diff = diff + nums[i] - mean;
	  }
	  return Math.sqrt(diff/nums.length);
	    }

}
