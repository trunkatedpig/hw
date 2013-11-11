public class Array {
    public int[] middleWay (int[] a, int[] b) {
	int[] x = new int[2];
	x[0] = a[1];
	x[1] = b[1];
	return x;
    }

    public int makeEnds (int[] nums) {
	int index = nums.length;
	int[] ar = new int[2];
	ar[0] = nums[0];
	ar[1] = nums[index - 1];
	return ar;
    }

    public int[] fizzArray (int n) {
	int[] ar = new int[n];
	int i = 0;
	while (i < n) {
	    ar[i] = i;
	    i ++;
	}
	
	return ar;
    }

    public boolean only14 (int[] nums) {
	int i = 0;
	while (i < nums.length) {
	    if (nums[i] != 1 && nums[i] != 4)
		return false;
	    i ++;
	}
	return true;
    }
}
