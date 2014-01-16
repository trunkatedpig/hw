import java.io.*;
import java.util.*;

public class Sorts {
    private int[] nums;
    private ArrayList<Integer>[] buckets;

    public int[] getNums() {
	return nums;
    }
    public String toString() {
	return "Nums: " +  Arrays.toString(nums);
    }
    
    public Sorts(int n) {
	nums = new int[n];
	buckets = new ArrayList[nums.length];
	for (int i = 0; i < nums.length; i++) {
  	    buckets[i] = new ArrayList<Integer>();
	}
	Random r = new Random();
	for (int i = 0; i < nums.length; i++) {
	    nums[i] = r.nextInt(999999)+1;
	}
    }

    public String printBuckets() {
        return "Buckets: " + Arrays.toString(buckets);
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

    public void rSort(int[] nums) {
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

    public void bSort(int[] a) {
	int k = 1;
	int swaps = 0;
        boolean swapped = false;
	int comparisons = 0;
	while (k <= a.length) {
	    swapped = false;
	    for (int i = 0; i < a.length - k; i++) {
		comparisons++;
		if (a[i] > a[i+1]) {
		    swaps++;
		    swapped = true;
		    int n = a[i+1];
		    a[i+1] = a[i];
		    a[i] = n;
		}
	    }
	    if (!swapped) {
		break;
	    }
	    k++;
	}
	System.out.println("Swaps: " + swaps);
	System.out.println("Comparisons: " + comparisons);
    }
    /*
    public void iSort() {
	int num;
	for (int i = 0; i < nums.length; i++) {
	    minIndex = findMin(i,nums);
	    for (int j = i;j < nums.length; j++) {

	    }    
	}
    }
    */
    public void sSort(int[] nums) {
	int first;
	int tmp;
	int comparisons = 0;
	for (int i = nums.length - 1; i >= 0; i--) {
	    first = 0;
	    for (int j = 0; j <= i; j++) {
		comparisons++;
		if (nums[i]>nums[first]) {
		    first = j;
		}
	    }
	    tmp = nums[first];
	    nums[first] = nums[i];
	    nums[i] = tmp;
	}
	System.out.println("Comparisons: " + comparisons);
    }
		

    public int findMin(int start, int[] a) {
	int minIndex = 0;
	for (int i = start; i < a.length; i++) {
	    if (a[i] < a[minIndex]) {
		minIndex = i;
	    }
	}
	return minIndex;
    }
	


	

	
}


	
    

    

