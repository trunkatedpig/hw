import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("*-* Testing class Sorter *-*");
        System.out.println();

		System.out.println("PART 1: Testing my Sorters");
		System.out.println();

        Sorter s = new Sorter(3,10);

        System.out.println("Original Int Array:");
        System.out.println(s);
        s.radix();
        System.out.println("Radix-Sorted Int Array:");
        System.out.println(s);
        System.out.println();

        Sorter t = new Sorter(3,10);

        System.out.println("Original Int Array:");
        System.out.println(t);
        t.bubble(t.getnums());
        System.out.println("Bubble-Sorted Int Array:");
        System.out.println(t);
        System.out.println("Number of Comparisons: " + t.getComp());
        System.out.println("Number of Swaps: " + t.getSwap());
        System.out.println();

        Sorter u = new Sorter(3,10);

        System.out.println("Original Int Array:");
		System.out.println(u);
		u.selection(u.getnums());
		System.out.println("Selection-Sorted Int Array:");
		System.out.println(u);
		System.out.println("Number of Comparisons: " + u.getComp());
        System.out.println("Number of Swaps: " + u.getSwap());
        System.out.println();

        Sorter v = new Sorter(3,10);

		System.out.println("Original Int Array:");
		System.out.println(v);
		v.insertion(v.getnums());
		System.out.println("Insertion-Sorted Int Array:");
		System.out.println(v);
		System.out.println("Number of Comparisons: " + v.getComp());
        System.out.println("Number of Swaps: " + v.getSwap());
        System.out.println();

        System.out.println("PART 2: Testing Speed of Sorters");
        System.out.println("Each Sorter Sorts a 100,000 3-digit numbers");
        System.out.println();

        long start, timer;

        Sorter a = new Sorter(3,100000);
        start = System.currentTimeMillis();
		a.radix();
		timer = System.currentTimeMillis()-start;
		System.out.println("Time for my Radix Sort: " + timer);

		Sorter b = new Sorter(3,100000);
		start = System.currentTimeMillis();
		b.bubble(b.getnums());
		timer = System.currentTimeMillis()-start;
		System.out.println("Time for my Bubble Sort: " + timer);

		Sorter c = new Sorter(3,100000);
		start = System.currentTimeMillis();
		c.selection(c.getnums());
		timer = System.currentTimeMillis()-start;
		System.out.println("Time for my Selection Sort: " + timer);

		Sorter d = new Sorter(3,100000);
		start = System.currentTimeMillis();
		d.insertion(d.getnums());
		timer = System.currentTimeMillis()-start;
		System.out.println("Time for my Insertion Sort: " + timer);

		Random rand = new Random();
		int[] e = new int[100000];
		int range = 1;
		for (int j = 0; j<3; j++)
		    range = range * 10;
		for (int i = 0; i<100000; i++)
         	e[i] = rand.nextInt(range);
        start = System.currentTimeMillis();
		Arrays.sort(e);
		timer = System.currentTimeMillis()-start;
		System.out.println("Time for built-in java Sorting: " + timer);

		/* My radix sorter was faster than the built-in java sorter when I was trying
		to sort 10,000 3-digit numbers, however when I tried to sort 1,000,000 3-digit
		numbers, my radix sorter took 25391 while the built-in sorter only took 94*/

		/*The bubble sorter is alot less effective than the radix and the java built-in sorter.
		For a sort of 100,000 3-digit numbers, the radix took 350, the built-in java took 49, and
		the bubble took 40408*/


    }
}