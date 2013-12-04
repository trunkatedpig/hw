import java.util.*;
import java.io.*;

public class myList {
    private int[] data;
    private int numItems;

    public myList() {
	data = new int[5];
	Random r = new Random();
	for (int i = 0; i < data.length; i++) {
	    data[i] = r.nextInt();
	}
	numItems = 5;
    }

    public String toString() {
        String s = Arrays.toString(data)+" : "+numItems;
        return s;
    }

    public boolean isFull() {
	return numItems >= data.length;
    }

    public void grow(){
        int[] tmpArray = new int[data.length+data.length/2];
        for (int i = 0; i < data.length; i++) {
            tmpArray[i] = data[i];
	}
        data = tmpArray;
    }
       
    public void add(int d) {
        if (numItems>=data.length) {
	    grow();
        }
        data[numItems]=d;
        numItems = numItems + 1;
    }

    public void add(int pos, int d) {
	// I'm unclear as to what the difference between the old add and the revised version is; this is basically the old version. 
	int tempArray = new int[data.length + 1];
	for (int i = 0; i < pos; i++) {
	    tempArray[i] = data[i];
	}
	tempArray[pos] = d;
	for (int j = pos; j < data.length; j++) {
	    tempArray[j+1] = data[j];
	}
	data = tempArray;
	numItems = numItems + 1;
    }

    public void remove(int pos) {
	for (int i = pos; i < data.length-1; i++) {
	    data[i] = data[i+1];
	}
	numItems = numItems - 1;
	data[numItems] = 0;
    }

    public int size() {
	return numItems;
    }

    public int get(int pos) {
	return data[pos];
    }
    
    public int set(int pos, int d) {
	data[pos] = d;
    }	

    public int find(int n){
	for (int i =0; i <data.length-1;i++){
	    if (data[i].equals(n)){
		return n;
	    }
	}
	return "Error";
    }

    public int fremove(int n){
	for (int i = 0; i < data.length-1; i++){
	    if (data[i] == n){
		remove(i);
		return n;
	    }
	}
	return "Error";
    }
    
}
