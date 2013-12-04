public class Bat {

    public int[] middleWay(int[] a, int[] b) {
        int[] middleArray = {a[a.length / 2] , b[b.length / 2]};
        return middleArray;
    }

    public int[] makeEnds(int[] nums) {
        int[] endsArray = new int[2];
        endsArray[0] = nums[0];
        endsArray[1] = nums[nums.length-1];
        return endsArray;
    }

    public int[] fizzArray(int n) {
        int[] numsArray = new int[n];
        for (int i=0; i<n; i++) {
            numsArray[i]=i;
        }
        return numsArray;
    }

    public boolean only14(int[] nums) {
        for (int i=0; i<nums.length; i++) {
            int n = nums[i];
            if (!(n == 1 || n == 4)) {
                return false;
            }
        }
        return true;
    }
}
