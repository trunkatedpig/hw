import java.util.*;

public class practice{
    public int[] RevFill(int n) {
	int[] result = new int[n];
	for (int i = 0; i < n; i++) {
	    result[i] = n -1 - i;
	}
	for (int i=0; i<result.length;i++)
	    System.out.println(result[i]);
	return result;
    }

    public int[] MakeRandom(int n, int min, int max){
	Random r = new Random();
	int[] answer = new int[n];
	for (int i=0;i<n;i++){
	    int num=r.nextInt(max-min)+3;
	    answer[i]=num;}
	for (int i=0; i<answer.length;i++)
	    System.out.println(answer[i]);
	return answer;
    }
    
    public int sum13(int[] nums) {
	int answer=0;
	int i=0;
	while (i<nums.length){
	    if (nums[i]!=13){
		answer=answer+nums[i];
		i=i+1;}
	    else{
		i=i+2;}
	}
	return answer;
    }

    public boolean modThree(int[] nums) {
	int e=0;
	int o=0;
	for (int i=0;i<nums.length;i++){
	    if (nums[i]%2==0){
		e=e+1;
		o=0;}
	    else {
		o=o+1;
		e=0;}
	    if (e==3 || o==3)
		return true;}
	return false;
    }

}
