//Worked in conjunction with partner Sam Kim, Danny Qiu



import java.io.*;
import java.util.*;

public class myListStrings {
    private String[] data;
    private int numItems;
    
    public myListStrings() {
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
        //data[pos] = 0;
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

    public String find(String n){ //find first occurance of an int.
	for (int i=0; i<data.length; i++){
	    if (n==data[i]) {
		return data[i];
	    }
	}
	return "n/a";
    }

    public void fremove(String n) {
	for (int i=0; i<data.length; i++){
	    if (n==data[i]){
		remove(i);
	    }
	    break;
	}
    }

}
