import java.io.*;
import java.util.*;

public class myListString {
    private String[] data;
    private int numItems;
    
    public myListString() {
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
    
    public void add(int pos, String d) {
	if (numItems<data.length){
	    for(int i = numItems-1; i > pos-1; i--) {
		data[i+1] = data[i];
	    }
	    data[pos] = d;
	    numItems = numItems + 1;    
	}
	else{
	    String[] a = data;
	    grow();
	    for (int i=pos;i<data.length;i++){
		if (i == pos){
		    data[i] = d;}
		else
		    data[i]= a[i-1];
	    }
	}
    }

    public void remove(int pos) {
	for (int i=pos; i<numItems-1; i++) {
            data[i] = data[i + 1];
        }
        numItems--;    }
    public int size() {
	return numItems;
    }
    public String get(int pos) {
	return data[pos];
    }
    public int set(int pos, String d) {
	data[pos]=d;
    }
}