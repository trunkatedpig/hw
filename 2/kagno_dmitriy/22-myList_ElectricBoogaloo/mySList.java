import java.io.*;
import java.util.*;

public class mySList{
    private String[] data;
    private int numItems;
    
    public mySList() {
        data = new String[5];
        numItems=0;
    }
    
    public void grow(){
	String[] tmpArray = new String[data.length+data.length/2];
        for (int i=0;i<data.length;i++) 
            tmpArray[i]=data[i];
	
        data = tmpArray;
	//System.out.println(Arrays.toString(data));
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
	    //all we had to do was lower the length of the loop, or else
	    // it would go out of bounds. That was our error in class.
	    if (data[i].equals(n)){
		return n;
	    }
	}
	return "Error";
    }
		
    public String fremove(String n){
	for (int i =0; i <data.length-1;i++){
	    //same applies here as it does for find(String n) also
	    // .equals() doesn't work for null so made some changes for that
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
