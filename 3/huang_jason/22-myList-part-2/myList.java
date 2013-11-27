import java.io.*;
import java.util.*;

public class myList {

    private int[] data;
    private int numItems;
    Random r = new Random();
    
    public myList() {
	data = new int[5];
	numItems=0;
    }

    public myList(int length, int max) {
        data = new int[length];
        for (int i=0;i<length;i++) {
	    data[i] = r.nextInt(max);
        }        
	numItems = length;
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
	
    public void add(int pos, int d) {
	// inserts the value d at location (index) pos)
	// 1. Grow if needed
	// 2. shift everything past the insertion point down
	// 3. add the new item
	// 4. numitems++
	while(data.length<=pos){
	    grow();
	}
	for(int i=data.length-1; i>=pos; i--){
	    if (i==pos)
		data[i] = d;
	    else
		data[i] = data[i-1];
	}
	numItems = numItems + 1;
	System.out.println("Added " + d + " at Position " + pos);
    }

    public void remove(int pos) {
	// removes the item at location pos
	// 1. shift everything down to remove the item
	// 2. numitems--;
	int output = data[pos];
	for(int i=pos; i<data.length-1; i++){
	    data[i] = data[i+1];
	}
	numItems = numItems - 1;
	System.out.println("Removed " + output + " from Position " + pos);
    }

    public int size() {
	// return the number of items in the list
	return numItems;
    }

    public int get(int pos) {
	//return the item at pos;
	if(pos>data.length)
	    return 0;
	else
	    return data[pos];
    }

    public void set(int pos, int d) {
	// change the item at pos to have the value d
	while(data.length<pos){
	    grow();
	}
	data[pos] = d;
    }

    public int find(int n){
	for(int i=0; i<data.length; i++){
	    if (data[i] == n)
		return n;
	}
	return 0;
    }

    public int fremove(int n){
	for(int i=0; i<data.length; i++){
	    if (data[i] == n){
		this.remove(i);
		return n;
	    }
	}
	return 0;
    }
}