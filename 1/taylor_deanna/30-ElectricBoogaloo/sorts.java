import java.io.*;
import java.util.*;

public class sorts{
       
    private long comps = 0;
    private long swaps = 0;

    // Radix sort is in HW24

    public int[] bubbleSort(int[] A){
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

    public int[] insertionSort(int[] A){
	int[] result = A;
	int swaps = 0;
	int comps = 0;
	for(int i = 1; i < A.length; i++){
	    boolean end = false;
	    int temp = result[i];
	    for(int k = 0; k < A.length && end == false; k++){
		if(k == 0 && temp <= A[k]){
		    A[i] = A[k];
		    A[k] = temp;
		    swaps++;
		}
	        if(k > 0 && temp > A[k-1] && temp < A[k]){
		    A[i] = A[k];
		    A[k] = temp;
		    swaps = swaps + 1;
		}
		comps++;
	    }
	}
	System.out.println("Comparisons:" + comps);
	System.out.println("Swaps:" + swaps);
	return result;
    }

    // cant get this to work in main
    public int[] selectionSort(int[] A){
	int[] result = A;
	int swaps = 0;
	int comps = 0;
	int temp = 0;
	int pos = 0;
	for(int i = 0; i < result.length; i ++){
	    boolean begin = true;
	    temp = result[i];
	    for (int k = i; i < result.length; k++){
		comps++;
		if(temp < result[k]){
		    temp = result[k];
		    pos = k;
		    result[k] = result[i];
		}
	    }
	    result[i] = temp;
	    swaps++;
	}
	System.out.println("Swaps:" + swaps);
	System.out.println("Comparisons:" + comps);
	return result;
    }
}
