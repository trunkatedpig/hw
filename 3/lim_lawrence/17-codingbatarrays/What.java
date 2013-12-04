public int[] middleWay(int[] a, int[] b) {
  return new int[] {a[1],b[1]};
}

public int[] makeEnds(int[] nums) {
  return new int[] {nums[0], nums[nums.length-1]};
}

public int[] fizzArray(int n) {
  int[] r = new int[n];
  for (int i=0;i<n;i++) {r[i]=i;}
  return r;
}

public boolean only14(int[] nums) {
  for (int i=0;i<nums.length;i++)
    if (nums[i]!=1 && nums[i]!=4) {return false;}
  return true;
}