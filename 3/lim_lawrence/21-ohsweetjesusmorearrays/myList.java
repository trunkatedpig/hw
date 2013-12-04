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
	    System.out.println("Growing from " + data.length + 
			       " to " + data.length*3/2);
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

    public void insert(int pos, int d) {
	add(data[numItems-1]);
	for(int i=numItems-1; i>pos; i--)
	    data[i]=data[i-1];
	data[pos]=d;
    }
	
    public void remove(int pos) {
	for(int i=pos;i<numItems;i++)
	    data[i]=data[i+1];
	numItems--;
    }
}
