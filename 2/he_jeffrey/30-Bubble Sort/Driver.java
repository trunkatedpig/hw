import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
		int[] rando = new int[6000000];
		for (int i = 0; i < rando.length; i++) {
	    	rando[i] =(int) (Math.random() * 5000000);
		}
		int[] rando2 = Arrays.copyOf(rando,rando.length);
		SortN q = new SortN(rando);
		Bubble b = new Bubble(rando);
		long startTime = System.currentTimeMillis();
		int[] test = q.radix();
		long endTime = System.currentTimeMillis();

		System.out.println("Radix took " + (endTime - startTime) + " milliseconds");
		startTime = System.currentTimeMillis();
	//	System.out.println(Arrays.toString(b.bubbleSort(rando)));
		int[] v = b.bubbleSort(rando2);
		endTime = System.currentTimeMillis();
		System.out.println("Bubble took " + (endTime - startTime) + " milliseconds");

    }
}
