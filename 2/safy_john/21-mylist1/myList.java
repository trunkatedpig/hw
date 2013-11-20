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

    public void add(int d) {
	int[] tempArray = new int[data.length + d];
	if (numItems <= data.length) {
	    int total = data.length + d;
	    System.out.println("Growing from "+data.length+" to "+total);
	    for (int i = 0; i < data.length; i++) {
		tempArray[i] = data[i];
	    }	    
	}
	data = tempArray;
    }

    public void insert(int pos, int d) {
	int[] tempArray = new int[data.length + 1];
	int i = 0;
	while (i < pos) {
	    tempArray[i] = data[i];
	    i = i + 1;
	}
	tempArray[pos] = d;
	for (int j = pos + 1; j < data.length; j++) {
	    tempArray[j-pos] = data[j];
	}
	data = tempArray;
	numItems = numItems + 1;
    }
    
}
