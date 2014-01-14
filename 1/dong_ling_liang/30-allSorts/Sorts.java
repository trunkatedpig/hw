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

}