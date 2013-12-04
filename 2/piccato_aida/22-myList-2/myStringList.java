import java.io.*;
import java.util.*;

public class myStringList{
    private String[] data;
    private int numItems;
    
    public myStringList() {
        data = new String[5];
        numItems=5;
    for (int i = 0; i < 5; i ++) {
	    data[i] = "A";
	}
    }

    public void grow(){
	String[] tmpArray = new String[data.length+data.length/2];
        for (int i = 0; i < data.length; i++) {
            tmpArray[i] = data[i];
	}
        data = tmpArray;
    }
       
    public void add(String d) {
        if (numItems>=data.length) {
	    grow();
        }
        data[numItems]=d;
        numItems = numItems + 1;
    }

    public void add(int pos,String d){
	if (data[data.length-1] != null){
	    grow();
	    add(pos, d);
	}
	else{
	    for (int i = data.length-1; i > pos; i--){
		data[i] = data[i-1];
	    }
	    data[pos] = d;
	    numItems = numItems + 1;
        
	}        
    }

    public void remove(int pos){
	for (int i = pos;i < data.length - 1 ; i++){
	    data[i] = data[i+1];
	}
	data[data.length - 1] = " ";
	numItems = numItems - 1;
    }

    public String get(int pos){
	if (pos >= data.length)
	    return data[data.length-1];
	else
	    return data[pos];
    }

    public void set(int pos, String d){
	data[pos] = d;
    }
    
    public int size(){
	return numItems;
    }

    public String find(String n){
	for (int i =0; i <data.length-1;i++){
	    if (data[i].equals(n)){
		return n;
	    }
	}
	return "Error";
    }

    public String fremove(String n){
	for (int i = 0; i < data.length-1; i++){
	    if (data[i].equals(n)){
		remove(i);
		return n;
	    }
	}
	return "Error";
    }
    
    public String toString() {
        String s = Arrays.toString(data)+" : "+numItems;
        return s;
    }
        
}

    
