import java.io.*;
import java.util.*;

public class ArrayStuff {
    private int[] a;
    private Random r;
    
    public ArrayStuff() {
	r = new Random();
	a = new int[20];
	for (int i=0;i<a.length;i++)
	    a[i]=r.nextInt(100);
    }
    public ArrayStuff(int s) {
	r = new Random();
	a = new int[s];
	for (int i=0;i<a.length;i++)
	    a[i]=r.nextInt(100);
    }
    public ArrayStuff(int s, int max) {
	r = new Random();
	a = new int[s];
	for (int i=0;i<a.length;i++)
	    a[i]=r.nextInt(max);
    }

    public String toString() {
	return Arrays.toString(a);
    }

    public int get(int n) {
	return a[n];
    }
    
    public int findMaxIndex() {
	int maxi = 0;
	for (int i=0;i<a.length;i++) {
	    if (a[i]>a[maxi])
		maxi=i;
	}
	return maxi;

    }
    public int find(int n) {
	for (int i=0;i<a.length;i++) {
	    if (a[i]==n)
		return i;
	}
	return -1;
    }

    public int freq(int n) {
	int count = 0;
	for (int i=0;i<a.length;i++) {
	    if (a[i]==n) {
		count=count+1;
	    }
	}
	return count;
    }

    public void mode2() {

	int maxValue = a[ findMaxIndex() ];
	
	int[] buckets = new int[maxValue+1];

	// find the tallies
	for (int i=0;i<a.length;i++) {
	    buckets[ a[i] ] = buckets[ a[i] ] + 1;
	}

	int mode = 0;
	for (int i=0;i<buckets.length;i++) {
	    if  (buckets[i]>mode) {
		mode = buckets[i];
	    }
	}
       
	System.out.println("Mode: "+mode);
	System.out.print("values: ");
	for (int i=0;i<buckets.length;i++) {
	    if (buckets[i]==mode) {
		System.out.print(i+", ");
	    }
	}
	System.out.println();
    }
	

    public void mode() {
	int maxFreq = 0;
	int maxIndex = 0;
	for (int i=0;i<a.length;i++) {
	    int f = freq(a[i]);
	    if (f > maxFreq) {
		maxFreq=f;
		maxIndex=i;
	    }
	}
	System.out.println("Mode: "+a[maxIndex]+" count: "+maxFreq);
    }

    public void insert(int pos, int d){
        int[] temp = new int[a.length+1];
        int posCounter = 0;
        for (int i=0;i<a.length;i++){
            if (i==pos){
                temp[posCounter] = d;
                posCounter = posCounter + 1;
            }
            temp[posCounter] = a[i];
            posCounter = posCounter + 1; 
        }
        a = temp;        
    }

    public int remove(int pos){
        int[] temp = new int[a.length-1];
        int posCounter = 0;
        int removedNum = 0;
        for (int i=0;i<a.length;i++){
            if (i != pos){
                temp[posCounter] = a[i];
                posCounter = posCounter+1;
            }else{
                removedNum = a[i];
            }
        }
        a = temp;
        return removedNum;
    }
}
