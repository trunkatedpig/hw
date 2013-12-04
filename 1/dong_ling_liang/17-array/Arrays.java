//problem 1

public int[] middleWay(int[] a, int[] b) {
  int[] newA = new int[2];
  newA[0]=a[1];
  newA[1]=b[1];
  return newA;
}

//problem 2

public int[] makeEnds(int[] nums) {
  int[] newArray = new int[2];
  newArray[0] = nums[0];
  newArray[1] = nums[nums.length-1];
  return newArray;
}

//problem 3

public int[] fizzArray(int n) {
  int[] array = new int[n];
  for (int i = 0; i < n; i++){
     array[i] = i;
     }
  return array;
}

//problem 4

public boolean only14(int[] nums) {
  for (int i = 0 ; i < nums.length ; i++){
  if (nums[i]!=4 && nums[i]!=1){
     return false;}
  }
  return true;
}
