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
	
	public void insert (int pos, int d) {
	// inserts data item d at location pos in the data array
	// remember we have to shift down items to make room and
	// we might have to grow the array
	int [] tempArray = new int[data.length + 1];
	int j = 0;
	for (int i = 0; i<data.length; i ++) {
		if(i == pos) {
			tempArray[i] = d;
			tempArray[i+1] = data[i];
			j = j + 1;
			
		}
		else {
			tempArray[i+j] = data[i];
			
		}
	
	}
	data = tempArray;
	numItems = numItems + 1;
	}
	
}