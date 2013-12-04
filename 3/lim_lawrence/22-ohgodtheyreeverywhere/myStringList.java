import java.io.*;
import java.util.*;

public class myStringList {
    private String[] data;
    private int numItems;
    
    public myStringList() {
	data = new String[5];
	numItems=0;
    }

    public int size() {return numItems;}
    public String get(int pos) {return data[pos];}
    public void set(int pos, String d) {data[pos]=d;}

    public void grow() {
	//System.out.println("Growing from " + data.length + 
	//                   " to " + data.length*3/2);
	String[] tmpArray = new String[data.length+data.length/2];
	for (int i=0;i<data.length;i++) 
	    tmpArray[i]=data[i];
	data = tmpArray;
    }

    public void add(String d) {
	if (numItems>=data.length) {grow();}
        data[numItems]=d;
        numItems = numItems + 1;
    }
    
    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }

    public void insert(int pos, String d) {
	add(data[numItems-1]);
	for(int i=numItems-1; i>pos; i--)
	    data[i]=data[i-1];
	data[pos]=d;
    }
	
    public String remove(int pos) {
	String r=data[pos];
	for(int i=pos;i<numItems;i++)
	    data[i]=data[i+1];
	numItems--;
	return r;
    }
    
    public String find(String n) {
	for(int i=0;i<numItems;i++) {
	    if(data[i]==n) {return data[i];}
	}
	return "nope";
    }

    public String fremove(String n) {
	for(int i=0;i<numItems;i++) {
	    if(data[i]==n) {
		String r = data[i];
		remove(i);
		return r;
	    }
	}
	return "nope";
    }
}
