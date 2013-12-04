import java.io.*;
import java.util.*;

public class myStringList{
    private String[] data;
    private int numItems;

    public myStringList(){
	data = new String[5];
	numItems = 0;
    }

    public boolean isFull(){
	return numItems >= data.length;
    }

    public void grow(){
	String[] tmpArray = new String[data.length + data.length/2];
	for (int i = 0; i < data.length; i++){
	    tmpArray[i] = data[i];
	}
	data = tmpArray;
    }

    public void add(int d){
	if (isFull())
	    grow();
	data[numItems] = d;
	numItems = numItems + 1;
    }

    public void add(int pos, String d){
	if (isFull())
	    grow();
	for (int i = numItems; i >= pos; i--){
	    data[i + 1] = data[i];
	}
	data[pos] = d;
	numItems = numItems + 1;
    }

    public void remove(int pos){
	for (int i = pos; i < data.length; i++){
	    data[i] = data[i + 1];
	}
	numItems = numItems - 1;
    }

    public int size(){
	return numItems;
    }

    public String get(int pos){
	return data[pos];
    }

    public String set(int pos, String d){
	data[pos] = d;
	return d;
    }

    //myList 3 in 3D

    public String find(String d){
	if (indexOf(d) = -1)
	    return "null";
	return d;
    }

    public int indexOf(String d){
	for (int i = 0; i < numItems; i++){
	    if (data[i].equals(d))
		return i;
	}
	return -1;
    }

    public void fremove(String d){
	if (indexOf(d) > -1)
	    remove(indexOf(d));
    }
}
