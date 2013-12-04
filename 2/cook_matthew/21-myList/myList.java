import java.io.*;
import java.util.*;

public class myList {
    private int[] data;
    private int numItems;
    
    public myList() {
	data = new int[5];
	numItems=0;
    }

    public void add(int d) {
	
	if (numItems>=data.length) {
	    System.out.println("Growing from "+data.length+" to "+data.length*1.5);
	    // "grow" the array by creating a new one and copying over
	    int[] tmpArray = new int[data.length+data.length/2];
	    for (int i=0;i<data.length;i++) 
		tmpArray[i]=data[i];
	    data = tmpArray;
	}
        data[numItems]=d;
        numItems = numItems + 1;
    }
    
    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }
    public void add(int pos, int d) {
	if (numItems<=data.length-1 ){
	    for (int q=data.length-1; q>pos; q--) {
		data[q] = data[q-1];
	    }
	    data[pos] = d;
	    numItems= numItems+1;
	}
	else if (pos<=data.length){
	    int[] end=new int[data.length+1];
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
    public int[] getData() {
	return data;
    }
    public int get(int pos) {
	return data[pos];
    }
    public void set(int pos, int d) {
	data[pos]= d;
    }
    public int size() {
	return numItems;
    }
}
