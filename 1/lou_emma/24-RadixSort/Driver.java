import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	long start1 = System.currentTimeMillis();
        bucketSort b = new bucketSort();
        //System.out.println(b.get());
		//System.out.println();
       // ArrayList[] um = b.sort();
		b.each();
		long t1 = System.currentTimeMillis()-start1;
		System.out.println(t1);
        /*int[] grr = b.get4Digit();
        for (int i = 0; i < um.length; i++){
            System.out.println(um[i]);
        }*/
		
		
/*		long start = System.currentTimeMillis();
		int[] a = new int[10000];
		Random r = new Random();
		for (long i=0; i<a.length; i++){
            a[i] = r.nextInt(100000000000000000000);
		}
		Arrays.sort(a);
		
		long t = System.currentTimeMillis()-start;
		System.out.println(t);*/
    } 
}

/*   								Built in method | My method
10,000 3 digit numbers						11				9
100,000 3 digit numbers 					60				72
1,000,000 3 digit numbers					176				220
10,000 20 digit numbers 
100,000 20 digit numbers
1,000,000 20 digit numbers


*/