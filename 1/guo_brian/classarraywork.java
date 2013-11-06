import java.io.*;
import java.util.*;

public class classarraywork {
    
    public int[] revfill(int n) {
	int [] result = new int [n];
	int i = 0;
	for (int k = n; k > 0; k--) {
	    result [i] = n;
	    i = i + 1;
	}
	return result;
    }

    public int[] makeRandom(int n, int min, int max) {
	int [] result = new int [n];
	for (int i = 0; i < n; i++) {
	    Random r = new Random();
	    result[i] = r.nextInt(max - min + 1) + min;
	}
	return result;
    }
    
    public int sum13(int[] a) {
}