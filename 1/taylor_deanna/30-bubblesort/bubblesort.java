import java.io.*;
import java.util.*;

public class bubblesort{
       
    private long comps = 0;
    private long swaps = 0;

    public int[] bubble(int[] A){
	for (int i =0; i<A.length-1; i++){
	    for (int n =0; n<A.length-1; n++){
		comps ++;
		if (A[n] > A[n+1]){
		    swaps ++;
		    int tmp = A[n];
		    A[n] = A[n+1];
		    A[n+1] = tmp;
		}
	    }
	}
	System.out.println("Comparisons: " + comps);
	System.out.println("Swaps: " + swaps);
	return A;
    }
}
