public int[] middleWay(int[] a, int[] b) {
  int[] answer = new int[2];
  answer[0] = a[1];
  answer[1] = b[1];
  return answer;
}

public int[] makeEnds(int[] nums) {
  int[] answer = new int[2];
  answer[0] = nums[0];
  answer[1] = nums[nums.length-1];
  return answer;
}

public int[] fizzArray(int n) {
  int[] answer = new int[n];
  int i = 0;
  while (i < n) {
  answer[i] = i;
  i = i + 1;
  }
  return answer;
}

public boolean only14(int[] nums) {
  int i = 0;
  boolean answer = true;
  while (i < nums.length) {
  if (nums[i] == 1 || nums[i] == 4) {
  answer = true;
  }
  else {
  answer = false;
  }
  i = i + 1;
  }
  return answer;
}
