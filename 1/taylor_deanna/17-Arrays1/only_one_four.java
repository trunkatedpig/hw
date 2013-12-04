public boolean only_one_four(int[] nums) {
  boolean answer = true;
  for (int j = nums.length-1; j>=0; j--){
  if (nums[j] != 1 && nums[j] != 4){
  answer = false;
  } 
 }
 return answer;
}
