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

    public void add(int pos, int d){
	if (isFull() || pos > data.length)
	    grow();
        
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
    
    public void remove(int pos){
	boolean removed = false;
	for (int ind = pos; ind < data.length - 1; ind++){
	    data[ind] = data[ind + 1];
	    removed = true;
	}
	if (removed == true)
	    numItems = numItems - 1;
    }

    public int size(){
	return numItems;
    }

    public int get(int pos){
	if (pos > numItems)
	    return -1;
	else
	    return data[pos];
    }
    
    public int set(int pos, int d){
	if (pos > numItems)
	    return -1;
	else{
	    int change = data[pos];
	    data[pos] = d;
	    return change;
	}
    }

    public int find(int d){
	for (int ind = 0; ind < numItems; ind++){
	    if (data[ind] == d)
		return d;
	}
	return -1;
    }

    public void fremove(int d){
	int ind;
	for (ind = 0; ind < numItems; ind++){
	    if (data[ind] == d){
		remove(ind);
		break;
	    }
	}
    }
}
