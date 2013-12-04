import java.io.*;
import java.util.*;

public class myStringList {
    private String[] data;
    private int numItems;
    
    public myStringList() {
	data = new String[5];
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
    
    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }
	
    public void insert(int pos, String d) {
	if (numItems < data.length){
	    add(data[numItems]);
	    for (int i= numItems-1; i>=pos; i--){
	        data[i] = data[i-1];
	    }
	    data[pos] = d;
	}
	else{
	    String[] temp = new String[data.length+1];
	    int i;
	    for (i = 0; i<pos; i++){
		temp[i] = data[i];
	    }
	    temp[pos] = d;
	    for (int k = i; k< data.length; k++){
		temp[k+1] = data[k];
	    }
	    data = temp;
	    numItems++;
	}
    }

    public void remove(int pos){
	String[] temp = new String[data.length];
	int i;
	for (i = 0; i<pos; i++){
	    temp[i] = data[i];
	}
	for (int k=i+1; k<data.length; k++){
	    temp[k-1] = data[k];
	}
	data = temp;
	numItems--;
    }

    public int size() {
	return numItems;
    }
    public String get(int pos) {
	return data[pos];
    }
    public void set(int pos, String d) {
	if (pos < numItems) {
	    data[pos] = d;
	}
	else{
	    add(d);
	}
    }
    public String find(String n){
	for (int i = 0; i<data.length; i++){
	    if (data[i] == n){
		return data[i];
	    }
	}
	return null;
    }
    public void fremove(String n){
	for (int i = 0; i<data.length; i++){
	    if (data[i] == n){
		remove(i);
		break;
	    }
	}
    }
}
