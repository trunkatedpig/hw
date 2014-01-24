import java.io.*;
import java.util.*;

public class Sorts{

    private ArrayList[] buckets = new ArrayList[10];
    private int digits;
    private int[] list;

    public int[] randomList(int n){
	Random r = new Random();
	list = new int[n];
	for(int i=0; i<100; i++){
	    list[i] = r.nextInt(999);
	}
	return list;
    }

    public int[] bsort(int[] a){
	
	int n=0;
	int s=0;
	int h=0;

	for(int i=0; i<a.length; i++){
	    for(int j=0; j<a.length-1; j++){
		n = n+1;
		if(a[j+1] < a[j]){
		    h = a[j];
		    a[j] = a[j+1];
		    a[j+1] = h;
		    s = s+1;
		}
	    }
	}
	System.out.println("Comparisons: " + n);
	System.out.println("Swaps: " + s);
	return list;
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

    public int[] insertionSort(int[] a) {
        int n = 0;
        int s = 0;
        int[] temp = a;
        for (int i = 0; i<a.length; i++) {
	    n = n + 1;
            for (int j = i; j>0; j--) {
                if (temp[j] <= temp[j-1]) {
		    int h = temp[j];
                    temp[j] = temp[j-1];
                    temp[j-1] = h;
                    s = s + 1;
                }   
	    }
        }
        System.out.println("Comparisons: " + n);
        System.out.println("Swaps: " + s);
        return temp;
    }

    public int[] selectionSort(int[] a) {
        int n = 0;
        int s = 0;
        int[] temp = a;
        for (int i = 0; i<a.length; i++) {
         int h = temp[i];
         int min = i;
         for (int j = i+1; j<a.length; j++) {
                if (temp[j] <= h) {
                 h = temp[j];
                 min = j;
                }
                n = n + 1;
         }
         temp[min] = temp[i];
         temp[i] = h;
         s = s + 1;
        }
        System.out.println("Comparisons: " + n);
        System.out.println("Swaps: " + s);
        return temp;
    }                 	
}