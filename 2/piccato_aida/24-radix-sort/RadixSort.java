import java.io.*;
import java.util.*;

public class RadixSort {
    private int[] nums;
    private ArrayList<Integer>[] buckets;

    public String toString() {
	return "Nums: " +  Arrays.toString(nums);
    }

    public String printBuckets() {
        return "Buckets: " + Arrays.toString(buckets);
    }
    
    public RadixSort(int n) {
	nums = new int[n];
	buckets = new ArrayList[nums.length];
	for (int i = 0; i < nums.length; i++) {
  	    buckets[i] = new ArrayList<Integer>();
	}
	Random r = new Random();
	for (int i = 0; i < nums.length; i++) {
	    nums[i] = r.nextInt(99)+1;
	}
    }

    public void sortIntoBuckets(int n) {
	int value; 
	for (int i = 0;i<nums.length;i++) {
	    value = (int)((nums[i]/(Math.pow(10,n))) % 10);
	    buckets[value].add(nums[i]);
	}	
    }
    
    public void copyIntoArray() {
	int[] temp = new int[nums.length];
	int i=0;
	while (i < temp.length) {
	    for (int j = 0; j < buckets.length; j++) {
		if( buckets[j].size() != 0) {
		    for (int k=0; k < buckets[j].size();k++) {
			temp[i] = buckets[j].get(k);
			i++;
		    }
		}
	    }
	}
	nums = temp;
    }

    public void RadixSort() {
	for (int n = 0; n < 4; n++) {
	    sortIntoBuckets(n);
	    copyIntoArray();
	    ArrayList<Integer>[] temp = new ArrayList[nums.length];
	    for (int i = 0; i < temp.length; i++) {
		temp[i] = new ArrayList<Integer>();
	    }
	    buckets = temp;
		    
	}
    }
    public void bubbleSort() {
	int k = 0;
	int swaps = 0;
	while (k < nums.length) {
	    for (int i = 0; i < nums.length - 1; i++) {
		if (nums[i] > nums[i+1]) {
		    swaps++;
		    int n = nums[i+1];
		    nums[i+1] = nums[i];
		    nums[i] = n;
		}
	    }
	    k++;
	}
	System.out.println(swaps);
    }


	

	
}


	
    

    

