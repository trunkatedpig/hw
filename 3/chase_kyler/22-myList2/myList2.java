import java.util.*;
import java.io.*;

public class myList {
	private int[] data;
	private int numItems;
    
    	public myList() {
		data = new int[5];
		numItems=0;
    	}

    	public boolean isFull() {
		return numItems >= data.length;
    	}

    	public void grow() {
	    	int[] tmpArray = new int[data.length+data.length/2];
	    	for (int i=0;i<data.length;i++) 
			tmpArray[i]=data[i];
	    	data = tmpArray;
	}

	public void add(int d) {
		if (isFull()) {
	    		grow();
		}
       		data[numItems]=d;
        	numItems = numItems + 1;
    	}
    
    	public String toString() {
		String s = Arrays.toString(data)+" : "+numItems;
		return s;
    	}

	public void add(int pos, int d) {
		while (isFull() || pos>data.length)
			grow();
		int i = data.length-1;
		for (;i>pos;i--)
			data[i] = data[i-1];
		data[pos] = d;
		numItems++;
	}

	public int size() {
		return numItems;
	}

	public int get(int pos) {
		return data[pos];
	}

	public int set(int pos, int d){
		if (pos <= numItems)
			data[pos] = d;
	}





		

}












