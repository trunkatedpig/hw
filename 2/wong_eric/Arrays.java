//Question 1 - middleWay

public int[] middleWay(int[] a, int[] b) {
  int[] intArray = new int[2];
  intArray[0] = a[1];
  intArray[1] = b[1];
  return intArray;
}

//Question 2 - makeEnds

public int[] makeEnds(int[] nums) {
  int[] intArray = new int[2];
  intArray[0] = nums[0];
  intArray[1] = nums[nums.length-1];
  return intArray;
}

//Question 3 - fizzyArray

public int[] fizzArray(int n) {
  int[] intArray = new int[n];
  
  for (int i=0; i < n; i ++) {
    intArray[i] = i;
  }
  
  return intArray;
}

//Question 4 - only14

public boolean only14(int[] nums) {
  for (int i=0; i < nums.length; i++) {
    if ((!(nums[i] == 1)) && (!(nums[i] == 4)))
      return false;
  }
  return true;
}