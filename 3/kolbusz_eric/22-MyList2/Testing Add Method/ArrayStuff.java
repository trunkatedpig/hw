import java.io.*;
import java.util.*;

public class ArrayStuff {
    private int[] a;
    private Random r;
    private int numItems;
    
    public ArrayStuff() {
	r = new Random();
	a = new int[20];
	numItems=20;
	for (int i=0;i<a.length;i++)
	    a[i]=r.nextInt(100);
    }
    public ArrayStuff(int s) {
	r = new Random();
	a = new int[s];
	numItems=s;
	for (int i=0;i<a.length;i++)
	    a[i]=r.nextInt(100);
    }
    public ArrayStuff(int s, int max) {
	r = new Random();
	a = new int[s];
	numItems=s;
	for (int i=0;i<a.length;i++)
	    a[i]=r.nextInt(max);
    }

    public String toString() {
	return Arrays.toString(a);
    }

    public int get(int n) {
	return a[n];
    }
    public void grow() {
	// "grow" the array by creating a new one and copying over
	int[] tmpArray = new int[a.length+a.length/2];
	for (int i=0;i<a.length;i++) 
	    tmpArray[i]=a[i];
	a = tmpArray;
    }
    public void add(int pos, int d) {
	// to be completed by you
	// inserts the value d at location (index) pos)
	// recall the algorithm we developed in calss:
	// 1. Grow if needed
	// 2. shift everything past the insertion point down
	// 3. add the new item
	// 4. numitems++
	int[] tempArray;
	if (pos > a.length+1) {
	    tempArray = new int[pos+1];
	    for (int i=0; i<a.length; i++) {
		tempArray[i] = a[i];}
	    tempArray[pos] = d;
	    a = tempArray;
	}	    
	else {
	    grow();
	    for (int i=numItems-1; i>=pos; i--) {
		a[i+1] = a[i];}
	    a[pos] = d;
	}
	numItems++;
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
	numItems--;
	return removed;
    }
}
