import java.io.*;
import java.util.*;

public class MyList {
    
    private int[] data;
    private int numItems;
    
    public MyList() {
	data = new int[5];
	numItems=0;
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
    
    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }
	
    public void add(int pos, int d) {
	if (isFull()) {
	    grow();
	}
	if (pos == numItems) {
	    add(d);
	}
	else if (pos < numItems) {
	    for (int i = numItems - 1; i >= pos; i --) {
		data[i + 1] = data[i];
	    }
	    data[pos] = d;
	    numItems = numItems + 1;
	}
	else if (pos > numItems) {
	    for (int j = numItems; j < pos; j ++) {
		add(0);
		//adds 0s to the array until it hits pos
	    }
	    add(d);
	}
    }

    public void remove(int pos) {
	if (pos < numItems) {
	    for (int i = pos; i < numItems; i ++) {
		data[i-1] = data[i];
	    }
	    data[numItems - 1] = 0;
	    numItems = numItems - 1;
	}
    }

    public int find (int d) {
        for (int i = 0; i < numItems; i++) {
            if (data[i] == d){
            return d;
            }
        }
        return data[numItems];
    }

    public void fremove (int d) {
	int pos = -1;
        if (find(d) == d) {
	    for (int i = 0; i < numItems; i ++) {
		if (data[i] == d) {
		    pos = i;
		}
	    }
	    remove(pos);
	}		    
    }
    
    public int size() {
	return numItems;
    }
    
    public int get(int pos) {
	return data[pos];
    }

    public void set(int pos, int d) {
	if (pos < numItems)
	    data[pos] = d;
    }
}
