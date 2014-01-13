import java.io.*;
import java.util.*;

public class Bubble{

    public int[] BubbleSort(int[] data){
	int[] sorted = data;
	int comparisons = 0;
	int swaps = 0;
	for(int j = 0; j< sorted.length-1; j++){
	    for (int i = 0; i < sorted.length - 1; i++){
		if(sorted[i] > sorted[i+1]){
		    int temp = sorted[i+1];
		    sorted[i+1] = sorted[i];
		    sorted[i] = temp;
		    swaps++;
		    comparisons++;
		}
	    }
	}
	return sorted;
    }

    public static void main (String[] args){
	Bubble b = new Bubble();
	int[]a = {4, 2, 7, 32, 5};
	System.out.println(Arrays.toString(b.BubbleSort(a)));

    }
}