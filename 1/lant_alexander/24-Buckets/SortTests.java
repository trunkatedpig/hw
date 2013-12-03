import java.io.*;
import java.util.*;

public class SortTests{
    public static void main (String[] args){
	
	//Args stuff:
	int length = new Integer(args[0]);
	int range = new Integer(args[1]);

	//Init stuff;
	long lasttime = 0;
        Random R = new Random();
	int[] nums = new int[length];
	
	for(int i = 0; i < length; i++){
 	    nums[i]= R.nextInt(range);
	}
	
	System.out.println("Length: " + length + "\n Range: " + range)
	lasttime = System.currentTimeMillis();
	Sort.sort(nums);
	System.out.println("My radix sort method takes " + (System.currentTimeMillis() - lasttime) + " milliseconds to complete.");
	lasttime = (System.currentTimeMillis());
	Arrays.sort(nums);
        System.out.println("The built-in sort method takes " + (System.currentTimeMillis() - lasttime + " milliseconds to complete."));
	
    }

}
