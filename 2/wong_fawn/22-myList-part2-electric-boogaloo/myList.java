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

    public void grow(int d) {
        int[] tmpArray = new int[data.length+d];
        for (int i=0;i<data.length;i++)
            tmpArray[i]=data[i];
        data = tmpArray;
    }

    public void add(int d) {
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
    
    public void add(int pos, int d) {
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
    public int get(int pos) {
        return data[pos];
    }
    public void set(int pos, int d) {
        if (pos > numItems) {
            grow(1);
            pos = numItems + 1;
        }
        data[pos] = d;
    }
    public int find(int n) {
	for (int i = 0; i < numItems; i++){
	    if (data[i] == n) {
		return n;
	    }
	}

	return 0;
    }

    public void fremove(int n) {
	int removepos = -1;
	for (int i = 0; i<numItems; i++) {
	    if (data[i] == n) {
		removepos = i;
		i = numItems;
	    }
	}
	remove(i);
    }
}
