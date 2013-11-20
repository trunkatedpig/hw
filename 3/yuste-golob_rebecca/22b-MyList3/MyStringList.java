import java.io.*;
import java.util.*;

public class MyStringList {
    private String[] data;
    private int numItems;
    private Random r;
    
    public MyStringList() {
	data = new String[5];
	numItems=5;
	for (int i = 0; i < data.length; i =i +1){
	    data[i] =randString();
	}
    }

    public String randString(){
	r = new Random();
	if (r.nextInt(3)%2 ==0){
	    return "a";
	} else{
	    return "b";
	}
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
    
    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }
    
    public void add(int pos, String d) {
        if (isFull()) {
            grow();
        }
        for (int i = data.length-1; i > pos; i--) {
            data[i] = data[i-1];
        }
        data[pos] = d;
        numItems = numItems + 1;
    }
    
    public int size() {
	return numItems;
    }
    public String get(int pos) {
	return data[pos];
    }
    public void set(int pos, String d) {
	data[pos] = d;
    }

    public void remove(int pos) {
        grow();
        for (int i = pos; i < numItems; i++)
            set(i, data[i+1]);
        numItems--;
    }
    
    private int index;
    public String find(String n){
	index = 0;
	for (int i = 0; i < data.length; i = i + 1){
	    if (data[i].equals(n)){
		return n;
	    }
	    index = index + 1;
	}
	return "null";
    }

    public void fRemove(String n){
	String i = find(n);
	if (i.equals("null")){
	    System.out.println("Out of bounds");
	} else{
	    remove(index);
	}
    }
    
    

}
