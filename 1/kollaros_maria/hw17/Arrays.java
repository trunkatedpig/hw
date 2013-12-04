public class Arrays{
   
    public int[] middleWay(int[] a, int[] b) {
	int[] intArray = new int[2];
	intArray[0] = a[1];
	intArray[1] = b[1];
	return intArray;
    }

    public int[] makeEnds(int[] nums) {
	int[] intArray = new int[2];
	intArray[0] = nums[0];
	intArray[1] = nums[nums.length - 1];
	return intArray;
    }

    public int[] fizzArray(int n) {
	int[] intArray = new int[n];
	for(int i = 0; i < intArray.length; i = i + 1){
	    intArray[i] = i;
	}
	return intArray;
    }

    public boolean only14(int[] nums) {
	boolean yoda = true;
	for(int i = 0; i < nums.length; i = i + 1){
	    if(nums[i] != 1 && nums[i] != 4){
		yoda = false;
	    }
	}
	return yoda;
    }


}
