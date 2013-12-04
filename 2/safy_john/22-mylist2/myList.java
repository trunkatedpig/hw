import java.util.*;
import java.io.*;

public class myList {
    private int[] data;
    private int numItems;

    public myList() {
	data = new int[5];
	numItems = 0;
    }

    public String toString() {
        String s = Arrays.toString(data)+" : "+numItems;
        return s;
    }

    public boolean isFull() {
	return numItems >= data.length;
    }

    public void grow() {
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

    public void add(int pos, int d) {
        if (data[data.length] == 0) {
	    data[pos] = d;
	int tempArray[] = new int[data.length + 1];
	for (int i = 0; i < pos; i++) {
	    tempArray[i] = data[i];
	}
	tempArray[pos] = d;
	for (int j = pos; j < data.length; j++) {
	    tempArray[j+1] = data[j];
	}
	data = tempArray;
	numItems = numItems + 1;
	}}

    public void remove(int pos) {
	for (int i = pos; i < data.length-1; i++) {
	    data[i] = data[i+1];
	}
	numItems = numItems - 1;
	data[numItems] = 0;
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
    
    public int find{int d) {
	for (int i = 0;i < data.length;i++) {
	    if (data[i] == d) {
		return d;
	    }
	}
	return 0;
    }

    public void fremove(int d) {
	for (int i = 0;i < data.length;i++) {
	    if (data[i] == n) {
		remove(i); 
	    }
	}
    }
}
