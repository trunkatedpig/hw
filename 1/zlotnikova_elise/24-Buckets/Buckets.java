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

	int n = 0;

	for (int i=0; i<10; i++){
	    int digit = (nums[i]/(int)Math.pow(10,n)
			 %10);
	    buckets[digit].add(nums[i]);
	    n = n + 1;
	}

	for (int i=0;i<10;i++) { 
	    System.out.print(""+ buckets[i] + ", ");
	}

    }
}
