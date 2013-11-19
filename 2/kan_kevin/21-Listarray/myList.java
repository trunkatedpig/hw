import java.io.*;
import java.util.*;

public class myList {
    private int[] data;
    private int numItems;
    
    public myList() {
	data = new int[5];
	numItems=0;
    }

    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
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
    public void insert(int pos, int d){
	int[] temp = new int[data.length+1];
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

    public void insert2(int pos,int d){
	if (numItems < data.length){
	    for (int i= numItems; i>=pos; i--){
	        data[i+1] = data[i];
	    }
	    data[pos] = d;
	    numItems++;
	}
	else{
	    insert(pos, d);
	}
    }

    public void remove(int pos){
	int[] temp = new int[data.length-1];
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
}
