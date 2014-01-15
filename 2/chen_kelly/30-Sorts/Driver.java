import java.io.*;
import java.util.*;
 
public class Driver{
    public static void main (String[] args){
	long start;
	Sort s = new Sort();
	int[] tempBb = s.getBb();
	int[] tempB = s.getB();
	int[] tempA = s.getA();
	int[] tempAa = s.getAa();
 
   
	System.out.println("----------------------------------");
	//System.out.println(Arrays.toString(tempBb));
 
	start = System.currentTimeMillis();
	//System.out.println(Arrays.toString(s.bsort(tempBb)));
	s.bsort(tempAa);
	System.out.println("Bsort: "  + (System.currentTimeMillis()-start));
	System.out.println("Comparisons: " + s.getCompare());
	System.out.println("Swaps: " + s.getSwaps());
 
	System.out.println("----------------------------------");
	//System.out.println(Arrays.toString(tempB));
   
	start = System.currentTimeMillis();
	//System.out.println(Arrays.toString(s.radix(tempB)));
	s.radix(tempA);
	System.out.println("Radixsort: " + (System.currentTimeMillis()-start));
	System.out.println("----------------------------------");
 
 
    } 
}
