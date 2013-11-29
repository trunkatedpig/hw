import java.io.*;
import java.util.*;

public class Driver{
    
    public static void main(String[] args) {

        Buckets j = new Buckets();
        System.out.println(j);
	long start = System.currentTimeMillis();
        j.sort();
	long end = System.currentTimeMillis();
        System.out.println(j);
	System.out.println("Time elapsed: "+(end - start) + " milliseconds");



        System.out.println();

	int[] a = {5,3,67,2,11,787,3,6,1};
	System.out.println(Arrays.toString(a));
	start = System.currentTimeMillis();
	Arrays.sort(a);
	end = System.currentTimeMillis();
	System.out.println(Arrays.toString(a));
	System.out.println("Time elapsed: "+(end - start) + " milliseconds");
    }
}
