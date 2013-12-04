import java.io.*;
import java.util.*;

public class myStringList{

    private String[] data;
    private int numItems;
    
    public myStringList(){
	data = new String[10];
	numItems=0;
    }

    public boolean isFull() {
	return numItems >= data.length;
    }

    public void grow() {
	    // "grow" the array by creating a new one and copying over
	    String[] tmpArray = new String[data.length+data.length/2];
	    for (int i=0;i<data.length;i++) 
		tmpArray[i]=data[i];
	    data = tmpArray;
    }
    
    public void add(String d) {
        if (isFull()){
            grow();
        }
        data[numItems]=d;
        numItems = numItems + 1;
    }
    
    public void add(int pos, String d) {
	if (pos>=numItems)
	    add(d);
	else {
	    if (isFull())
		grow();
            for(int i = numItems; i>pos; i--){
                data[i] = data[i-1];
	    }
	    data[pos] = d;
	    numItems++;
	}
    }	

    public String toString() {
	String s =Arrays.toString(data)+" --- " +numItems;
	return s;
    }

    public void remove(int pos) {
        for (int i = pos; i<numItems-1;i++){
	    data[i]=data[i+1];
	}
	numItems--;
    }

    public int size() {
	return numItems;
    }

    public String get(int pos) {
	return data[pos];
    }

    public void set(int pos, String d) {
        data[pos]=d;
    }
    
    public String find(String d){
	for (int i=0;i<data.length;i++) {
	    if (data[i].equals(d)){
		return d;
	    }
	}
	return "-1";
    }

    public void fremove(String d){
	for (int i=0;i<data.length;i++) {
	    if (data[i].equals(d)){
		remove (i);
		i=data.length;
	    }
	    else if (i==data.length-1 && data[i]!=d){
		System.out.println(d + " is not in the array.");
	    }
	}
    }
}
