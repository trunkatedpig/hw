import java.util.*;
import java.io.*;

public class Sort {

    private ArrayList[] buckets = new ArrayList[10];
    private int digits, size;
    Random rand = new Random();

    public int[] makeArray(int d, int s) {
        int[] nums = new int[s];
        int range = 1;
        for (int j = 0; j<d; j++)
            range = range * 10;
        for (int i = 0; i<s; i++)
            nums[i] = rand.nextInt(range);
	digits = d;
	size = s;
	return nums;
    }
        
    public int[] radixSort(int[] a) {
	int[] tempArray = a;
        for (int i = 0; i<10; i++)
            buckets[i] = new ArrayList();
        for (int b = 0; b<digits; b++){
            for (int c = 0; c<a.length; c++){
                int z = tempArray[c];
                for (int d = b; d>0; d--)
                    z = z/10;
                z = z%10;
                buckets[z].add(tempArray[c]);
            }
            for (int e = 0; e<a.length; e++){
                for (int f = 0; f<buckets.length;f++) {
                    if (buckets[f].size() != 0) {
                        tempArray[e] = (Integer) buckets[f].get(0);
                        buckets[f].remove(0);
                        f = buckets.length;
                    }
                }
            }
        }
	return tempArray;
    }
    

    public int[] bubbleSort(int[] a) {
	int compFreqs = 0;
	int swapFreqs = 0;
	int[] tempArray = a;
	boolean done = false;
	for (int i = 0; i<a.length && done != true; i++) {
	    done = true;
	    for (int j = 0; j<a.length - 1 - i; j++) {
		compFreqs++;
		if (tempArray[j] > tempArray[j+1]) {
		    swapFreqs++;
		    int temp = tempArray[j];
		    tempArray[j] = tempArray[j+1];
		    tempArray[j+1] = temp;
		    done = false;
		}
	    }
	}
	System.out.println("Comparisons: " + compFreqs);
	System.out.println("Swaps: " + swapFreqs);
	return tempArray;
    }

    public int[] insertionSort(int[] a) {
        int swapFreqs = 0;
        int compFreqs = 0;
        int[] tempArray = a;
        for (int i = 0; i<a.length; i++) {
            for (int j = i; j>0; j--) {
                if (tempArray[j] <= tempArray[j-1]) {
		    int temp = tempArray[j];
                    tempArray[j] = tempArray[j-1];
                    tempArray[j-1] = temp;
                    swapFreqs++;
		}
                compFreqs++;
	    }
        }
        System.out.println("Comparisons: " + compFreqs);
        System.out.println("Swaps: " + swapFreqs);
        return tempArray;
    }

    public int[] selectionSort(int[] a) {
	int swapFreqs = 0;
        int compFreqs = 0;
        int[] tempArray = a;
        for (int i = 0; i<a.length; i++) {
	    int temp = tempArray[i];
	    int min = i;
	    for (int j = i+1; j<a.length; j++) {
		if (tempArray[j] <= temp) {
		    temp = tempArray[j];
		    min = j;
		}
		compFreqs++;
	    }
	    tempArray[min] = tempArray[i];
	    tempArray[i] = temp;
	    swapFreqs++;
	}
        System.out.println("Comparisons: " + compFreqs);
        System.out.println("Swaps: " + swapFreqs);
	return tempArray;
    }		  
}
