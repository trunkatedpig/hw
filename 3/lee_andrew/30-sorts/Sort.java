import java.io.*;
import java.util.*;

public class Sort {
    /*private int[] nums = new int[10];
    private Random r = new Random();
    private ArrayList[] buckets = new ArrayList[10];
    private int value;
    private int power =0,maxpower=0;;
    
    public int[] radixSort() {
	for (int i = 0;i<10;i++) {
	    int temp = r.nextInt(10000);
	    nums[i] = temp;
	}
	for(int i=0;i<10;i++)
	    buckets[i] = new ArrayList();
	for (int i =0;i<nums.length;i++){
	    if (nums[i] > power){
		power = nums[i];
	    }
	}
	while (power >0) {
	    power = power / 10;
	    maxpower = maxpower+1;
	}
	for (int n=0;n<maxpower;n++) {
	    for (int i=0;i<nums.length;i++) {
		value = (int)(nums[i] / Math.pow(10,n)) % 10;
		buckets[value].add(nums[i]);
	    }
	    int count = 0;
	    for (int i=0;i<buckets.length;i++) {
		    for (int j = 0;j<buckets[i].size();j++) {
			nums[count] = (Integer)buckets[i].get(j);
			count = count + 1;
		    }
		}
	    for ( int i=0;i<buckets.length;i++) {
		buckets[i] = new ArrayList();
	    }
	}
	return nums;
    }
    */

    private int comparisons = 0;
    private int swaps = 0;

    public int[] bsort(int[] a) {
	int greatest = 0;
	int temp;
	for (int j=0;j<a.length;j++){
	    for (int i=0;i<a.length-1;i++){
		if (a[i] > a[i+1]) {
		    greatest = a[i];
		    comparisons = comparisons + 1;
		    temp = a[i+1];
		    a[i+1] = a[i];
		    a[i] = temp;
		    swaps = swaps + 1;
		}
		else if (a[i] <= a[i+1]) {
		    greatest = a[i+1];
		    comparisons = comparisons + 1;
		}
	    }
	}
	return a;
    }

    public static void main(String[] args) {
	Random r = new Random();
	Sort s = new Sort();
	int[] a = new int[10];
	for (int i=0;i<a.length;i++){
	    a[i] = r.nextInt(100);
	}
	System.out.println(Arrays.toString(s.bsort(a)));
    }
}