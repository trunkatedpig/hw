import java.io.*;
import java.util.*;

public class Bubble{
    private ArrayList[] buckets = new ArrayList[10];
    private int[] rand4DigitNums = new int[15];
    private int n;

    public Bubble() {
	n=0;
	for (int i = 0; i < 10; i++){
            buckets[i] = new ArrayList();
        }
        Random r = new Random();
        for (int j = 0; j<rand4DigitNums.length; j++){
            rand4DigitNums[j] = r.nextInt(10000);
        }
    }
    
    public ArrayList[] sort(){

	for (int i = 0; i < 10; i++){
            buckets[i] = new ArrayList();
        }
	for (int i = 0; i < rand4DigitNums.length; i++){
	    int exp = (int)(Math.pow(10,n));
	    int place=((rand4DigitNums[i]/exp)% 10);
	    buckets[place].add(rand4DigitNums[i]);
	}
     	return buckets;
    }

    public double[] bubbleSort(double[] soTemp){
	double tmp = 0;
	int swap = 0;
	int comparisons = 0;	
	for (int i = 0; i < soTemp.length-1; i++){
	    for (int j = 0; j < soTemp.length-1; i++){
		if (soTemp[j] > soTemp[j+1]){
		    tmp = soTemp[j];
		    soTemp[j] = soTemp[j+1];
		    soTemp[j+1] = tmp;
		    swap = swap + 1;
		}
		comparisons = comparisons + 1;
	    }
	}
	return soTemp;
	//	System.out.println("Swaps: " + swap);
	//System.out.println("Comparisons: " + comparisons);
    }
    
    public String toString(double[]a){
	return Arrays.toString(a);
    }
	
	public double[] selectionSort(double[]a){
	    double min=0;
	    int n = 0;
	    double[]b=new double[a.length];
	    for (int j=0; j=a.length-1; j++){
		for (int i=0; i<a.length-1; i++){
		    if (a[i+1]<a[i])
			min=a[i+1];
		}
		b[n] = min;
		n =  n + 1;

	    }
	}

    public double[] insertionSort(double[]a){
	for (int j==0; j=a.length-1; j++){
	    for (int i = j; i<a.length-1; i++){
		    
	    }
	}
    }
}

