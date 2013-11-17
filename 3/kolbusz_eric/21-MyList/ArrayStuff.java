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
    
    public void insert(int pos, int d) {
	// inserts data item d at location pos in the data array
	// remember we have to shift down items to make room and
	// we might have to grow the array
	int[] tempArray;
	if (pos > a.length+1) {
	    tempArray = new int[pos+1];
	    for (int i=0; i<a.length; i++) {
		tempArray[i] = a[i];}
	    tempArray[pos] = d;
	}	    
	else {
	    tempArray = new int[a.length+1];
	    for (int i=0; i<pos; i++) {
		tempArray[i] = a[i];}
	    tempArray[pos] = d;
	    for (int i=pos; i<a.length; i++) {
		tempArray[i+1] = a[i];}
	}
	
	a = tempArray;
    }
        
    public int remove(int pos) {
	// removes the data item at location pos from the array data
	// remember we have to shift down items.
	// return the removed data item
	int[] tempArray = new int[a.length-1];
	for (int i=0; i<pos; i++) {
	    tempArray[i] = a[i];}
	for (int i=pos+1; i<a.length; i++) {
	    tempArray[i-1] = a[i];}
	int removed = a[pos];
	a = tempArray;
	return removed;
    }
}
