public int[] middleWay(int[] a, int[] b) {
    int[] n;
    n = new int [2];
    n[0] = a[1];
    n[1] = b[1];
    return n;
}

public int[] makeEnds(int[] nums) {
    int[] n;
    n = new int[2];
    n[0] = nums [0];
    int i;
    i = nums.length - 1;
    n[1]= nums[i];
    return n;
}

public int[] fizzArray(int n) {
    int[] a;
    int i;
    a = new int [n];
    for (i = 0; i < n; i++){
	a[i] = i;}
    return a;
}

public boolean only14(int[] nums) {
    int i;
    int j;
    j = nums.length;
    for (i = 0; i < j; i ++){
	if ((nums[i] != 1) && (nums[i] != 4)){
	    return false;
	}
    }
    return true;
}
