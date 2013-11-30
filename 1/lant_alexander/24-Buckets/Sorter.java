import java.io.*;
import java.util.*;

public class Sorter{
    // Sorts an array on integers into numerical order.

    /*
     * PLAN:
     * make AL of AL's
     * sort integers of nums by 1st digit (all else is random)
     *    - use (nums[i] % 10 ^ (someting that counts down))
     * ... and so on
     * print out sorted AL using Arrays.toString(buckets)
     */
    
    public Sort(int[] nums){
	@SuppressWarnings(value = "unchecked")
	    
	    ArrayList<Integer>[] buckets = new ArrayList[10]; //Makes main ArrayList, buckets.
	for (int i = 0; i < 10; i++) {buckets[i] = new ArrayList<Integer>();} //Puts an ArrayList at each index of buckets.
	
	

    }
    
}
