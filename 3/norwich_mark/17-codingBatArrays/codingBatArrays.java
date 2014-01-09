
public class codingBatArrays{
public int[] makeEnds(int[] nums) {
  int[] ends = new int[2]; 
  ends[0] = nums[0]; 
  ends[1] = nums[nums.length - 1]; 
  return ends;
}

public int[] middleWay(int[] a, int[] b) {
  int[] middle = new int[2]; 
  middle[0] = a[a.length - 2]; 
  middle[1] = b[b.length - 2];
  return middle;
}

public int[] fizzArray(int n) {
  int[] fizz = new int[n]; 
  for (int a = 0; a < n; a++)
       fizz[a] = a; 
  return fizz; 
}

public boolean only14(int[] nums) {
     int n = 0;
     while (n < nums.length){
          if (nums[n] == 1 || nums[n] == 4)
               n = n + 1; 
          else 
               return false; 
         }
       return true;
  
}

}
