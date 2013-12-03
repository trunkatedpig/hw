import java.util.*;
import java.io.*;

public class MyList {
    private int[] data;
    private int numItems;
    
    public MyList() {
	data = new int[5];
	numItems=0;
    }
    
    public boolean isFull() {
	return numItems >= data.length;
    }
    
    public void grow() {
	// "grow" the array by creating a new one and copying over
	int[] tmpArray = new int[data.length+data.length/2];
	    for (int i=0;i<data.length;i++) 
		tmpArray[i]=data[i];
	    data = tmpArray;
    }
    
    public void add(int d) {
    	//Appends to the end of the list
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
    
    public void add(int pos, int d) {
    	if (isFull()){
	    grow();
	}
	
	for (int i=numItems-1;i>=pos;i--){
		    data[i+1]=data[i];
		}
		data[pos] = d;
		numItems = numItems+1;
    }

    public void remove(int pos) {
    	numItems=numItems-1;
    	for (int i=pos;i<data.length;i++){
	    if (i<=numItems)
		    data[i]=data[i+1];
    		else
		    data[i]=0;
    	}
    }
    
     public int size() {
		return numItems;
     }

     public int get(int pos) {
		//if (pos>=numItems) not actually in the list
		return data[pos];
     }

     public void set(int pos, int d) {
		data[pos] = d;
     }

    public int find(int v){
	for (int i=0;i<data.length;i++){
	    if (data[i]==v)
		return data[i];
	}
	return 0;
    }

    public int findRemove(int v){
	for (int i=0;i<data.length;i++){
	    if (data[i]==v){
	    	remove(i);
		return data[i];
	    }
	}
	return 0;
    }

}