import java.io.*;
import java.util.*;

public class Arrays {
    public int[] Revfill(int n) {
	// Will return an array, size n with the values n, n-1, n-2, ..., 1
	int[] Rev = new int[n];
	for(int i = 0;i < n;i++) {
	    Rev[i] = n - i;
	}
	return Rev;
    }

    public int[] makeRandom(int n, int min, int max) {
	// Returns an array of n random ints, each between min and max.
	int[] array = new int[n];
	for(int i = 0;i < n;i++) {
	    Random r = new Random();
	    int value = r.nextInt(max - min) + min;
	    array[i] = value;
	}
	return array;
    }

    public int Sum13(int[] a) {
	// Returns sum of all values in array excluding all 13s.
	int sum = 0;
	for(int i = 0;i < a.length;i++) {
	    if (a[i] != 13)
		sum = sum + a[i];
	}
	return sum;
    }

    public boolean modthree(int[] a) {
	// True if there are 3 odd or 3 even numbers in a row, false otherwise
	String value = "";
	int streak = 0;
	for (int i = 0;i < a.length;i++) {
	    if (a[i] % 2 == 0) {
		if (value.equals("Even"))
		    streak = streak + 1;
		else
		    streak = 1;
		value = "Even";
	    }
	    else {
		if (value.equals("Odd"))
		    streak = streak + 1;
		else
		    streak = 1;
		value = "Odd";
	    }
	    if (streak == 3)
		return true;
	}
	return false;
    }
}