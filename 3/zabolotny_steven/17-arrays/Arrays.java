public class Arrays {
    public int[] middleWay(int[] a, int[] b) {
        int[] retInt = {a[1],b[1]};
        return retInt;
    }
    public int[] makeEnds(int[] nums) {
        int[] retInt = {nums[0],nums[nums.length - 1]};
        return retInt;
    }
    public int[] fizzArray(int n) {
        int[] retInt = new int[n];
        for(int i = 0;i < n;i++) {
            retInt[i] = i;
        }
        return retInt;
    }
    public boolean only14(int[] nums) {
        for (int i = 0;i < nums.length;i++) {
            if ((nums[i] != 1) && (nums[i] != 4))
            return false;
        }
        return true;
    }
}
