// Problem 1

public int[] middleWay(int[] a, int[] b) {
  	int[] answer = new int[2]; 
  	answer[0] = a[1];
  	answer[1] = b[1];
  	return answer;
}

// Problem 2

public int[] makeEnds(int[] nums) {
	int[] answer = new int[2];
	int numsMaxIndex = nums.length - 1;
	answer[0] = nums[0];
	answer[1] = nums[numsMaxIndex];
	return answer;
}

// Problem 3

public int[] fizzArray(int n) {
	int[] answer = new int[n];
	for(int i = 0; i < n; i++) {
		answer[i] = i;
	}
	return answer;
}

// Problem 4

public boolean only14(int[] nums) {
	int numsLength = nums.length;
	boolean answer = true;
	for(int i = 0; i < numsLength; i++) {
		int thisIndex = nums[i];
		if ((thisIndex != 1) && (thisIndex != 4)) {
			answer = false;
		}
	}
	return answer;
}
