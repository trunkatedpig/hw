import java.io.*;
import java.util.*;

public class MyList {
    private int[] data;
    private int numItems;
    private Random r;
    
    public MyList() {
	r = new Random();
	data = new int[5];
	numItems=5;
	for (int i = 0; i < data.length; i =i +1){
	    data[i] = r.nextInt(100);
	}
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
	while (pos >= numItems || isFull()){
	    grow();
	}
	int[] result = new int[data.length + 1];
	for (int i = 0; i < pos; i = i +1){
	    result[i] = data[i];
	}
	for (int j = pos; j < result.length; j = j +1){
	    if (j == pos){
		result[j] = d;
	    } else {
		result[j] = data[j -1];
	    }
	}
	data = result;
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
}
