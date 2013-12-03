import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("*-* Testing class Sorter *-*");
        System.out.println();

		System.out.println("PART 1: Testing my Radix Sorter");
		System.out.println();

        Sorter s = new Sorter();

        System.out.println("Original Int Array:");
        System.out.println(s);
        s.arrange();
        System.out.println("Sorted Int Array:");
        System.out.println(s);
        System.out.println();

        Sorter t = new Sorter(9,5);

        System.out.println("Original Int Array:");
        System.out.println(t);
        t.arrange();
        System.out.println("Sorted Int Array:");
        System.out.println(t);
        System.out.println();

        System.out.println("PART 2: Testing Speed of Sorters");
        System.out.println();

        long start, timer;

        Sorter u = new Sorter(3,100000);
        start = System.currentTimeMillis();
		u.arrange();
		timer = System.currentTimeMillis()-start;
		System.out.println("Time for my Radix Sort: " + timer);

		Random rand = new Random();
		int[] a = new int[100000];
		int range = 1;
		for (int j = 0; j<3; j++)
		    range = range * 10;
		for (int i = 0; i<100000; i++)
         	a[i] = rand.nextInt(range);
        start = System.currentTimeMillis();
		Arrays.sort(a);
		timer = System.currentTimeMillis()-start;
		System.out.println("Time for built-in java Sorting: " + timer);

		/* My radix sorter was faster than the built-in java sorter when I was trying
		to sort 10,000 3-digit numbers, however when I tried to sort 1,000,000 3-digit
		numbers, my radix sorter took 25391 while the built-in sorter only took 94*/


    }
}