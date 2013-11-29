import java.io.*;
import java.util.*;

public class Driver{
    
    public static void main(String[] args) {

        Buckets j = new Buckets();
        //System.out.println(j);
	long start = System.currentTimeMillis();
        j.sort();
	long end = System.currentTimeMillis();
        //System.out.println(j);
	System.out.println("Time elapsed: "+(end - start) + " milliseconds");

        System.out.println();

	int[] a = new int[1000000];
        for (int i = 0; i < 1000000; i++)
            a[i] = (int) (Math.random() * Math.pow(10,20));
	//System.out.println(Arrays.toString(a));
	start = System.currentTimeMillis();
	Arrays.sort(a);
	end = System.currentTimeMillis();
	//System.out.println(Arrays.toString(a));
	System.out.println("Time elapsed: "+(end - start) + " milliseconds");

	//Test results: for 10000 3 digits --> mine=28ms cpu=8ms
	//For 100000 3 digits --> mine=162ms cpu=25ms
	//For 1000 20 digits --> mine=23ms cpu=1ms
	//For 10000 20 digits --> mine=88ms cpu=1ms
	//For 100000 20 digits --> mine=770ms cpu=7ms
	//For 1000000 20 digits --> mine=9622ms cpu=12ms

	//The cpu sort is linear, while my sort is exponential.

    }
}
