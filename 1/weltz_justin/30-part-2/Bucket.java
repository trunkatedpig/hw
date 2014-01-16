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

    public Bucket(int length){
	Random r = new Random();
		len = length;
	doubleBuckets = new double[length];
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
	boolean swapBoolean = false;
	for (int j = len - 1; j > 1 && !swapBoolean ; j--){
	    swapBoolean = true;
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
	}
    }

public void selection(){
	comparisons = 0;
	swap = 0;
	int index = 0;
	double temp;
	for (int j = 0; j < len; j++){
	   double min = doubleBuckets[j];
	    for (int i = j; i < len; i++){
			comparisons++;
			if (doubleBuckets[i] < min){
		    min = doubleBuckets[i];
		    index = i;
			}
	    }
	    //System.out.println(Arrays.toString(doubleBuckets));
	    swap++;
	    temp = doubleBuckets[j];
	    doubleBuckets[j] = min;
	    doubleBuckets[index] = temp;
	}
}
    public void insertion(){
	comparisons = 0;
	swap = 0;
	//double temp;
	//double temp2;
	for(int j = 1; j < len; j++){
	    boolean swapBoolean = true;
	    for (int i = 0; i < j; i++){
		comparisons++;
		if (doubleBuckets[j] < doubleBuckets[i]){
		    swapBoolean = false;
		    double temp;
		    swap++;
		    temp = doubleBuckets[i];
		    doubleBuckets[i] = doubleBuckets[j];
		    //System.out.println(Arrays.toString(doubleBuckets));
		    for(int m = i + 1; m <= j; m++){
			double temp2;
			temp2 = doubleBuckets[m];
			doubleBuckets[m] = temp;
			temp = temp2;
		    }
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
	return Arrays.toString(buckets);
    }

    public int[] getBuckets(){
	return buckets;
    }
    public double[] getDoubleBuckets(){
	return doubleBuckets;
    }
}
		
		    

	
	
	    
