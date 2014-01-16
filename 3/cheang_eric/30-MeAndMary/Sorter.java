import java.io.*;
import java.util.*;

public class Sorter {

    private ArrayList[] buckets = new ArrayList[10];
    private int[] nums;
    private int arrayLength, numDigits;
    private int currentDigit = 0;

    public Sorter(int l, int d) {
	arrayLength = l;
	numDigits = d;
	nums = new int[l];
	for(int i=0; i<buckets.length; i++)
	    buckets[i] = new ArrayList<Integer>();
	Random r = new Random();
	int power = (int)(Math.pow(10,d));
	for(int i=0; i<l; i++)
	    nums[i] = r.nextInt(power);
    }

    public void rsort() {
	while (currentDigit < numDigits) {
	    for(int i=0; i<nums.length; i++) {
		int sortDigit = (nums[i]/(int)(Math.pow(10,currentDigit)))%10;
		buckets[sortDigit].add(nums[i]);
	    }
	    int index = 0;		
	    for(int i=0; i<buckets.length; i++) {
		for(int j=0; j<buckets[i].size(); j++) {
		    nums[index] = (Integer)(buckets[i].get(j));
		    index++;
		}
		buckets[i].clear();
	    }
	    currentDigit++;
	}
	currentDigit = 0;
    }

    public void bsort(int[] a) {
	int len=a.length,swaps=0,localswaps=0,comparisons=0;
	while (len>0) {
	    for (int i=0;i<a.length-1;i++) {
		if (a[i]>a[i+1]) {
		    int temp=a[i];
		    a[i]=a[i+1];
		    a[i+1]=temp;
		    swaps++;
		    localswaps++;
		}
		comparisons++;
		if (localswaps==0)
		    len=0;
		localswaps=0;
	    }
	    len--;
	}
	System.out.println("Bubble sort:");
	System.out.println("Number of times the sorter went through the loop: "+comparisons);
	System.out.println("Total number of swaps: "+swaps);
    }

    public int[] getNums() {
	return nums;
    }

    public String toString() {
	return Arrays.toString(nums);
    } 

}
