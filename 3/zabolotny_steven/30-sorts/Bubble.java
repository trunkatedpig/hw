import java.io.*;
import java.util.*;

public class Bubble {
    private int comparisons,swaps;

    public int[] bubbleSort(int[] a) {
	for (int n = 0;n < a.length;n++) {
	    for (int i = 0;i < a.length - n - 1;i++) {
		comparisons = comparisons + 1;
		if (a[i] > a[i + 1]) {
		    int current = a[i];
		    a[i] = a[i + 1];
		    a[i + 1] = current;
		    swaps = swaps + 1;
		}
	    }
	}
	return a;
    }
}