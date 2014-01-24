import java.io.*;
import java.util.*;

public class bubbleSort {

    public int[] bsort(int[] a){
	int j = 0;
	int temp = 0;
	int swapCount=0;
	int compCount=0;
	while (j < a.length-1){

	    for (int i = 0; i< a.length; i++) {
		if (a[i] > a[i+1]) {
		    temp = a[i+1];
		    a[i+1] = a[i];
		    a[i] = temp;
		    swapCount++;
		}
		compCount++;
	    }
	}
	return a;
    }


   public int[] bsortOpt(int[] a){
	int j = 0;
	int temp = 0;
	int swapCount=0;
	int compCount=0;
	int currSwaps=0;
	while (j < a.length-1){
	
	    for (int i = 0; i< a.length; i++) {
		if (a[i] <= a[i+1]) {
		    currSwaps = 1;
		}
		else {
		    currSwaps = 0;
		    
		    if (currSwaps == 1) {
			return a;
		    }	
		}
	    }

	    
	    for (int i = 0; i< a.length; i++) {
		if (a[i] > a[i+1]) {
		    temp = a[i+1];
		    a[i+1] = a[i];
		    a[i] = temp;
		    swapCount++;
		}
		compCount++;
		
	    }
	}
	return a;
    }






}