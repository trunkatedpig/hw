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
    public void insert(int pos, int d){
	int b = 0;
	int[] result = new int[data.length+1];
	for (int a=0; a < data.length;a++){
	    if (b==pos){
		result[b]=d;
		b++;
	    }
	    
            result[b]=data[a];
	    b++;
	}
	data=result;
	numItems = numItems+1;
    }
    public int remove(int pos){
	int toBeReturned = data[pos];
	int b = 0;
	int[] result = new int[data.length-1];
	for (int i = 0;i<data.length-1;i++){
	    if (pos == i)
		b++;
	    result[i]=data[b];
	    b++;
	}
	data=result;
	numItems=numItems-1;
	return toBeReturned;
    }
	
}
