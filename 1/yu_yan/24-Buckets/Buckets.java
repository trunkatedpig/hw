import java.io.*;
import java.util.*;

public class Buckets {
    ArrayList[] buckets = new ArrayList[10];
    int[] nums = new int[10];
    
    
    public Buckets(){
	Random r = new Random();
	for (int i=0; i<10; i++) { 
	    nums[i] = 1000 + r.nextInt(9000);
	}
	System.out.println(Arrays.toString(nums));
    }
    
    //////////////////////
    
    public int[] radixSort(){
	for(int i = 0; i<10; i++) { 
	    buckets[i] = new ArrayList();
	}
	
	for(int n=0; n<4; n++){
	    for (int i=0; i<nums.length; i++){
		int digit = (nums[i]/(int)Math.pow(10,n)%10);
		buckets[digit].add(nums[i]);
	    }
	    //puts nums in buckets
	    
	    int z=0;
	    while (z<nums.length) {
		for (int i=0; i<buckets.length; i++) {
		    for(int j=0; j<buckets[i].size(); j++){
			nums[z] = (Integer)(buckets[i].get(j));
			z = z+1;
		    }
		}
	    }
	//places bucket in order inside nums
	    
	    for(int i = 0; i<10; i++) { 
		buckets[i] = new ArrayList();
	    }
	    //resets bucket
	}
	////////////////////
	
	System.out.println(Arrays.toString(nums));
	return nums;
    }

    public int[] bubbleSort(){
	int comparisons = 0;
	int swaps = 0;
	int temp;

	for (int i=0; i<nums.length-1; i++){
	    for (int j=0; j<nums.length-1; j++){
		comparisons = comparisons + 1;
		if (nums[j] > nums[j+1]){
		    swaps = swaps + 1;
		    temp = nums[j];
		    nums[j] = nums[j+1];
		    nums[j+1] = temp;
		}
	    }
	}
	
	System.out.println(Arrays.toString(nums));
	System.out.println("Comparisons: " + comparisons);
	System.out.println("Swaps: " + swaps);
	return nums;
    }
}
