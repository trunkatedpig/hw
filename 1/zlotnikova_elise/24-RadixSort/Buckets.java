import java.io.*;
import java.util.*;

public class Buckets { 
    int g = 10000;
    ArrayList[] buckets = new ArrayList[g];
    int[] nums = new int[g];

    public Buckets() { 
	for(int i = 0; i<g; i++) { 
	    buckets[i] = new ArrayList();
	}
	Random r = new Random();
	for (int i=0; i<g; i++) { 
	    nums[i] = 1000 + r.nextInt(9000);
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
}
