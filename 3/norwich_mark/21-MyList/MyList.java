import java.util.*; 
import java.io.*;


public class MyList{
    private int[] nums; 
    private Random r; 

    public MyList(){
	r = new Random(); 
	nums = new int[30]; 
	for (int i = 0; i < nums.length; i++)
	    nums[i] = r.nextInt(100);
    } 

    public int getNum(int n){
	return nums[n]; 
    } 
    
    public String toString() {
        return Arrays.toString(nums);
    }
    
    public int remove(int pos){
	int[] temp = new int[nums.length - 1]; 
	int i = 0; 
	while (i < nums.length){ 
	    if (i != pos){
		temp[i] = nums[i];
		i = i + 1; 
	    } 
	    else 
		i = i + 1; 
	}
	nums = temp; 
	return i;
    }
}
