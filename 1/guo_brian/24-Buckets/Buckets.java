import java.io.*;
import java.util.*;

public class Buckets { 
    
    private ArrayList[] buckets = new ArrayList[10];
    private int[]Test = new int[1000000];
    
    public Buckets() {
	for (int i = 0; i < 10; i++) 
	    buckets[i] = new ArrayList();
	for (int i = 0; i < 1000000; i++)
	    Test[i] = (int) (Math.random() * Math.pow(10,20));
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
}

	    
		  
    
