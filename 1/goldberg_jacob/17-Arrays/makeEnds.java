public int[] makeEnds(int[] nums) {
  int [] ender = new int [2];
  ends [0] = nums[0];
  int x = nums.length;
  ender [1] = nums[x-1];
  return ender; 
}
