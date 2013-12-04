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
    public void remove(int pos){
	if (pos<0){
	    data=data;
	}
	else{
	    int[] temp= new int[data.length-1];
	    for(int i=0; i<data.length-1; i++){
		if (i>=pos){
		    temp[i]=data[i+1];
		}
		else{
		    temp[i]=data[i];
		}
	    }
	    data=temp;
	    numItems=numItems-1;
	}
	
    }
	
}
