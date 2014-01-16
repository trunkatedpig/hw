import java.io.*;
import java.util.*;

public class Buckets { 
    int g = 100000;
    ArrayList[] buckets = new ArrayList[g];
    int[] nums = new int[g];
    public int swaps,comparisons,assignments;

    public Buckets() { 
	for(int i = 0; i<g; i++) { 
	    buckets[i] = new ArrayList();
	}
	Random r = new Random();
	for (int i=0; i<g; i++) { 
	    nums[i] = r.nextInt(100);
	}
    }
    public void sort() { 
	for (int n=0; n<4; n++){
	    for (int i=0; i<nums.length; i++){
		int digit = (nums[i]/(int)Math.pow(10,n)%10);
		buckets[digit].add(nums[i]);
	    }
	    int z=0;
	    while (z<nums.length) { 
		for (int i=0; i<buckets.length; i++) {
		    for (int j=0; j<buckets[i].size(); j++){
			nums[z] = (Integer)buckets[i].get(j);
			z=z+1;
		    }
		}
	    }
	    for (int i=0; i<nums.length; i++) { 
		buckets[i] = new ArrayList();
	    }
	}
    }

    public void bsort() { 
	int comparisons = 0;
	int swaps = 0;
	boolean b = true;
	while (b) { 
	    b = false;
	    for (int i = 0; i<nums.length-1; i++) { 
	  	comparisons++;
		if (nums[i] > nums[i+1]) { 
		    int temp = nums[i];
		    nums[i] = nums[i+1];
		    nums[i+1] = temp;
		    b = true;
		    swaps++;
		}
	    }
	}
    }

    public void insertSort() {
	int comparisons = 0;
	int assignments = 0;
	for (int i=1;i<nums.length;i++) { 
	    int temp = nums[i];
	    int shifts = 0;
	    int j;
	    for (j=i-1; j>=0&&temp<nums[j];j--) { 
		nums[j+1] = nums[j];
		comparisons++;
		shifts++;
	    }
	    nums[j+1] = temp;
	    assignments = 2 + shifts;
	}
    }
	
    public void selectSort() { 
	int comparisons = 0;
	for (int i=0;i<nums.length;i++) {
	    int index = i;
	    for (int j=i+1;j<nums.length;j++) { 
		if (nums[index] > nums[j]) {
		    comparisons++;
		    index = j;
		}
	    }
	    if (index != i) { 
		int temp = nums[index];
		nums[index] = nums[i];
		nums[i] = temp;
	    }
	}
    }

    public String toString() { 
	return Arrays.toString(nums);
    }

    public int numSwaps() {
	return swaps;
    }
    
    public int numComparisons() { 
	return comparisons;
    }

    public int numAssignments() { 
	return assignments;
    }
}

    
