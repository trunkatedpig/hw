import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
        long start;
        Sort s = new Sort();
        //int[] tempBb = s.getBb();
        int[] tempB = s.getB();
        int[] tempA = s.getA();
        //int[] tempAa = s.getAa();
	Sort s2 = new Sort();
	int[] tempB2 = s2.getB();
	int[] tempA2 = s2.getA();
	Sort s3 = new Sort();
	int[] tempB3 = s3.getB();
	int[] tempA3 = s3.getA();
	Sort s4 = new Sort();
	int[] tempB4 = s4.getB();
	int[] tempA4 = s4.getA();

	      
        System.out.println("----------------------------------");
        //System.out.println(Arrays.toString(tempB));

        start = System.currentTimeMillis();
        //System.out.println(Arrays.toString(s.bsort(tempB)));
        s.bsort(tempA);
        System.out.println("Bsort: " + (System.currentTimeMillis()-start));
        System.out.println("Comparisons: " + s.getCompare());
        System.out.println("Swaps: " + s.getSwaps());
	
	System.out.println("----------------------------------");
	//System.out.println(Arrays.toString(tempB2));
	
        start = System.currentTimeMillis();
        //System.out.println(Arrays.toString(s2.select(tempB2)));
	s2.select(tempA2);
        System.out.println("selection sort: " + (System.currentTimeMillis()-start));
	System.out.println("Comparisons: " + s2.getCompare());
        System.out.println("Swaps: " + s2.getSwaps());
	//System.out.println("----------------------------------");
	

	System.out.println("----------------------------------");
	//System.out.println(Arrays.toString(tempB3));
	
        start = System.currentTimeMillis();
        //System.out.println(Arrays.toString(s3.insert(tempB3)));
	s3.insert(tempA3);
        System.out.println("insertion sort: " + (System.currentTimeMillis()-start));
	System.out.println("Comparisons: " + s3.getCompare());
	System.out.println("Swaps: " + s3.getSwaps());
	//System.out.println("----------------------------------");


        System.out.println("----------------------------------");
        //System.out.println(Arrays.toString(tempB4));
        
        start = System.currentTimeMillis();
        //System.out.println(Arrays.toString(s4.radix(tempB4)));
        s4.radix(tempA4);
        System.out.println("Radixsort: " + (System.currentTimeMillis()-start));
        System.out.println("----------------------------------");
	


	}
}
