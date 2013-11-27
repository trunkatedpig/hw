import java.io.*;
import java.util.*;

public class Driver {
    public static void main (String[] args) {
		ArrayList[] buckets = new ArrayList[10];
		int n = 0, maxDigit = 4;
		
		// makes the arraylist that sorts the array
		for (int i = 0; i < 10; i++) {
		    buckets[i] = new ArrayList();
		}

		// makes the array of ints to be sorted
		int[] a = new int[20];
		for (int i = 0; i < 20; i++) {
		    Random r = new Random();
		    a[i] = r.nextInt((int)(Math.pow(10, maxDigit)));
		}

		System.out.println(a);
		while (n < maxDigit) {
		    for (int i = 0; i < 20; i++) {
			int b =  (int)((a[i]/(Math.pow(10, n))) % 10);
			buckets[b].add(a[i]);
		    }
		    int[] newArray = new int[20];
		    int ArrayCount = 0;
		    for (int i = 0; i < 10; i++) {
			//i goes through the buckets and so buckets[i] is the list of items
			for (int x = 0; x < buckets[i].size(); x++){
				    //x goes through buckets[i] and adds each number to newArray
					Integer y = (Integer)x;
				    newArray[ArrayCount] = buckets[i].remove((int) y);
				    ArrayCount++;
				}
		    }
		    a = newArray;
		    n++;
		}
		System.out.println(a);
    }
}