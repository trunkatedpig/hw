import java.io.*;
import java.util.*;

public class myList{
    private int[] data;
    private int numItems;

    public myList(){
	data = new int[5];
	numItems = 0;
    }

    public boolean isFull(){
	return numItems >= data.length;
    }

    public void grow(){
	int[] tmpArray = new int[data.length + data.length/2];
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

    public void add(int pos, int d){
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

    public int get(int pos){
	return data[pos];
    }

    public int set(int pos, int d){
	data[pos] = d;
	return d;
    }

    //myList 3 in 3D

    public int find(int d){
	if (indexOf(d) = -1)
	    return 0;
	return d;
    }

    public int indexOf(int d){
	for (int i = 0; i < numItems; i++){
	    if (data[i] == d)
		return i;
	}
	return -1;
    }

    public void fremove(int d){
	if (indexOf(d) > -1)
	    remove(indexOf(d));
    }
}
