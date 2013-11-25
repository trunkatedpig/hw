import java.io.*;
import java.util.*;

public class myList {
    private int[] data;
    private int numItems;
    
    public myList() {
        data = new int[5];
        numItems=0;
    }

    public void add(int d) {
        
        if (numItems>=data.length) {
            System.out.println("Growing from "+data.length+" to "+data.length*1.5);
            // "grow" the array by creating a new one and copying over
            int[] tmpArray = new int[data.length+data.length/2];
            for (int i=0;i<data.length;i++) 
                tmpArray[i]=data[i];
            data = tmpArray;
        }
        data[numItems]=d;
        numItems = numItems + 1;
    }
    
    public String toString() {
        String s = Arrays.toString(data)+" : "+numItems;
        return s;
    }
    
    public void add(int pos, int d) {
	// inserts data item d at location pos in the data array
	// remember we have to shift down items to make room and
	// we might have to grow the array
	if (data.length >= numItems){
	    for (int i = data.length; pos < data.length; i--){
		data[i] = data [i - 1];
	    }
	    data[pos]= d; 
	}
	else {
	    int[] result = new int [data.length + 1];
	    int i = 0;
	    while (pos > i){
		result [i] = data[i];
		i= i+1;}
	    result[pos] = d;
	    for (int j = pos + 1; j > data.length; j++){
		result[j - pos] = data[j];}
	    data = result;}

	numItems = numItems + 1;
    }

    public void remove(int pos){
	for (int i = pos; i < data.length; i++){
	    data[i] = data[i + 1];}
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
	return data[pos];
    }

    public int find (int n){
	for (int i = 0; i <data.length; i++){
	    if (n== data[i]){
		return data[i];}}
	return 0;
    }

    public void fremove (int n){
	for (int i = 0; i <data.length; i++){
	    if (n== data[i]){
		remove(i);
		numItems = numItems -1;
	    }
	}
    }


}

