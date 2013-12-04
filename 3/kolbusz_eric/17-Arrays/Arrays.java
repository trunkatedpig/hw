public int[] middleWay(int[] a, int[] b) {
    int[] retarray = new int[]{a[1],b[1]};
    return retarray;
}

public int[] makeEnds(int[] nums) {
    int[] retarray = new int[]{nums[0],nums[nums.length-1]};
    return retarray;
}

public int[] fizzArray(int n) {
    int[] retarray = new int[n];
    for (int i=0; i<n; i++) {
	retarray[i] = i;}
    return retarray;
}

public boolean only14(int[] nums) {
    for (int i=0; i<nums.length; i++) {
	if (nums[i] != 1 && nums[i] != 4) {
		return false;}}
    return true;
}
