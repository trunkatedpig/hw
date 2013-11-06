public int[] middleWay(int[] a, int[] b){
	int[] c = {a[1], b[1]};
	return c;
}

public int[] makeEnds(int[] nums) {
  int[] c = {nums[0], nums[nums.length-1]};
  return c;
}

public int[] fizzArray(int n) {
  int[] x = new int[n];
  for (int i = 0; i < n; i = i + 1){
  x[i] = i;
 }
 return x;
}

public boolean only14(int[] nums) {
boolean c = true;
  for (int i = 0; i < nums.length; i = i + 1){
  if (nums[i] != 1 && nums[i] != 4){
  c = false;
  return c;
  }
  }
  return c;
}
