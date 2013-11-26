import java.util.*;
import java.io.*;

public class myList {
    private int[] data;
    private int numItems;

    public myList() {
	data = new int[5];
	Random r = new Random();
	for (int i = 0; i < data.length; i++) {
	    data[i] = r.nextInt();
	}
	numItems = 5;
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

    public void add(int pos, int d) {
	if (numItems < data.length && pos > numItems) {
	    data[pos] = d;
	}
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

    public void remove(int pos) {
	for (int i = pos; i < data.length-1; i++) {
	    data[i] = data[i+1];
	}
	numItems = numItems - 1;
	data[numItems] = 0;
    }
	
    
}
