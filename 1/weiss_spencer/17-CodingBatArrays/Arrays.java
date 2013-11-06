public class Arrays {

    public boolean only14(int[] nums) {
	boolean ans = true;
	for (int i=0; i<nums.length; i++) {
		if (nums[i] != 1 && nums[i] != 4)
			ans = false;
        }
        return ans;
    }

    public int[] fizzArray(int n) {
        int[] fizz = new int[n];
        for (int i=0; i<fizz.length; i++)
            fizz[i] = i;
        return fizz;
    }

    public int[] makeEnds(int[] nums) {
        int[] ans = new int[2];
        ans[0] = nums[0];
        ans[1] = nums[nums.length-1];
        return ans;
    }

    public int[] middleWay(int[] a, int[] b) {
        int[] ans = new int[2]
        c[0] = a[1];
        c[1] = b[1];
        return c;
    }

}
