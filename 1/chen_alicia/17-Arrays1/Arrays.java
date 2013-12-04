public class Arrays {
    public int[] middleWay(int[] a, int[] b) {
	int[] c;
	c = new int[2];
	c[0] = a[1];
	c[1] = b[1];
	return c;
    }

    public int[] makeEnds(int[] nums) {
	int[] a;
	a = new int[2];
	a[0] = nums[0];
	a[1] = nums[nums.length -1 ];
	return a;
  
    }
    public int[] fizzArray(int n) {
	int[] c;
	c = new int[n];
	for (int i=0;i<n;i = i +1){
	    c[i] = i;
	}
	return c;
  
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
