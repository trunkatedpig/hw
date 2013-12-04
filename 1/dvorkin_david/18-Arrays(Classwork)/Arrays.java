import java.io.*;
import java.util.*;

public class Arrays{
    public int[] Revfill(int n) {
	int[] q = new int[n];
        int x = 0;
	for (int i = n; i > 0; i = i - 1){
	    q[x] = i;
        x = x + 1;
	}
	return q;
    }
    public int[] MakeRandom(int size, int min, int max){
        Random random=new Random();
	int[] q = new int[size];
	for (int i = 0; i < size; i++){
	    q[i] = min + random.nextInt(max-min) ;//* (max - min)+ 1);
	}
	return q;
    }
}

public int sum13(int[] nums) {
   int q = 0;
   for (int i = 0; i < nums.length; i = i + 1){
   if (nums[i] == 13){
   i = i + 1;
   }
   else{
   q = q + nums[i];
   }
   }
   return q;
}
}

public boolean modThree(int[] nums) {
  boolean q = false;
  for (int i = 0; i < nums.length - 2; i = i + 1){
  double a = nums[i]%2;
  double b = nums[i+1]%2;
  double c = nums[i+2]%2;
  if (a==b && a==c){
  q = true;
  }
  }
  return q;
}
}
