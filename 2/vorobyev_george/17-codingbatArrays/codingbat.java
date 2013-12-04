public int[] makeEnds(int[] nums) {
  return new int[]{nums[0], nums[nums.length - 1]};
}

public int[] middleWay(int[] a, int[] b) {
  return new int[]{a[1],b[1]};
}

public boolean only14(int[] nums) {
  for(int i : nums)
  {
     if(!(i == 1 || i == 4))
        return false;
  }
  return true;
}

public int[] fizzArray(int n) {
  int[] temp = new int[n];
  for(int i = 0; i < n; i++)
  {
     temp[i] = i;
  }
  return temp;
}

