public int[] makeEnds(int[] nums) {
  int[] intArray;
  intArray = new int[2];
  intArray[0] = nums[0];
  intArray[1] = nums[nums.length-1];
  return intArray;
}

// Works 100% on codingbat
