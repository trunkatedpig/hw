import java.io.*;
import java.util.*;

public class Arrays {
    
    public int[] Revfill(int n) {
	int[] a = new int[n];
	int j = 0;
	for (int i = n; i > 0; i--) {
	    a[j] = i;
	    j = j + 1;
	}
        return a;
    }
    
    public int[] makeRandom(int n, int min, int max) {
	int [] a = new int [n];
	Random rand = new Random();
	for (int i = 0; i < n; i ++) {
	    a[i] = min + rand.nextInt(max - min + 1);
	}
	return a;
    }
    
    public int sum13(int[] a) {
	int sum = 0;
	for (int i = 0; i < a.length; i ++) {
	    if (a[i] != 13)
		sum = sum + a[i];
	}
	return sum;
    }
    
    public boolean modThree(int[] a) {
	int oddrun = 0;
	int evenrun = 0;
	for (int i = 0; i < a.length; i ++) {
	    if ((a[i] % 2) == 0) {
		oddrun = 0;
		evenrun = evenrun + 1;
		if (evenrun == 3)
		    return true;
	    }
	    else if ((a[i] % 2) == 1) {
		oddrun = oddrun + 1;
		evenrun = 0;
		if (oddrun == 3)
		    return true;
	    }
	}
	return false;
    }
}
    
    
