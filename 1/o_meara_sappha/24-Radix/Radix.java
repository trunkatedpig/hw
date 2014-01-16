import java.io.*;
import java.util.*;

public class Radix{
    
    private long BubbleComparisons = 0;
    private long BubbleSwaps = 0;
    private long selectionComps = 0;
    private long selectionSwaps = 0;
    private long insertionComps = 0;
    private long insertionSwaps = 0;
    
    public int[] sort(int[] A){
        ArrayList[] buckets = new ArrayList[10];
        int n = 0;
        while (n < 4){
            for(int i = 0; i < 10; i ++)
                buckets[i] = new ArrayList();
            for (int j = 0; j < A.length; j ++){
                buckets[(A[j] / (int)Math.pow(10,n)) % 10].add(A[j]);
            }
            int counter = 0;
            for(int p = 0; p < buckets.length; p ++){
                for(int m = 0; m < buckets[p].size(); m = m){
                    A[counter] = (Integer)(buckets[p].remove(0));
                    counter = counter + 1;
                }
            }
            n = n + 1;
        }
        return A;
    }

    public int[] bubble(int[] A) {
        for (int i = 0; i < A.length - 1; i ++) {
            for (int j = 0; j < A.length - 1; j ++) {
                BubbleComparisons ++;
                if (A[j] > A[j + 1]) {
                    int t = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = t;
                    BubbleSwaps ++;
                }
            }
        }
	System.out.println("Bubble Sort");
        System.out.println("Comparisons: " + BubbleComparisons);
        System.out.println("Swaps: " + BubbleSwaps);
        return A;
    }
    
    public int[] selection(int[] A){
        int temp;
        for (int i = 0; i < A.length - 1; i ++){
	    int I = i;
            for (int j = i; j < A.length; j ++){
                selectionComps ++;
                if (A[j]<A[I]){
                    I = j;
                }
            }
            selectionSwaps ++;
            temp = A[i];
            A[i] = A[I];
            A[I] = temp;
        }
        System.out.println("Selection Sort");
        System.out.println("Comparisons: " + selectionComps);
        System.out.println("Swaps: " + selectionSwaps);
        return A;
    }

    public int[] insertion(int[] A){
        int temp;
        for (int i = 1; i < A.length; i ++){
            tmp = A[i];
            for (int j = i; j > 0 && temp < A[j - 1]; j --){
                A[j] = A[j - 1];
                insertionComps ++;
                insertionSwaps ++;
            }
            A[j] = temp;
            insertionSwaps = insertionSwaps + 2;
        }
        insertionSwaps = insertionSwaps / 3;
        System.out.println("Insertion Sort");
        System.out.println("Comparisons: " + selectionComps);
        System.out.println("Swaps: " + selectionSwaps);
        return A;
    }
}
