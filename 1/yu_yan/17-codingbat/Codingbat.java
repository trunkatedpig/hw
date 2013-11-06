public class Codingbat{

public int[] middleWay(int[] a, int[] b) {
  int[] array;
  array = new int[2];
  array[0] = a[1];
  array[1] = b[1];
  return array;
}

public int[] makeEnds(int[] nums) {
  int[] array;
  array = new int[2];
  array[0] = nums[0];
  array[1] = nums[nums.length - 1];
  return array;
}

public int[] fizzArray(int n) {
  int[] array;
  array = new int[n];
  for (int x = 0; x < n; x++){
    array[x] = x;
  }
  return array;
}

public boolean only14(int[] nums) {
  boolean f = true;
  for (int x = nums.length; x > 0; x--){
    if (nums[x - 1] != 1 && nums[x - 1] != 4){
      f = false;
    }
  }
  return f;
}

}
