import java.io.*;
import java.util.*;

public class Arrays{
    // int RevFill(int n) which returns an array of size n where a0=n, a1=n-1 etc.
    public int[] RevFill(int n){
	int[] outter = new int[n];
	for (int i = 0; i < n; i++){
	    outter[i] = n;
	    n--;
	}
	return outter;
	}
    
    //int MakeRandom(int size, int min, int max) which will create and return an array of size size where each element is a random value between min and max.
    public int[] MakeRandom(int size, int min, int max){
	int[] outter = new int[size];
	Random r = new Random();
	int range = max - min + 1;
	for (int i = 0; i < size; i++){
	    outter[i] = r.nextInt(range) + min;
	}
	return outter;
    }

  public int sum13(int[] nums) {
  int x = nums.length;
  int outter = 0;
  int unluck = 0;
  for (int i = 0; i < nums.length; i++){
     if ((unluck == 0) && (nums[i] != 13)){
        outter += nums[i];
     }
     else if ((unluck == 0) && (nums[i] == 13)){
        unluck = 1;
     }
     else if ((unluck == 1) && (nums[i] != 13)){
        unluck = 0;
     }
     else {
        unluck = 1;
     }
  }
  return outter;
}

  public boolean modThree(int[] nums) {
  int conodds = 0;
  int conevens = 0;
  for (int i = 0; i < nums.length; i ++){
     if (nums[i]%2 == 0){
        conevens += 1;
        conodds = 0;
     }
     if (nums[i]%2 == 1){
        conevens = 0;
        conodds += 1;
     }
     if ((conevens == 3) || (conodds == 3)){
        return true;
     }
  }
  return false;
}
}
