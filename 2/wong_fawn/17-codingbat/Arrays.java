public int[] middleWay(int[] a, int[] b) {
	int[] retArr = new int[2];
	retArr[0] = a[1];
	retArr[1] = a[2];
	return retArr;
}

public int[] makeEnds(int[] nums) {
  	int[] retArr = new int[2];
  	retArr[0] = nums[0];
  	retArr[1] = nums[nums.length - 1];
  	return retArr;
}

public int[] fizzArray(int n) {
  	int[] retArr = new int[n];
  	for (int i = 0; i < n; i++) {
  		retArr[i] = i;
  	}
  	return retArr;
}

public boolean only14(int[] nums) {
  	boolean fourteen = true;
  	int i = 0;
  	while (fourteen && i < nums.length) {
  		if (!(nums[i] == 1 || nums[i] == 4)) {
  			fourteen = false;
  		}
  		i = i + 1;
  	}
  	return fourteen;
}
