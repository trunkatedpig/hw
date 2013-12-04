public int[] middleWay(int[] a, int[] b){
    int[] middleWay = new int[2];
    middleWay[0] = a[1];
    middleWay[1] = b[1];
    return middleWay;
}

public int[] makeEnds(int[] nums){
    if(nums.length==1){
	int[] ans = {nums[0],nums[0]};
	return ans;
    }
    else {
	int[] ans = {nums[0],nums[nums.length-1]};
	return ans;
    }
}

public int[] fizzArray(int n){
    int[] ansArray = new int[n];
    for (int=0; i<n; i++){
	ansArray[i] = i;
    }
    return ansArray;
}

public boolean only14(int[] nums){
    boolean ans = true;
    for (int i=0; i<nums.length; i++){
	if (nums[i] != 1 && nums[i] != 4)
	    ans = false;
    }
    return ans;
}
