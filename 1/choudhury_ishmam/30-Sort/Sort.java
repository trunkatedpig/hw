import java.io.*;
import java.util.*;

public class Sort {
    int [] a;
    public Sort (int size) {
	a = new int [size];
	Random r = new Random();
	for (int i = 0; i < size; i++) {
            a[i]= r.nextInt(9999);
        }
    }

    public int [] radixSort () {
        ArrayList[] buckets = new ArrayList[10];

	for (int b = 0; b < 4; b ++) {
	    for (int i = 0; i < 10; i++) {
		buckets [i] = new ArrayList();
	    }
   
	    int n = 0;
	    for (int i = 0;i < a.length; i++) {
		buckets[(a[i]/10^n)% 10].add(a[i]);
	    }
	    int count = 0;
	    for(int i = 0; i<buckets.length; i++){
		for(int o = 0; o<buckets[i].size(); o = o){
		    a[count] = (Integer)(buckets[i].remove(o));
		    count++;

		}
	    }
	}
	
	return a;
    }
    
    public int [] bSort (){
        long count = 0;
	long swap = 0;
	for (int i =0; i<a.length-1; i++){
            for (int u =0; u<a.length-1; u++){
                count++;
                if (a[u] > a[u+1]){
                    swap ++;
                    int Tmp = a[u];
                    a[u] = a[u+1];
                    a[u+1] = Tmp;
                }
	    }
	   
   
	}
	System.out.println ("Swaps:" + swap);
	System.out.println("Comparisons:" + count);
	
	return a;
    }

    public int[] selectionSort(){
	long count = 0;
	long swap = 0;
	for (int i = 0; i<a.length-1; i++){
	    int s = i;
	    for (int m = i; m<a.length; m++){
		count ++;
		if (a[m]<a[s]){
		    s = m;
		}
	    }
	    int Tmp = a[i];
	    a[i] = a[s];
	    a[s] = Tmp;
	    swap ++;
	}

	System.out.println("SelectionSwaps: " + swap);
	System.out.println("SelectionComparisons: " + count);
	return a;
    }


    public int[] insertionSort(){
        long count = 0;
	long swap = 0;
        for (int i=0; i<a.length - 1; i++){ 
            int Tmp = a[i];
	    int m = i;
            for (m = i; m < a.length -1; m++){
                a[m] = a[m+1];
                count ++;
                swap ++;
            }
            a[m] = Tmp;
            swap ++;
        }
	System.out.println("InsertionSwaps: " + swap);
	System.out.println("InsertionComparisons: " + count);
	return a;
    }

   
}
    
