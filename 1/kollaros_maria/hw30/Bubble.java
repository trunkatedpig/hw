import java.util.*;
import java.io.*;
public class Bubble{
    private int len = 10000;
    private int[] buckets = new int[len];
    private double[] doubleBuckets = new double[len];
    private int comparisons;
    private int swap;
    private int assignment;
    public Bubble() {
	Random r = new Random();
	for (int i = 0; i < len; i ++){
	    buckets[i] = r.nextInt(9000) + 1000;
	}
	for (int i = 0; i < len; i ++){
	    doubleBuckets[i] = r.nextInt(9000) * 1.0 + 1000.0;
	}
	
    }
	
	
    public void sort(){
	ArrayList[] water = new ArrayList[10];
	for (int n = 0; n < 6; n++){
	    for (int i = 0; i < 10; i++)
		water[i] = new ArrayList();
	    for (int i = 0; i < buckets.length; i++){
		water[(buckets[i] / (int)Math.pow(10, n))% 10].add(buckets[i]);
	    }
	    int m = 0;
	    for (int z = 0; z < water.length; z++){
		if (water[z].size() != 0){
		    for (int i = 0; i < water[z].size(); i++){
			buckets[m] = (Integer)water[z].get(i);
			m = m + 1;
		    }
		}
	    }
	}
    }

    public void bubbleSort(){
	comparisons = 0;
	swap = 0;
	boolean done = false;
	for (int j = len; j > 1 && (!done); j --){
	    done = true;
	    for (int i = 0; i < (j - 1); i ++){
		comparisons ++;
		if (doubleBuckets[i] > doubleBuckets[i+1]){
		    double tmp = doubleBuckets[i];
		    doubleBuckets[i] = doubleBuckets[i+1];
		    doubleBuckets[i+1] = tmp;
		    done = false;
		    swap ++;
		}
	    }
	}
	assignment = swap * 3;
    }

    public void selectionSort(){
	comparisons = 0;
        swap = 0;
        int index = 0;
        double temp;
        for (int j = 0; j < (len); j++){
           double min = doubleBuckets[j];
	   for (int i = j + 1; i < (len); i++){
                comparisons++;
                if (doubleBuckets[i] < min){
                    min = doubleBuckets[i];
                    index = i;
                }
            }
	   if(min != doubleBuckets[j]){

	       swap++;
	       temp = doubleBuckets[j];
	       doubleBuckets[j] = min;
	       doubleBuckets[index] = temp;
	       //System.out.println(Arrays.toString(doubleBuckets));
	   }
	}
	assignment = swap * 3;
    }

    public void insertionSort(){
	comparisons = 0;
	swap = 0;
	assignment = 0;
	for(int i = 1; i < len; i++){
	    for(int j = 0; j < i; j++){
		comparisons ++;
		if(doubleBuckets[i] < doubleBuckets[j]){
		    double tmp = doubleBuckets[i];
		    for(int y = j; y < i; y++){
			doubleBuckets[y + 1] = doubleBuckets[y];
			assignment ++;
		    }
		    doubleBuckets[j] = tmp;
		    assignment = assignment + 2;
		}
	    }
	}
    }
		    
	    
	

    public int getSwap(){
	return swap;
    }

    public int getAssign(){
	return assignment;
    }

    public int getComparisons(){
	return comparisons;
    }


		
	
	
    
    public String toString(){
	return Arrays.toString(doubleBuckets);
    }

    public int[] get(){
	return buckets;
    }
}
		
		    

	
	
	    
