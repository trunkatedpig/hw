import java.io.*;
import java.util.*;

public class myList {

    private int[] data;
    private int numItems;
    
    public myList() {
	data = new int[5];
	numItems=0;
    }

    public boolean isFull() {
	return numItems >= data.length;
    }

    public void grow() {
	    // "grow" the array by creating a new one and copying over
	    int[] tmpArray = new int[data.length+data.length/2];
	    for (int i=0;i<data.length;i++) 
		tmpArray[i]=data[i];
	    data = tmpArray;
    }

    public void add(int d) {
	if (isFull()){
	    grow();
	}
        data[numItems]=d;
        numItems = numItems + 1;
    }
    
    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }

    public void insert(int pos, int d) {
	if (data.length > numItems) {
	    for (int i=numItems ; i>pos; i--) {
		data[i] = data[i-1];
	    }
	    data[pos] = d;
	}
	else {
	    int[] temp = new int[data.length + 1];

	    for (int i=0; i<pos; i++) {
		temp[i] = data[i];
	    }

	    temp[pos] = d;

	    for ( ;pos<data.length; pos++) {
		temp[pos+1] = data[pos];
	    }

	    data = temp;
	}
	numItems = numItems + 1;
    }

    public void remove(int pos) {
	if (pos > numItems) {
	    System.out.println("Index out of range.");
	}
	else {
	    for ( ; pos<numItems-1; pos++) {
		data[pos] = data[pos+1];
	    }
	    numItems = numItems - 1;
	}
    }

    public int size() {
	return numItems;
    }

    public int get(int pos) {
	return data[pos];
    }

    public void set(int pos, int d) {
	data[pos] = d;
    }

    public int find(int n) {
	for (int i=0; i<numItems; i++) {
	    if (data[i] == n)
		return data[i];
	}
	return -1;
    }

    public boolean in(int n) {
	for (int i=0; i<numItems; i++) {
	    if (data[i] == n)
		return true;
	}
	return false;
    }

    public void fremove(int n) {
	if (in(n)) {
	    int firstIndex=0;
	    while (data[firstIndex]!=n) {
		firstIndex = firstIndex +1;
	    }
	    remove(firstIndex);
	}
	else
	    System.out.println("Sorry, that is not in the list.");
    }
	
}
