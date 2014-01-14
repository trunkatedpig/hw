import java.util.*;
import java.io.*;
public class Bucket{
    private int len = 1000;
    private int[] buckets = new int[len];
    private double[] doubleBuckets;
    private int comparisons;
    private int swap;
    public Bucket() {
	Random r = new Random();
	for (int i = 0; i < len; i ++){
	    buckets[i] = r.nextInt(90) + 10;
	}
    }

    public Bucket(int len){
	Random r = new Random();
	doubleBuckets = new double[len];
	for (int i = 0; i < len; i ++){
	    doubleBuckets[i] = r.nextInt(90)*1.0 + 10.0;
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
	boolean swapBoolean = true;
	for (int j = len - 1; j > 1 ; j--){
	     for (int i = 0; i < j; i ++){
		 comparisons ++;
		 if (doubleBuckets[i] > doubleBuckets[i+1]){
		     swapBoolean = false;
		     double tmp = doubleBuckets[i];
		     doubleBuckets[i] = doubleBuckets[i+1];
		     doubleBuckets[i+1] = tmp;
		     swap ++;
		 }
	     }
	     if (swapBoolean){
		 break;
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
	return Arrays.toString(buckets);
    }

    public int[] getBuckets(){
	return buckets;
    }
    public double[] getDoubleBuckets(){
	return doubleBuckets;
    }
}
		
		    

	
	
	    
