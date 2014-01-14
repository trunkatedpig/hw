import java.io.*;
import java.util.*;

public class Sorts {

    Random r = new Random();
    protected int numDigits = 3;
    protected int numInts = 1000;
    protected int[] array1 = new int[10];
    protected ArrayList[] buckets = new ArrayList[10];

    public void Radix() {
      for (int i=0; i<10; i++) {
          buckets[i] = new ArrayList();
	  }
	  for (int i=0; i<10; i++) {
	      array1[i] = (int)r.nextInt(9000) + 1000;
	      }
    }

    public void Radix(int digits,int nums){
	buckets = new ArrayList[nums];
	array1 = new int[nums];
	numDigits = digits;
	numInts = nums;
	for (int i=0; i<nums; i++) {
	    buckets[i] = new ArrayList();
	}
	for (int i=0; i<nums; i++) {
	    array1[i] = (int)(r.nextInt(9000) + 1000);
	}
    }

    public String toString(int[] a) {
	return Arrays.toString(a);
    }

    public void setArray(int[] a) {
	array1 = a;
	numInts = array1.length;
    }

    public void radixSort() {
	for (int place=0; place<numDigits; place++) {
	    for (int i=0; i<numInts; i++) {
		buckets[(int)(array1[i]/(Math.pow(10,place))%10)]
		    .add(array1[i]);
	    }
	    int arrayIndex = 0;
	    for (int j=0; j<numInts; j++) {
		for (int i=0; i<buckets[j].size(); i++) {
		    array1[arrayIndex] = (Integer) buckets[j].get(i);
		    arrayIndex++;
		}
	    }
	    for (int i=0; i<10; i++) {
		buckets[i].clear();
	    }
	}

    }

    public void bSort(int digits,int nums){
	buckets = new ArrayList[nums];
	array1 = new int[nums];
	numDigits = digits;
	numInts = nums;
	for (int i=0; i<nums; i++) {
	    buckets[i] = new ArrayList();
	}
	for (int i=0; i<nums; i++) {
	    array1[i] = (int)(r.nextInt(9000) + 1000);
	}
    }
    
    public void bSort(int[] array) {
	int c = 0;
	int s = 0;
	for (int i=0; i<array.length-1; i++) {
	    for (int j=0; j<array.length-1; j++) {
		c++;
		if (array[j] > array[j+1]) {
		    int n = array[j];
		    array[j] = array[j+1];
		    array[j+1] = n;
		    s++;
		}
	    }
	}
	System.out.println("Swaps: " + s);
	System.out.println("Counts: " + c);
    }
    
}
