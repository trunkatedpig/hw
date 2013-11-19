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
	if (numItems < data.length) {
	    for ( ; pos<data.length; pos++) {
		data[pos+1] = data[pos];
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
	while (pos > data.length-1) {
	    grow();
	}
	for ( ; pos<data.length-1; pos++) {
	    data[pos] = data[pos+1];
	}
	numItems = numItems - 1;
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
	
}
