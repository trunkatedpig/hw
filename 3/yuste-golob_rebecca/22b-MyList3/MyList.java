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
	    data[i] = r.nextInt(5);
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
        if (isFull()) {
            grow();
        }
        for (int i = data.length-1; i > pos; i--) {
            data[i] = data[i-1];
        }
        data[pos] = d;
        numItems = numItems + 1;
    }
    
    public int size() {
	return numItems;
    }
    public int get(int pos) {
	return data[pos];
    }
    public void set(int pos, int d) {
	data[pos] = d;
    }

    public void remove(int pos) {
        grow();
        for (int i = pos; i < numItems; i++)
            set(i, data[i+1]);
        numItems--;
    }
    
    private int index;
    public int find(int n){
	index = 0;
	for (int i = 0; i < data.length; i = i + 1){
	    if (data[i] == n){
		return n;
	    }
	    index = index + 1;
	}
	return 0;
    }

    public void fRemove(int n){
	if (n >= numItems){
	    System.out.println("Out of bounds");
	} else{
	    int i = find(n);
	    remove(index);
	}
    }
    
    

}
