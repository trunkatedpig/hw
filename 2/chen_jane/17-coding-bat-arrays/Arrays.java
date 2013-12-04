public class Arrays {

    public int[] middleWay(int[] a, int[] b) {
	int[] intArray;
	intArray = new int[2];
	intArray[0] = a[1];
	intArray[1] = b[1];
	return intArray;
    }

    public int[] makeEnds(int[] nums) {
	int[] intArray;
	intArray = new int[2];
	intArray[0] = nums[0];
	intArray[1] = nums[nums.length-1];
	return intArray;
    }

    public int[] fizzArray(int n) {
	int[] intArray;
	intArray = new int[n];
	for (int i=0;i<n;i++) {
	    intArray[i] = i;
	}
	return intArray;
    }

    public boolean only14(int[] nums) {
	for (int i=0; i < nums.length; i++) {
	    if (nums[i] != 1 && nums[i] != 4) {
		return false;
	    }
	}
	return true;
    }

}
