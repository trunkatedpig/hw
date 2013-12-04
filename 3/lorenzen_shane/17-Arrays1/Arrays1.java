public boolean only14(int[] nums) {
    int i, ans;
    ans = 0;
    for (i=0;i<nums.length;i++){
	if (nums[i] == 1 || nums[i] == 4){
	    ans = ans + 1;
	}
    }
    if (ans == nums.length){
	return true;
    }
    else{
	return false;
    } 
}
public int[] fizzArray(int n) {
    int i;
    int[] ans = new int[n];
    for (i = 0; i < n; i++){
	ans[i] = i;
    }
    return ans;
}
public int[] makeEnds(int[] nums) {
    int[] ans = new int[2];
    ans[0] = nums[0];
    ans[1] = nums[nums.length -1];
    return ans;
}
public int[] middleWay(int[] a, int[] b) {
    int[] ans = new int[2];
    ans[0] = a[1];
    ans[1] = b[1];
    return ans;
}
