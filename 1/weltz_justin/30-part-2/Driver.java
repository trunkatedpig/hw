import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
	Bucket Justin = new Bucket();
	Bucket Maria = new Bucket(1000); 
	Bucket Bob = new Bucket(20);		 
	Bucket Bobby = new Bucket(10);
	//	System.out.println(Arrays.toString(Justin.getBuckets()));
	Long one = System.currentTimeMillis();
	Justin.sort();
	Long two = System.currentTimeMillis();
	//	System.out.println(Arrays.toString(Justin.getBuckets()));
	System.out.println(two - one);
	System.out.println("-----------------------------------");
	//	System.out.println(Arrays.toString(Maria.getDoubleBuckets()));
	one = System.currentTimeMillis();
	Maria.bubbleSort();
	two = System.currentTimeMillis();
	//	System.out.println(Arrays.toString(Maria.getDoubleBuckets()));
	System.out.println(Maria.getSwap());
	System.out.println(Maria.getComparisons());
	System.out.println(two - one);
	System.out.println("-----------------------------------");
	System.out.println(Arrays.toString(Bob.getDoubleBuckets()));
	one = System.currentTimeMillis();
	Bob.selection();
	two = System.currentTimeMillis();
	System.out.println(Arrays.toString(Bob.getDoubleBuckets()));
	System.out.println(Bob.getSwap());
	System.out.println(Bob.getComparisons());
	System.out.println(two - one);
	System.out.println("-----------------------------------");
	// System.out.println(Arrays.toString(Bobby.getDoubleBuckets()));
	one = System.currentTimeMillis();
	Bobby.insertion();
	two = System.currentTimeMillis();
	//	System.out.println(Arrays.toString(Bobby.getDoubleBuckets()));
	System.out.println(Bobby.getSwap());
	System.out.println(Bob.getComparisons());
	System.out.println(two - one);
	/*The longer the inital array is the longer it takes to sort the array 
	  using either method. The longer the length of the elements of the 
	  inital array, the longer it takes to sort them using either method. 
	  The method we wrote though is the slowest of the two no matter what.
	*/

	

	

	
    }
}
	
