import java.io.*;
import java.util.*;

public class myList {
    private int[] data;
    private int numItems;
    
    public myList() {
        data = new int[5];
        numItems=0;
    }
    
    public void grow(){
	int[] tmpArray = new int[data.length+data.length/2];
        for (int i=0;i<data.length;i++) 
            tmpArray[i]=data[i];
	
        data = tmpArray;
	//System.out.println(Arrays.toString(data));
    }
       
	
   
    public void add(int d) {
        
        if (numItems>=data.length) {
	    grow();
        }
        data[numItems]=d;
        numItems = numItems + 1;
    }
    
    public void add(int pos, int d){
	if (data[data.length-1] != 0){
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
	
	/*int[] temparray = new int[data.length + 1];
	for (int i = 0; i < pos;i++){
	    temparray[i] = data[i];
	}
	temparray[pos] = d;
	for (int i = pos+1;i < temparray.length;i++){
	    temparray[i] = data[i-1];
	}
	data = temparray;
	numItems = numItems + 1;
	*/ 
    }

    public void remove(int pos){
	
	for (int i = pos;i < data.length-1 ;i++){
	    data[i] = data[i+1];
	}
	data[data.length - 1] = 0;
	numItems = numItems - 1;
    }

    public int get(int pos){
	if (pos >= data.length)
	    return data[data.length-1];
	else
	    return data[pos];
    }

    public void set(int pos, int d){
	data[pos] = d;
    }
    
    public int size(){
	return numItems;
    }

    public int find(int n){
	for (int i =0; i <data.length;i++){
	    if (data[i] == n){
		return n;
	    }
	}
	return 0;
    }
		
    public int fremove(int n){
	for (int i =0; i <data.length;i++){
	    if (data[i] == n){
		remove(i);
		return n;
	    }
	}
	return 0;
    }
    
    

    public String toString() {
        String s = Arrays.toString(data)+" : "+numItems;
        return s;
    }
        
}
