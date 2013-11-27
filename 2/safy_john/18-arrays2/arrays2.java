public class arrays2 {

    public int[] revfill(int n) {
	int[] intArray;
	intArray = new int[n];
	for (int i = 0;i < n;i ++) {
	    intArray[i] = n - i;
	}
	return intArray;
    }
   
    public int[] MakeRandom (int n,int min,int max) {
        int[] ans = new int[n];
        for (int i = 0;i < n;i ++) {
	    Random r = new Random();
	    intArray[n ] = r.nextInt(max) + min;
	}
        return ans;
    }

    public int sum13(int[] nums) {
	int result = 0;
	for (int i = 0;i < nums.length;i ++) {
	    if (nums [i] == 13)
                i = i + 1;
	    else {
                result = result + nums [i];
	    }
	}             
	return result;
    }

    public boolean modThree(int[] nums) {
        for (int i = 0;i < nums.length - 2;i ++) {
	    if (nums [i] % 2 == 0 && nums [i + 1] % 2 == 0 && nums [i + 2] % 2 == 0)
                return true;
	    if (nums [i] % 2 == 1 && nums [i + 1] % 2 == 1 && nums [i + 2] % 2 == 1)
                return true;
        }
        return false;
    }
}
