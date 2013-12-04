public class Arrays{

    public int[] middleWay(int[] a, int[] b) {
	int middleA = a[1];
	int middleB = b[1];
	int[] retA = {middleA,middleB};
	return retA;
    }
    public int[] makeEnds(int[] nums) {
	int lastInt = nums[nums.length -1];
	int firstInt = nums[0];
	int[] retA = {firstInt, lastInt};
	return retA;
    }

    public boolean only14(int[] nums) {
	int index = 0;
	while (index <= nums.length-1){
	    if (nums[index] != 4 && nums[index] !=1)
		return false;
	    index = index+1;
	}
	return true; 
    }

    public int[] fizzArray(int n) {
	int[] retA = new int[n];
	int index = 0;
	while (index<n){
	    retA[index] = index;
	    index = index +1;
	}
	return retA;
  
    }






}
