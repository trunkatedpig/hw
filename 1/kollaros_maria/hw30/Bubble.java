import java.util.*;
import java.io.*;
public class Bubble{
    private int len = 10000;
    private int[] buckets = new int[len];
    private double[] doubleBuckets = new double[len];
    private int comparisons;
    private int swap;
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
	for (int j = 0; j < len; j ++){

	    for (int i = 0; i < (len - 1); i ++){
		comparisons ++;
		if (doubleBuckets[i] > doubleBuckets[i+1]){
		    double tmp = doubleBuckets[i];
		    doubleBuckets[i] = doubleBuckets[i+1];
		    doubleBuckets[i+1] = tmp;
		    swap ++;
		}
	    }
	}
    }

    public int getSwap(){
	return swap;
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
		
		    

	
	
	    
