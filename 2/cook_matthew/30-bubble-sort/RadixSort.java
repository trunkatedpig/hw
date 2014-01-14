import java.io.*;
import java.util.*;

public class RadixSort {
    private int arraylength;
    private int digits;
    private int[] nums;
    private ArrayList[] buckets;
    private int[] temp;


    public RadixSort(int a, int b){
	arraylength = a;
	digits = b;
	nums = new int[arraylength];
	for (int i = 0; i < arraylength; i++){
	    nums[i] = (int) (Math.random() * Math.pow(10,b));
	}
    }

    public String toString (){
	return (Arrays.toString(nums));
    }

    public void sort(){
	for (int digit = 0; digit < digits; digit ++){
	    buckets = new ArrayList[10];
	    for (int i = 0; i < 10; i ++){
		buckets[i] = new ArrayList();
	    }
	    for (int current = 0; current < arraylength; current ++){
		int digitval = (int) (nums[current] / Math.pow(10, digit)) % 10;
		buckets[digitval].add(nums[current]);
	    }
	    temp = new int[arraylength];
	    int place = 0;
	    for (int j = 0; j < 10; j++){
		for (int aplace = 0; aplace < buckets[j].size(); aplace ++){
		    temp[place] = (Integer)buckets[j].get(aplace);
		    place = place + 1;
		}
	    }
	    nums = temp;
	}
    }
    
    public int[] bsort() {
	int numSwaps=0;
	int numComps=0;
	int i;
	for (int q=0; q<nums.length-1; q++) {
	    i=0;
	    for (int r=0; r<nums.length-1; r++) {
		if (nums[r] > nums[r+1]){
		    i=1; 
		    int a= nums[r+1];
		    nums[r+1] = nums[r]; 
		    nums[r]=a;
		    numSwaps= numSwaps+1;
		}
		numComps=numComps+1;
		
	    }
	    if (i==0) {
		break;
	    }
	    numComps = numComps + 1;
	}
	System.out.println(numSwaps+ ":" + numComps);
	return nums;
    }





}
