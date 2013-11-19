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
	
	public void insert(int pos, int d) {
		if (isFull())
			grow();
		int i = data.length-1;
		for (;i>pos;i--)
			data[i] = data[i-1];
		data[pos] = d;
		numItems++;
	}
		

}
