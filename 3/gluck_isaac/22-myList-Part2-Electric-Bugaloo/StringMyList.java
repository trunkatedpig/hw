import java.util.*;
import java.io.*;

public class StringMyList {
    private String[] data;
    private int numItems;
    
    public StringMyList() {
	String[] data = new String[5];
	Arrays.fill(data, "");
	numItems=0;
    }
    
    public boolean isFull() {
		return (numItems >= data.length);
    }
    
    public void grow() {
		// "grow" the array by creating a new one and copying over
		String[] tmpArray = new String[data.length+data.length/2];
	  	for (int i=0;i<data.length;i++) 
			tmpArray[i]=data[i];
	    data = tmpArray;
    }
    
    public void add(String d) {
    	//Appends to the end of the list
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
    
    public void add(int pos, String d) {
    	if (isFull()){
	    grow();
	}
	
	for (int i=numItems-1;i>=pos;i--){
		    data[i+1]=data[i];
		}
		data[pos] = d;
		numItems = numItems+1;
    }

    public void remove(int pos) {
    	numItems=numItems-1;
    	for (int i=pos;i<data.length;i++){
	    if (i<=numItems)
		    data[i]=data[i+1];
    	else
		    data[i]="";
    	}
    }
    
     public int size() {
		return numItems;
     }

     public String get(int pos) {
		//if (pos>=numItems) not actually in the list
		return data[pos];
     }

     public void set(int pos, String d) {
		data[pos] = d;
     }

    public String find(String v){
	for (int i=0;i<data.length;i++){
	    if (data[i].equals(v))
			return data[i];
	}
	return "";
    }

    public String findRemove(int v){
	for (int i=0;i<data.length;i++){
	    if (data[i].equals(v)){
			remove(i);
		return data[i];
	    }
	}
	return "";
    }

}