public class Arrays1{
    public int[] middleWay(int[] a, int[] b) {
	int[] d = {a[1], b[1]};
	return d;
    }
    public int[] makeEnds(int[] nums) {
	int[] answer = {nums[0], nums[nums.length - 1]};
	return answer;
    }
    public int[] fizzArray(int n) {
	int[] answer = new int[n];
	for (int i = 0; i < answer.length; i++)
	    answer[i] = i;
	return answer;
    }
    public boolean only14(int[] nums) {
	for (int i = 0; i< nums.length; i++){
	    if (nums[i] != 1 && nums[i] != 4)
		return false;
	}
	return true;
    }
}

