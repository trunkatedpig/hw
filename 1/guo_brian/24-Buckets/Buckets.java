import java.io.*;
import java.util.*;

public class Buckets { 
    
    private ArrayList[] buckets = new ArrayList[10];
    private int[]Test = new int[10];
    
    public Buckets() {
	for (int i = 0; i < 10; i++) 
	    buckets[i] = new ArrayList();
	for (int i =0; i < 10; i++)
	    Test[i] = (int) Math.random() * 10000;
    }
    
    public void sort() {
	int n = 0;
	while (n < 4) {
	    for (int i = 0; i < Test.length; i++) {
		int placeholder = (int) (Test[i]% Math.pow(10,n));
		buckets[placeholder].add(Test[i]); 
	    }
	    int[] tempArray = new int[Test.length];
	    int x = 0;
	    for (int j = 0; j< buckets.length; j++){
		System.out.println(buckets[j].size());
		/*for(int k = 0; k < buckets[j].size(); k++) {
		    tempArray[x] = (Integer)buckets[j].get(k);
		    x = x + 1;
		    }*/
	    }
	    Test = tempArray;
	}
    }

    public String toString() {
	return Arrays.toString(Test);
    }
}

	    
		  
    