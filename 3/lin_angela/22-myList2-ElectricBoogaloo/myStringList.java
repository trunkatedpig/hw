import java.util.*;
import java.io.*;

public class myStringList{

    private String[] data;
    private int numItems;

    public myStringList(){
	data = new String[5];
	numItems = 0;
    }
    public void grow() {
	// "grow" the array by creating a new one and copying over
	String[] tmpArray = new String[data.length+data.length/2];
	for (int i=0;i<data.length;i++) 
	    tmpArray[i]=data[i];
	data = tmpArray;
    }

    public boolean isFull() {
	return numItems >= data.length;
    }

    public String toString(){
	String s = Arrays.toString(data);
	return s;
    }
 
    public void add(String d){
	if (isFull()){
	    grow();
	}
	data[numItems] = d;
	numItems = numItems +1;
    }

    public void add(int pos, String d){
	while (isFull() || pos >= data.length){
	    grow();
	}
	for (int i = pos; i<=numItems; i++){
	    data[i+1] = data[i];
	}
	data[pos] = d;
	numItems++;
    }

    public String get(int pos){
	return data[pos];
    }

    public int size(){
	return numItems;
    }

    public String find(String n){
	for (int i = 0; i<data.length; i++){ //numItems doesnt work for me if there are 0's in between?
	    if (data[i] != null){
		if (data[i].equals(n)){
		    return n;
		}
	    }
	}
	return "Not found.";
    }

    public String fRemove(String n){
	for (int i = 0; i<data.length; i++){
	    if (data[i] != null){
		if (data[i].equals(n)){
		    remove(i);
		    return n;
		}
	    }
	}
	return "Nothing removed; item not found.";
    }

    public void remove(int pos) {
        for (int i=pos; i< numItems;i++) 
            data[i]=data[i+1];
        numItems--;
    }


}
