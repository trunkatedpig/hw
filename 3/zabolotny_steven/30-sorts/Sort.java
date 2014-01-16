import java.io.*;
import java.util.*;

public class Sort {
    private int comparisons,assignments;

    public int[] bubbleSort(int[] a) {
	comparisons = 0;
	assignments = 0;
	for (int n = 0;n < a.length;n++) {
	    for (int i = 0;i < a.length - n - 1;i++) {
		comparisons = comparisons + 1;
		if (a[i] > a[i + 1]) {
		    int current = a[i];
		    a[i] = a[i + 1];
		    a[i + 1] = current;
		    assignments = assignments + 3;
		}
	    }
	}
	return a;
    }

    public int[] insertionSort(int[] a) {
	comparisons = 0;
	assignments = 0;
	for (int n = 0;n < a.length - 1;n++) {
	    comparisons = comparisons + 1;
	    if (a[n] > a[n + 1]) {
		for (int i = n + 1;i > 0;i--) {
		    comparisons = comparisons + 1;
		    if (a[i] < a[i - 1]) {
			assignments = assignments + 3;
			int small = a[i];
			a[i] = a[i - 1];
			a[i - 1] = small;
		    } else
			i = 0;
		}
	    }
	}
	return a;
    }

    public int[] selectionSort(int[] a) {
	comparisons = 0;
	assignments = 2;
	int value = a[0];
	int index = 0;
	for (int n = 0;n < a.length;n++) {
	    assignments = assignments + 2;
	    value = a[n];
	    index = n;
	    for (int i = n;i < a.length;i++) {
		comparisons = comparisons + 1;
		if (a[i] < value) {
		    assignments = assignments + 2;
		    value = a[i];
		    index = i;
		}
	    }
	    assignments = assignments + 2;
	    a[index] = a[n];
	    a[n] = value;
	}
	return a;
    }    

    public int getComparisons() {
	return comparisons;
    }

    public int getAssignments() {
	return assignments;
    }
}