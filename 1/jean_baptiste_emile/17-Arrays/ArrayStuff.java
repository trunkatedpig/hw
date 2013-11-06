public class ArrayStuff {

public boolean only14(int[] nums) {
for (int i = 0; i < nums.length; i++) {
if (nums[i] != 4 && nums[i] != 1)
return false; }
return true;  
}

public int[] fizzArray(int n) {
int[] a = new int[n];
for (int i = 0; i < n; i++) {
a[i] = i; }
return a; 
}

public int[] makeEnds(int[] nums) {
int[] ends = {nums[0],nums[nums.length - 1]};
return ends;
}

public int[] middleWay(int[] a, int[] b) {
int[] c = {a[1],b[1]};
return c;
}
}

