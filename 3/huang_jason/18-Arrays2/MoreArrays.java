public class MoreArrays{
    
    public static int[] revFill(int n){
	int[] ans = new int[n];
	for(int i = n; i>0; i--){
	    ans[n-i] = i;
	}
	return ans;
    }

    public static int[] makeRandom(int size, int min, int max){
	int[] ans = new int[size];
	for(int i = 0; i<size; i++){
	    ans[i] = (int) (Math.random() * (max-min) + min);
	}
	return ans;
    }

   public int sum13(int[] nums) {
	int ans = 0;
	for(int i=0; i<nums.length; i++){
	    if(nums[i]!=13){
		ans += nums[i];
	    }
	    else{
		i++;
	    }
	}
	return ans;
    }
    
    public boolean modThree(int[] nums) {
	for(int i=0; i<nums.length-2; i++){
	    if(nums[i]%2 == nums[i+1]%2 && nums[i+1]%2 == nums[i+2]%2)
		return true;
	}
	return false;
    }

    public static String stringArrays(int[] arr){
	String ans = "";
	for(int i=0; i<arr.length; i++){
	    ans = ans + arr[i] + ", ";
	}
	return ans;
    }
}