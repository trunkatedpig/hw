import java.io.*;
import java.util.*;

public class Radix{
    private long bubbleComps = 0;
    private long bubbleSwaps = 0;
    private long selectionComps = 0;
    private long selectionSwaps = 0;
    private long insertionComps = 0;
    private long insertionSwaps = 0;

    public int[] sort(int[] A){
        ArrayList[] buckets = new ArrayList[10];
        int n = 0;
        while (n<4){
	    for(int i =0;i<10;i++)
                buckets[i] = new ArrayList();
	    for (int j=0;j<A.length;j++){
                buckets[(A[j] / (int)Math.pow(10,n)) % 10].add(A[j]);
	    }
	    int counter = 0;
	    for(int p = 0; p<buckets.length; p++){
                for(int m = 0; m<buckets[p].size(); m = m){
		    A[counter] = (Integer)(buckets[p].remove(0));
		    counter = counter + 1;
                }
	    }
	    n = n + 1;
        }
        return A;
    }

    public int[] bubble(int[] A){
	for (int i =0; i<A.length-1; i++){
	    for (int n =0; n<A.length-1; n++){
		bubbleComps ++;
		if (A[n] > A[n+1]){
		    bubbleSwaps ++;
		    int tmp = A[n];
		    A[n] = A[n+1];
		    A[n+1] = tmp;
		}
	    }
	}
	System.out.println("Comparisons: " + bubbleComps);
	System.out.println("Swaps: " + bubbleSwaps);
	return A;
    }

    public int[] myBubble(int[] A){
	boolean done = false;
	for (int i =0; i<A.length-1 && !done; i++){
	    done = true;
	    for (int n =0; n<A.length-1-i; n++){
		bubbleComps ++;
		if (A[n] > A[n+1]){
		    done = false;
		    bubbleSwaps ++;
		    int tmp = A[n];
		    A[n] = A[n+1];
		    A[n+1] = tmp;
		}
	    }
	}
	System.out.println("-----------------\nBubble Sort");
	System.out.println("Comparisons: " + bubbleComps);
	System.out.println("Swaps: " + bubbleSwaps);
	return A;
    }

    public int[] selection(int[] A){
	int tmp;
	for (int i = 0; i<A.length-1; i++){
	    int minI = i;
	    for (int j = i; j<A.length; j++){
		selectionComps ++;
		if (A[j]<A[minI]){
		    minI = j;
		}
	    }
	    selectionSwaps ++;
	    tmp = A[i];
	    A[i] = A[minI];
	    A[minI] = tmp;
	}
	System.out.println("-------------------\nSelection Sort");
	System.out.println("Comparisons: " + selectionComps);
	System.out.println("Swaps: " + selectionSwaps);
	return A;
    }

    public int[] insertion(int[] A){
	int tmp;
	for (int i=1; i<A.length; i++){
	    tmp = A[i];
	    int j;
	    for (j = i; j>0 && tmp<A[j-1]; j--){
		A[j] = A[j-1];
		insertionComps ++;
		insertionSwaps ++;
	    }
	    A[j] = tmp;
	    insertionSwaps = insertionSwaps + 2;
	}
	insertionSwaps = insertionSwaps / 3;
	System.out.println("-------------------\nInsertion Sort");
	System.out.println("Comparisons: " + selectionComps);
	System.out.println("Swaps: " + selectionSwaps);
	return A;
    }

     // public String toString(int[] A){
     // 	String Ans = "{";
     // 	for (int i = 0; i < A.length; i++)
     // 	    Ans = Ans + A[i] + ", ";
     // 	Ans = Ans + "}";
     // 	return Ans;
     // }
	    
}
