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

    public void add(String str) {
	if (isFull()){
	    grow();
	}
        data[numItems]=str;
        numItems = numItems + 1;
    }
    
    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }
	
    public void add(int pos, String str) {
	if (isFull() || pos > data.length-1){
	    grow();
	}
	for (int i=numItems; i>pos; i--) {
	    data[i] = data[i-1];
	}
	data[pos] = str;
	numItems++;
    }

    public void remove(int pos) {
	for (int i=pos; i < numItems-1; i++) {
	    data[i] = data[i+1];
	}
	numItems--;
    }
    public int size() {
	return numItems;
    }
    public String get(int pos) {
	return data[pos];
    }
    public void set(int pos, String str) {
	if (pos > numItems-1) {
	    data[numItems-1] = str;
	}
	else {
	    data[pos] = str;
	}
    }
    public String find(String str) {
	for (int i=0; i<numItems; i++) {
	    if (data[i] == str) {
		    return data[i];
		}
	}
	return "";
    }
    public void fremove(String str) {
	for (int i=0; i<numItems; i++) {
	    if (data[i] == str) {
		    remove(i);
		    break;
		}
	}
    }
}
