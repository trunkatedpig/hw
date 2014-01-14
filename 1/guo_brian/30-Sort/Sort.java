import java.io.*;
import java.util.*;

public class Buckets { 
    
    private ArrayList[] buckets = new ArrayList[10];
    private double[]Test;
    private int[]Test2;
    
    public Buckets() {
	for (int i = 0; i < 10; i++) 
	    buckets[i] = new ArrayList();
	for (int i = 0; i < 10; i++)
	    Test[i] = (Math.random() * 10);
    }
    
    public void sort() {
	int n = 0;
	for (int x = 0; x < Test.length; x++) {
	    if (Test[x] > n)
		n = Test[x];
	}
	int exponent = 0;
	while (n >= 10) {
	    n = (int) n / 10;
	    exponent = exponent + 1;
	}
	int m = 0;
	while (m < exponent) {
	    for (int i = 0; i < Test.length; i++) {
		int placeholder = (int) ((Test[i]/Math.pow(10,m)) % 10);
		buckets[placeholder].add(Test[i]); 
	    }
	    int[] tempArray = new int[Test.length];
	    int x = 0;
	    for (int j = 0; j< buckets.length; j++){
		for(int k = 0; k < buckets[j].size(); k++) {
		    tempArray[x] = (Integer)buckets[j].get(k);
		    x = x + 1;
		    }
	    }
	    Test = tempArray;
	    for (int i = 0; i < 10; i++) 
		buckets[i] = new ArrayList();
	    m = m + 1;
	}
    }

    public int[] getTest() {
	return Test;
    }

    public String toString() {
	return Arrays.toString(Test);
    }

    public double[] bubblesort() {
	int comparisons = 0;
	int swaps = 0;
	for (int n = 0; n<Test.length; n++ ) {
	    for (int x = 0; x < Test.length -1 ; n++ ) {
		comparisons = comparisons + 1;
		if (Test[n] > Test[n+1]) {
		    swaps = swaps + 1;
		    double temp = Test[n];
		    Test[n] = Test[n+1];
		    Test[n+1] = temp;
		}
	    }
	}
	return Test[];
	System.out.println(comparisons);
	System.out.println(swaps);
    }		
}

	    
		  
    
