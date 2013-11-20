import java.io.*;
import java.util.*;

public class myStringList {
    private String[] data;
    private int numItems;
    
    public myStringList() {
        data = new String[5];
        numItems = 0;
    }

    public boolean isFull() {
        return numItems >= data.length;
    }
    
    public void grow() {
        String[] tmpArray = new String[data.length + data.length/2];
        for (int i = 0; i < data.length; i++) {
            tmpArray[i] = data[i];
        }
        data = tmpArray;
    }
    
    public void add(String d) {
        if (isFull()){
            grow();
        }
        data[numItems] = d;
        numItems = numItems + 1;
    }
    
    public void insert(int pos, String d) {
        String[] tmpArray = new String[data.length+1];
        for (int i = 0; i < pos; i++) {
            tmpArray[i] = data[i];
        }
        tmpArray[pos] = d;
        for (int j = pos; j < data.length; j++) {
            tmpArray[j+1] = data[j];
        }
        data = tmpArray;
        numItems = numItems + 1;
    }

    public String toString() {
        String s = Arrays.toString(data) + " : " + numItems;
        return s;
    }
    
    public void add(int pos, String d) {
        if (isFull()){
            grow();
        }
        for(int i = numItems + 1; i > pos; i--){
            data[i] = data[i-1];
        }
        data[pos] = d;
        numItems = numItems + 1;
    }
    
    public void remove(int pos){
        data[pos] = "null";
        for(int i = pos; i < numItems; i++){
            data[i] = data[i+1];
        }
        numItems = numItems - 1;
    }

    public void size(){
        System.out.println("Number of items: " + numItems);
    }

    public void get(int pos){
        System.out.println("At position " + pos + " is " + data[pos]);
    }

    public void set(int pos, String d){
        data[pos] = d;
    }

    public String find(String n) {
	for(int i = 0; i < data.length; i++){
	    if (data[i].equals(n)) {
		return n;
	    }
	}
	return "Woops, try again!";
    }
    
    public void fremove(String n) {
	for(int i = 0; i < data.length; i++) {
	    if (data[i].equals(n)) {
		remove(i);
	    }
	}
    }
}