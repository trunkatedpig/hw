import java.io.*;
import java.util.*;

public class myStringList {

    private String[] data;
    private int numItems;
    
    public myStringList() {
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

    public void insert(int pos, String d) {
	if (!isFull()) {
	    for (int i=numItems ; i>pos; i--) {
		data[i] = data[i-1];
	    }
	    data[pos] = d;
	}
	else {
	    String[] temp = new String[data.length + 1];

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

    public String get(int pos) {
	return data[pos];
    }

    public void set(int pos, String d) {
	data[pos] = d;
    }

    public String find(String n) {
	for (int i=0; i<numItems; i++) {
	    if (data[i] == n)
		return data[i];
	}
	return "-1";
    }

    public boolean in(String n) {
	for (int i=0; i<numItems; i++) {
	    if (data[i] == n)
		return true;
	}
	return false;
    }

    public void fremove(String n) {
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
