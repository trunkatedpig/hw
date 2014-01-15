import java.io.*;
import java.util.*;

public class Sorts {
    public double[] bubbleSort(double[] list){
	int compares = 0;
	int swaps = 0;
	for (int p = 0; p < list.length; p++){
	    for (int i = 0; i < list.length-1; i++){
		if (list[i] > list[i+1]){
		    double temp = list[i];
		    list[i] = list[i+1];
		    list[i+1] = temp;
		    swaps = swaps + 1;
		}
		compares = compares + 1;
	    }
	}
	System.out.println("Swaps: " + swaps + " Comparisons " + compares);
	return list;
    }
    public double[] radixSort(double[] values, int numDigs){
	int numNums = values.length;
	ArrayList[] buckets = new ArrayList[numNums];
	for (int i = 0; i<numNums; i++){
	    buckets[i] = new ArrayList();
	}
	for (int n = 0; n<numDigs; n++){
	    for (int y = 0; y <numNums; y++){
		buckets[(int)(values[y]/Math.pow(10,n))%10].add(values[y]);
	    }
	    int a = 0;
	    for (int z = 0; z <numNums; z++){
		for (int r = 0; r <buckets[z].size(); r++){
		    values[a] = (Double)buckets[z].get(r);
		    a = a +1;
		}
	    }
	    for (int b = 0; b <buckets.length; b++){
		buckets[b].clear();
	    }
	}   
	return values;
    }
    public double[] insertionSort(double[] list){
	int assigns = 0;
	for (int i=0; i<list.length-1; i++){
	    int m = i;
	    while (m>=0 && list[m] > list [m + 1]){
		double temp = list[m];
		list[m] = list [m+1];
		list[m+1] = temp;
		assigns = assigns + 1;
		m = m -1;
	    }
	}
	System.out.println ("assigns: " + assigns);
	return list;
    }
    public double[] selectionSort(double[] list){
	int swaps = 0;
	int compares = 0;
	for (int i = 0; i<list.length; i++){
	    int curMin = i;
	    for (int m= i; m <list.length; m++){
		if (list[curMin] > list[m]){
		    curMin = m;
		}
		compares = compares + 1;
	    }
	    double temp = list[i];
	    list[i] = list[curMin];
	    list[curMin] = temp;
	    swaps = swaps + 1;
	}
	System.out.println ("swaps: " + swaps + " compares: " + compares);
	return list;
    }

}