public int[] makeEnds(int[] nums) {
  int [] ends = new int [2];
  ends [0] = nums[0];
  int x = nums.length;
  ends [1] = nums[x-1];
  return ends; 
}
