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
    public void add(int pos, String d) {
	if (numItems<=data.length-1 ){
	    for (int q=data.length-1; q>pos; q--) {
		data[q] = data[q-1];
	    }
	    data[pos] = d;
	    numItems= numItems+1;
	}
	else if (pos<=data.length){
	    String[] end=new String[data.length+1];
	    int o = pos;
	    for (int q=0; q<pos; q++) { 
		end[q]=data[q];
	    }
	    end[o]=d;
	    for (int r=o;r<data.length;r++) {
		end[r+1]=data[r];
	    }
	    data=end;
	    numItems=numItems+1;
	}
    }
    /* public void remove(int pos) {
	int store=data[pos+1];
	for (int q=pos+1; q<data.length-1; q++) {
	    data[q-1]=store;
	    store=data[q+1];
	}
	numItems=numItems-1;
	}*/
    public void remove(int pos) {
	String store=data[pos+1];
	for (int q=pos+1; q<data.length-1; q++) {
	    data[q-1]=store;
	    store=data[q+1];
	}
	numItems=numItems-1;
    }
    public String[] getData() {
	return data;
    }
    public String get(int pos) {
	return data[pos];
    }
    public void set(int pos, String d) {
	data[pos]= d;
    }
    public int size() {
	return numItems;
    }
    public String find(String n) {
	for (int q=0; q<numItems; q++){
	    if (data[q].equals(n)) {
		return n;
	    }
	   
	}
	return "not here";
    }
    public void fremove(String n) {
	for (int q=0;q<numItems;q++) {
	    if (data[q].equals(n)) {
		remove(q);
		break;
	    }
	}
    }
}

