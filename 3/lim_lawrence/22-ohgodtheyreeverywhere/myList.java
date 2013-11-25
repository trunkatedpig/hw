import java.io.*;
import java.util.*;

public class myList {
    private int[] data;
    private int numItems;
    
    public myList() {
	data = new int[5];
	numItems=0;
    }

    public int size() {return numItems;}
    public int get(int pos) {return data[pos];}
    public void set(int pos, int d) {data[pos]=d;}

    public void grow() {
	//System.out.println("Growing from " + data.length + 
	//                   " to " + data.length*3/2);
	int[] tmpArray = new int[data.length+data.length/2];
	for (int i=0;i<data.length;i++) 
	    tmpArray[i]=data[i];
	data = tmpArray;
    }

    public void add(int d) {
	if (numItems>=data.length) {grow();}
        data[numItems]=d;
        numItems = numItems + 1;
    }
    
    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }

    public void insert(int pos, int d) {
	add(data[numItems-1]);
	for(int i=numItems-1; i>pos; i--)
	    data[i]=data[i-1];
	data[pos]=d;
    }
	
    public int remove(int pos) {
	int r=data[pos];
	for(int i=pos;i<numItems;i++)
	    data[i]=data[i+1];
	numItems--;
	return r;
    }
    
    public int find(int n) {
	for(int i=0;i<numItems;i++) {
	    if(data[i]==n) {return data[i];}
	}
	return 0;
    }

    public int fremove(int n) {
	for(int i=0;i<numItems;i++) {
	    if(data[i]==n) {
		int r = data[i];
		remove(i);
		return r;
	    }
	}
	return 0;
    }
}
