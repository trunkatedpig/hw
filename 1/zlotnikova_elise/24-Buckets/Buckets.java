import java.io.*;
import java.util.*;

public class Buckets {
    public static void main(String[] args){

	ArrayList[] buckets = new ArrayList[10];
	int[] nums = new int[10];
	for(int i = 0; i<10; i++) { 
	    buckets[i] = new ArrayList();
	}

	Random r = new Random();
	for (int i=0; i<10; i++) { 
	    nums[i] = 1000 + r.nextInt(9000);
	}

	for (int i=0;i<10;i++) { 
	    System.out.print(""+ nums[i] + ", ");
	}
	System.out.println("");

	//////////////////////
	//	for (int n=0; n<4; n++){
	int n = 0;
	for (int i=0; i<nums.length; i++){
	    int digit = (nums[i]/(int)Math.pow(10,n)%10);
	    buckets[digit].add(nums[i]);
	}
	int z = 0;
	while (z<nums.length){
	    for (int x=0; x<buckets[z].size(); x++){
		nums[z] = (Integer)buckets[z].get(x);
	    }
	    z = z + 1;
	}
	    /*
	    buckets = new ArrayList[10];
	    for(int q = 0; q<10; q++) { 
		buckets[q] = new ArrayList();
	    }
	    */
	    //}
	/////////////////////

	for (int i=0;i<10;i++) { 
	System.out.print(""+ buckets[i] + ", ");
	}

	for (int i=0;i<10;i++) { 
	    System.out.print(""+ nums[i] + ", ");
	}
	System.out.println("");
    }
}
