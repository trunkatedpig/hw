import java.io.*;
import java.util.*;

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
	// 1. Grow if needed
	// 2. shift everything past the insertion point down
	// 3. add the new item
	// 4. numitems++
	if (isFull()){
	    grow();}
	for (int i= numItems; i>pos; i--){
	    data[i]=data[i-1];
	}
	data[pos]=d;
	numItems = numItems + 1;
   }

    public void remove(int pos) {
	for (int i= pos; i<numItems-1; i++){
	    data[i]=data[i+1];
	}
	data[numItems-1]=0;
	numItems = numItems - 1;
    }
    public int size() {
	return numItems;
    }
    public int get(int pos) {
	if (pos<data.length){
	    return data[pos];}
	else{
	    return -1;
	}
    }
    public void set(int pos, int d) {
	while (pos>data.length-1){
	    grow();
	}
	if (pos>numItems-1){
	    data[pos]=d;
	    numItems = numItems + (pos-numItems-1);
	}
	else if (pos<=numItems-1){
	    data[pos]=d;
	}
    }
    public int findIndex(int d){
	int temp = -1;
	for (int i=0; i<numItems; i++){
	    if (d==data[i]){
		temp = i;
	    }
	}
	return temp;
    }
    public int fetchMeAD(int d){
	int temp = -1;
	for (int i=0; i<numItems; i++){
	    if (d==data[i]){
		temp = d;
	    }
	}
	return temp;
    }
    
    public void fremove(int d){
	if (findIndex(d)!=-1){
	    int index = findIndex(d);
	    remove(index);
	}
    }

}