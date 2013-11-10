import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	System.out.println();
	System.out.println("*-* Testing class ArrayStuff *-*");
	System.out.println();

	ArrayStuff as = new ArrayStuff();

	System.out.println("Print out Array, length 20, with random numbers 0-99");
	System.out.println(as);
	System.out.println();

	System.out.println("Find the element at index 18, and return the smallest index of that element:");
	System.out.println(as.find(as.get(18)));
	System.out.println();


	System.out.println("Find the index of number 83, if not in the array, return -1:");
	System.out.println(as.find(83));
	System.out.println();


	System.out.println("Find the largest number in the array:");
	System.out.println(as.get(as.findMaxIndex()));
	System.out.println();

	System.out.println("Find the mean of the array:");
	System.out.println(as.mean());
	System.out.println();

	System.out.println("Find the standard deviation of the array:");
	System.out.println(as.stddev());
	System.out.println();



    }

}
