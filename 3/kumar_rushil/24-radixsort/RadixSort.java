import java.io.*;
import java.util.*;
public class RadixSort{

    ArrayList[] buckets = new ArrayList[10];
    int placevalue = 0;
    int k = 1;
    public void Sort(int[] nums, int digits){
	int[] temp=nums;
	for (int i = 0; i < nums.length; i ++){
	    placevalue = (temp[i]/k) % 10;       //finds the digit at the ones/tens/hundreds/etc. place
	    for (int x = 0; x < buckets.length; x ++){
		if (placevalue == x)            //adds the number to the buckets based on placevalue
		    buckets[x].add(nums[i]);
	    }
	}
	for (int i = 0; i < nums.length; i ++){
	    int bucketspos = 0;
	    temp[i]=buckets[0]
    }
}


