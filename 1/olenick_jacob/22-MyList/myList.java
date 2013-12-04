import java.io.*;
import java.util.*;

public class myList {

    private int[] data;    
    private int numItems;
    
    public myList() {
	data=new int[5];
	numItems=0;
    }

    public String toString() {
	String s = Arrays.toString(data) + " : " + numItems;
	return s;
    }
   
    public boolean isFull() {
	return numItems>= data.length;
    }

    public void grow() {
	int[] tmpArray = new int [data.length + data.length/2];
	for (int i = 0; i < data.length; i ++) {
	    tmpArray[i] = data[i];
	}
	data = tmpArray;
    }
    
    public void add(int d) {
	if (isFull()) {
	    grow();
	}
	data[numItems] = d;
	numItems = numItems + 1;
    }

    public void add(int pos, int d) {
	if (isFull()) {
	    grow();
	}
	for (int i = numItems; i > pos; i --) {
	    data[i] = data[i - 1];
	}
	data[pos] = d;
	numItems = numItems + 1;
    }

    public void remove(int pos){
	int i=0;
	for (i = pos; i<numItems-1; i++){
	    data [i] = data[i+1];
	}
	data[i] = 0;
	numItems--;
    }

    public int size () {
	return numItems;
    }

    public int get(int pos) {
	return data[pos];
    }

    public void set(int pos, int d) {
	data[pos] = d;
    }

    public int find(int d){
	for (int i=0; i<numItems; i++){
	    if (data[i] == d)
		return data[i];
	}
	return 0;
    }

    public void fremove(int d){
	for (int i=0; i<numItems; i++){
	    if (data[i] == d){
		remove(i);
		i = numItems+1;
	    }
	}
    }	   
}
