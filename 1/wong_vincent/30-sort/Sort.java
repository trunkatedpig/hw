import java.io.*;
import java.util.*;

public class Sort {
    
    private long comparisons = 0;
    private long swaps = 0;
    
    public int[] bubblesort (int[] D) {
	for (int i = 0; i < D.length-1; i++) {
	    for (int n = 0; n < D.length-1; n++) { //two for loops need to keep checking if the entire array is in order
		comparisons++;
		if (D[n] > D[n+1]) {
		    swaps ++;
		    int temp = D[n];
		    D[n] = D [n+1];
		    D[n+1] = temp;
		}
	    }
	}
	System.out.println("comparisons: " + comparisons);
	System.out.println("swaps: " + swaps);
	return D;
    }

    //_____________________________________________

    public int[] selectionsort (int[] D) {
	int min = 0;
	int temp = 0;

	for (int index = 0; index < D.length-1; index++) {
	    
	    min = D[index];
	    
	    for (int i = index; i < D.length-1; i++) {
		//finding the min and swapping
		if (min > D[i+1]) {
		    min = D[i+1];
		    temp = D[i+1];
		    D[i] = D[i+1];
		    D[i+1] = temp;
		}
	    }
	}
	//System.out.println(min);
	return D;
    }

    //_____________________________________________

}
