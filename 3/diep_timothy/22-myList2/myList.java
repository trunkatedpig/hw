import java.io.*;
import java.util.*;

public class myList {
    private int[] data;
    private int numItems;
    Random r = new Random();

    public myList(int length) {
	data = new int[length];	    
	numItems = 0;
    }

    public String toString() {
	String s = Arrays.toString(data) + " : " + numItems;
	return s;
    }

    public boolean isFull() {
	return numItems >= data.length;
    }

    public void grow() {
	int[] tmpArray = new int[data.length + data.length/2];
	for (int i=0;i<data.length;i++)
	    tmpArray[i] = data[i];
	data = tmpArray;
    }

    public void add(int d) {
	if (isFull())
	    grow();
	data[numItems] = d;
	numItems = numItems + 1;
	System.out.println("Added " + d + "!"); 
    }

    public void add(int pos, int d) {
	while (data.length<pos) 
	    grow();
	if (isFull())
	    grow();
	for (int i=pos;i<data.length-1;i++) {
	    if (i==pos)
		data[i] = d;
	    else
		data[i] = data[i+1];
	}
	numItems = numItems + 1;
	System.out.println("Inserted " + d + " into position " + pos + "!");
    }
    
    public void remove(int pos) {
	int out = data[pos];
	for (int i=pos+1;i<numItems;i++) {
	    data[i-1] = data[i];
	}
	numItems = numItems - 1;
	System.out.println("Removed " + out + " from position " + pos + "!");
    }
    
    public String size() {
	return "Size of array: " + numItems;
    }
    
    public String get(int pos) {
	return "Number in position " + pos + " : " + data[pos];
    }

    public void set(int pos, int d) {
	while (data.length<pos) 
	    grow();
	data[pos] = d;
	System.out.println("Set " + d + " in position " + pos + "!");
    }

    public int find(int n) {
	for (int i=0; i<numItems; i++){
	    if (data[i]==n)
		return n;
	}
	return 0;
    }
     
    public int fremove(int n) {
	for (int i=0; i<numItems; i++){
	    if (data[i]==n){
		remove(i);
		return n;
	    }
	}
	return -1;
    }

}
	
