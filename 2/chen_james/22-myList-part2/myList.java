import java.io.*;
import java.util.*;
public class myList {
    private int[] data;
    private int numItems;
    
    public myList() {
	data = new int[10];
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
	
	public void add1 (int pos, int d) {
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
	
    public void add(int pos, int d) {
	
	if (numItems< data.length) {
		
		
		
		for(int i = numItems-1; i > pos-1; i--) {
			data[i+1] = data[i];
		}
		data[pos] = d;
		numItems = numItems + 1;		
	}
	else {
	add1(pos,d);
	}
	
		// to be completed by you
		// inserts the value d at location (index) pos)
		// recall the algorithm we developed in calss:
		// 1. Grow if needed
		// 2. shift everything past the insertion point down
		// 3. add the new item
		// 4. numitems++
	}

    public void remove(int pos) {
		// removes the item at location pos
		// 1. shift everything down to remove the item
		// 2. numitems--;
		for (int i=pos; i<numItems-1; i++) {
            data[i] = data[i + 1];
        }
        data[numItems - 1] = 0;
        numItems--;
    }
	public int size() {
		// return the number of items in the list
		return numItems;
	}
	public int get(int pos) {
		//return the item at pos;
		return data[pos];
	}
	public void set(int pos, int d) {
		// change the item at pos to have the value d
		data[pos] = d;
		
	}
	public int find (int n){
	for (int i = 0; i <data.length; i++){
	    if (n== data[i]){
		return data[i];}}
	return 0;
    }

    public void fremove (int n){
	for (int i = 0; i <data.length; i++){
	    if (n== data[i]){
		remove(i);}
	}
    }
}