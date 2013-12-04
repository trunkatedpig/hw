public class array1{
    public int[] middleWay(int[] a, int[] b) {
	int[] answer= new int[2];
	answer[0]=a[1];
	answer[1]=b[1];
	return answer;
    }
    
    public int[] makeEnds(int[] nums) {
	int[] answer=new int[2];
	answer[0]=nums[0];
	answer[1]=nums[nums.length-1];
	return answer;
    }
    
    public int[] fizzArray(int n) {
	int[] answer=new int[n];
	for (int i=0;i<n;i++){
	    answer[i]=i;
	}
	return answer;
    }
    
    public boolean only14(int[] nums) {
	for (int i=0;i<nums.length;i++){
	    if (nums[i]!=1 && nums[i]!=4)
		return false;
	}
	return true;
    }
    
}
