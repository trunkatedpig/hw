import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args){

	BubbleSort b = new BubbleSort();
	int[] s = b.randomList();
	long start, end;

	System.out.println("BubbleSort");
	System.out.println(Arrays.toString(s));
	start = System.currentTimeMillis();
	b.bsort(s);
	end = System.currentTimeMillis();
	System.out.println(Arrays.toString(s));
	System.out.println("Comparisons: " + b.getComparisons());
	System.out.println("Swaps: " + b.getSwaps());
	System.out.println("Time: " + (end - start));
	
    }
}