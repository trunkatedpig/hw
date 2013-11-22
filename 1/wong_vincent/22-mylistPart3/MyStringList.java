import java.util.*;
import java.io.*;

public class MyStringList {
    private String[] data;
    private int numItems;

    public MyStringList() {
	data = new String[5];
	numItems=0;
    }

    public boolean isFull() {
	return numItems >= data.length;
    }

    public void grow() {
	// "grow" the array by creating a new one and copying over
	String[] tmpArray = new String[data.length+data.length/2];
	for (int i=0;i<data.length;i++)
	    tmpArray[i]=data[i];
	data = tmpArray;
    }

    public void add(String d) {
	if (isFull()) {
	    grow();
	}
	data[numItems]=d;
	numItems = numItems + 1;
    }

    public String toString() {
	String s = Arrays.toString(data)+ " : " +numItems;
	return s;
    }

    public void add(int pos, String d) {
	if (isFull()) {
	    grow();
	    for (int i = data.length-1; i>pos; i--) {
		data[i]=data[i-1];
	    }
	    data[pos]=d;
	}
	else {
	    for (int i = data.length-1; i>pos; i--) {
		data[i]=data[i-1];
	    }
	    data[pos] = d;
	}
	numItems = numItems + 1;
    }

    public void remove(int pos) {
	String[] temp = new String[data.length-1];

	for(int i = 0; i < temp.length; i++) {
	    if (i<pos) {
		temp[i] = data[i];
	    }
	    else {
		temp[i] = data[i+1];
	    }
	}
	data = temp;
	numItems = numItems - 1;
    }

    public String find(String d) {
	for(int i = 0; i < numItems; i++) {
	    if (data[i] == d) {
		return d;
	    }
	}
	return "it doesn't appear in the string";
    }

    public int fremove(String d) {
	for(int i = 0; i < numItems; i++) {
	    if(data[i] == d) {
		remove(i);
		return -1;
	    }
	}
	return 1;
    }

    public int size() {
	return numItems;
    }

    public String get(int pos) {
	return data[pos];
    }

    public int set(int pos, String d) {
	data[pos] = d;
	return 0;
    }
}



