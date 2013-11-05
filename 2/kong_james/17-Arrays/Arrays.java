public int[] middleWay(int[] a, int[] b) {

  int[] c;
  c = new int[2];
  c[0] = a[1];
  c[1] = b[1];
  return c;
}

public int[] makeEnds(int[] nums) {

  int[] c;
  c = new int[2];
  c[0] = nums[0];
  int d;
  d = nums.length - 1;
  c[1] = nums[d];
  return c;
}

public int[] fizzArray(int n) {
  int [] c;
  int i;
  c = new int[n];
  for (i = 0; i < n; i++){
  c[i] = i;}
  return c;
  

}

public boolean only14(int[] nums) {
  int i;
  int n;
  n = nums.length;
  for (i = 0; i < n; i++){
  if ((nums[i] != 1)&& (nums[i] != 4))
  return false;}
return true; 
}
