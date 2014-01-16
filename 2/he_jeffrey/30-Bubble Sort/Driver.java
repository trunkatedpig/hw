import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
		int[] rando = new int[50000];
		for (int i = 0; i < rando.length; i++) {
	    	rando[i] =(int) (Math.random() * 5000000);
		}
		int[] rando2 = Arrays.copyOf(rando,rando.length);
		
		SortN q = new SortN(Arrays.copyOf(rando,rando.length));
		Bubble b = new Bubble(rando);
		long startTime = System.currentTimeMillis();
		int[] test = q.radix();
		long endTime = System.currentTimeMillis();

		System.out.println("Radix took " + (endTime - startTime) + " milliseconds\n");
		startTime = System.currentTimeMillis();
		int[] v = b.bubbleSort(rando2);
		endTime = System.currentTimeMillis();
		System.out.println("Bubble took " + (endTime - startTime) + " milliseconds\n");

		Selection s = new Selection(Arrays.copyOf(rando,rando.length));
		startTime = System.currentTimeMillis();
		s.selection();
		endTime = System.currentTimeMillis();
		System.out.println("Selection took " + (endTime - startTime) + " milliseconds\n");

		Insertion i = new Insertion(Arrays.copyOf(rando,rando.length));
		startTime = System.currentTimeMillis();
		i.insertion();
		endTime = System.currentTimeMillis();

    }
}
