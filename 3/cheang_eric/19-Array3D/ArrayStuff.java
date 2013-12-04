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
    
    public double mean(){
	
	double sumSoFar = 0.0;
        for (int IndexCounter = 0;
	     IndexCounter < a.length;
	     IndexCounter++){
	    
	    sumSoFar = sumSoFar + a[IndexCounter];
	    
	}
	
	int divideMe = a.length - 1;
	return sumSoFar / divideMe;
	
    }
    
    public double stddev(){
	
	int[] squaredArray;
	squaredArray = new int[a.length];
	

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

    public void remove(int pos){
	int[] array = new int[a.length-1];
	for (int i = 0; i<pos; i++)
	    array[i] = a[i];
	for (int n=pos; i<a.length; i++)
	    array[i-1] = a[i];
	a = array;
    }

    public int find(int n) {
	for (int i=0;i<a.length;i++) {
	    if (a[i]==n)
		return i;
	}
	return -1;
    }
}
