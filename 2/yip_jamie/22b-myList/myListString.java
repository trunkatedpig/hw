import java.io.*;
import java.util.*;

public class myListString {
    private String[] data;
    private int numItems;
    
    public myListString() {
        data = new String[5];
        numItems=0;
    }

    public void add(String d) {
        
        if (numItems>=data.length) {
            System.out.println("Growing from "+data.length+" to "+data.length*1.5);
            // "grow" the array by creating a new one and copying over
            String[] tmpArray = new String[data.length+data.length/2];
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
    
    public void add(int pos, String d) {
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
	    String[] result = new String [data.length + 1];
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

    public String get(int pos){
	return data[pos];
    }
    public String set(int pos, String d){
	data[pos] = d;
	return data[pos];
    }

    public String find (String n){
	for (int i = 0; i <data.length; i++){
	    if (n== data[i]){
		return data[i];}}
	return "error";
    }

    public void fremove (String n){
	for (int i = 0; i <data.length; i++){
	    if (n== data[i]){
		remove(i);}
	}
    }


}

