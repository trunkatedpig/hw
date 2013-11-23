import java.io.*;
import java.util.*;

public class myStringList {
    private String[] data;
    private int numItems;
    
    public myList() {
	data = new String[5];
	numItems=0;
    }

    public boolean isFull() {
	return numItems >= data.length;
    }

    public void grow(int d) {
        String[] tmpArray = new String[data.length+d];
        for (int i=0;i<data.length;i++)
            tmpArray[i]=data[i];
        data = tmpArray;
    }

    public void add(String d) {
        if (isFull()){
            grow(1);
        }
        data[numItems]=d;
        numItems = numItems + 1;
    }
    
    public String toString() {
        String s = Arrays.toString(data)+" : "+numItems;
        return s;
    }
    
    public void add(int pos, String d) {
        if (isFull()) {
            grow(1);
        }
        for (int i = numItems; i > pos; i--) {
            data[i] = data[i - 1]; 
        }
        data[pos] = d;
        numItems = numItems + 1;
    }

    public void remove(int pos) {
        for (int i = pos; i < numItems - 2; i++) {
            data[i] = data[i + 1];
        }
        data[numItems - 1] = 0; 
        numItems = numItems - 1;
    }
    public int size() {
        return numItems;
    }
    public String get(int pos) {
        return data[pos];
    }
    public void set(int pos, String d) {
        if (pos > numItems) {
            grow(1);
            pos = numItems + 1;
        }
        data[pos] = d;
    }
    public String find(String n) {
	for (int i = 0; i < numItems; i++){
	    if (data[i].equals(n)) {
		return n;
	    }
	}

	return "";
    }

    public void fremove(String n) {
	int removepos = -1;
	for (int i = 0; i<numItems; i++) {
	    if (data[i].equals(n)) {
		removepos = i;
		i = numItems;
	    }
	}
	remove(i);
    }
}
