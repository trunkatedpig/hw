public class Arrays2{

    public int[] Revfill(int n){
	int[] ans = new int[n];
	for (int i=0; i<n; i++){
	    ans[i]=(n-i);
	}
	return ans;
        
    }
    public int[] MakeRandom(int size, int min, int max){
	int[] ans = new int[size];
	for (int i=0; i<size; i++){
	    ans[i]= ((int)Math.round(Math.random()*(max-min-2)))+min+1;
	}
	return ans;
    }
    public int sum13(int[] nums){
	int ans = 0;
	int x= 0;
	while (x< nums.length){
	    if (nums[x] != 13){
		ans = ans + nums[x];
		x = x+1;
	    }
	    else{
		x= x+2;
	    }
	}
	return ans;
    }
    public boolean modThree(int[] nums){
	for (int i=0; i+2<nums.length; i++){
	    if(nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0){
		return true;
	    }
	    else if(nums[i]%2 !=0 && nums[i+1]%2 !=0 && nums[i+2]%2 !=0){
		return true;
	    }
	}
	return false;
    }
	     
}
