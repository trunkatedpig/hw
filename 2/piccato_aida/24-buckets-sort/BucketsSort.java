import java.io.*;
import java.util.*;

public class BucketsSort {
    private ArrayList<Integer>[] buckets = new ArrayList[10];
    private int[] nums = new int[10];

    public String toString() {
	return Arrays.toString(nums);
    }

    public String printBuckets() {
	return Arrays.toString(buckets);
    }
    
    public BucketsSort() {
	for (int i = 0; i < 10; i++) {
	    buckets[i] = new ArrayList<Integer>();
	}
	Random r = new Random();
	for (int i = 0; i < nums.length; i++) {
	    nums[i] = r.nextInt(8999)+1000;
	}
    }

    public void sort() {
	int value;
	ArrayList<Integer> temint[] temp;
	for (int n=0;n<4;n++){
	    for (int i = 0;i<nums.length;i++) {
		value = (int)((nums[i]/(Math.pow(10,n))) % 10);
	        buckets[value].add(nums[i]);
		//	System.out.println(buckets[value]);
	    }
	    System.out.println("Buckets: "+ this.printBuckets());
	    p=new int[nums.length];
	    /*int k = 0;
	    while (k < temp.length) {*/
	    int k;
		for (int i=0;i<buckets.length;i++){
		    if (buckets[i].size()!=0){
			for (int j=0;j<buckets[i].size();j++){
			    System.out.println(buckets[i]
			}
			temp[i]=k;
		    }
		}
	    
	    nums=temp;
	    System.out.println(this);
	}

    }
	
    

    
}