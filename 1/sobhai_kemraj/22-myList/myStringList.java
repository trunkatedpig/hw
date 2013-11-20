import java.io.*;
import java.util.*;
public class myStringList {
    private String[] data;
    private int numItems;
    
    public myStringList() {
	data =new String[10];
	numItems=0;
    }
    
    public void add(String d) {
	if (numItems>=data.length) {
	    System.out.println("Growing");
	    String[] tmpArray = new String[data.length+(data.length/2)];
	    for (int i=0;i<data.length;i++) 
		tmpArray[i]=data[i];
	    data = tmpArray;
	}
	
	// then add
	data[numItems]=d;
	numItems=numItems+1;
    }
    
    public void insert (int pos, String d){
	String[] temparray= new String[data.length+1];
	for (int i=0;i<pos;i++){
	    temparray[i]=data[i];}
	temparray[pos]=d;
	for (int i=pos;i<data.length;i++){
	    temparray[i+1]=data[i];	}
	data=temparray;
	numItems=numItems+1;
    }
    
    public String remove (int pos){
	String output=data[pos];
	for (int i=pos; i<data.length-1;i++){
	    data[i]=data[i+1];
	}
	data[data.length-1]=null;
	numItems=numItems-1;
	return output;
    }

    public String get(int i){
	return data[i];
    }
    
    public void set(int i, int d){
	data[i]= data[d];
    }

    public int size(){
	return numItems;
    }

    public String toString() {
	String s =Arrays.toString(data)+" --- " +numItems;
	return s;
    }
}
