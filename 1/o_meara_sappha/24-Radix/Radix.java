import java.io.*;
import java.util.*;

public class Radix{
    
    private int BubbleComps = 0;
    private int BubbleSwaps = 0;
    
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
		BubbleComps ++;
		if (A[i] > A[i + 1]) {
		    int t = A[i];
		    A[i] = A[i + 1];
		    A[i + 1] = t;
		    BubbleSwaps ++;
		}
	    }
	}
	return A;
    }
}