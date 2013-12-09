import java.io.*;
import java.util.*;

public class Buckets {

    private Random r = new Random();
    private ArrayList[] buckets = new ArrayList[10];
    private int place = 1;
    private int[] nums = new int[20];

    public void sort(){
	//Go through the array of buckets and make an array list for each bucket.
	for (int i=0; i<10; i++) {
	    buckets[i] = new ArrayList();
	}
	//Make a list of random 4-digit numbers.
	for (int i=0; i<20; i++) {
	    nums[i] = r.nextInt(10000);
	}
	//This loop repeats the process for each place.
	for (int p=0; p<4; p++) {
	    //This loop goes through each element in our list of numbers.
	    for (int i=0; i<nums.length; i++) {
		//The variable z will keep track of the digit.
		int d =((nums[i]/place) % 10);
		//This loop goes through the buckets and places the number into the right bucket.
		for (int k=0; k<buckets.length; k++) {
		    if (d==k) {
			buckets[k].add(nums[i]);
		    }
		}
		
	    }
	    //copy the buckets back into the list of numbers. This will be done 4 times until the list is sorted.
	    int i = 0;
	    while (i<nums.length) {
		int x = 0;
		while (x<buckets.length) {
		    int y = 0;
		    while (y<buckets[x].size()) {
			nums[i] =(Integer)buckets[x].get(y);
			i++;
			y++;  
		    }
		    x++;
		}
	    }
	}
    }
	    
	    
	    
	    
    

    public String getBuckets() {
    String answer = "";
    for (int i=0; i<buckets.length; i++) {
        answer = answer + buckets[i].toString();
    }
    return answer;
    }
}
