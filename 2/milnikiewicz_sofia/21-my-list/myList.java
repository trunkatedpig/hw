import java.io.*;
import java.util.*;

public class myList {
    protected int[] data;
    protected int numItems;
    
    public myList() {
	int n = 5;
        data = new int[n];
	for (int i=0;i<n;i++){
	    data[i]=i;
	}
        numItems=n;
    }

    public String toString() {
        String s = Arrays.toString(data)+" : "+numItems;
        return s;
    }

    public void add(int d) {
        
        if (numItems>=data.length) {
            System.out.println("Growing from "+data.length+" to "+(data.length+1));
            // "grow" the array by creating a new one and copying over
            int[] tmpArray = new int[data.length+1];
            for (int i=0;i<data.length;i++) 
                tmpArray[i]=data[i];
            data = tmpArray;
        }
        data[numItems]=d;
        numItems = numItems + 1;
    }

    public void insert(int pos,int d){
	int[] a = data;
	add(1);
	for (int i=pos;i<data.length;i++){
	    if (i == pos){
		data[i] = d;}
	    else
	        data[i]= a[i-1];
	}
    }      
    public void insert2(int pos, int d){
	if (numItems<data.length){
	    for (int i=pos;i<numItems;i++){
		data[i+1]=data[i];
	    }
	    data[pos]=data[d];
	}
	else{
	    int[] a = data;
	    add(1);
	    for (int i=pos;i<data.length;i++){
		if (i == pos){
		    data[i] = d;}
		else
		    data[i]= a[i-1];
	    }
	}      
    }
    public void remove(int pos){
	data[pos]=0;
	for(int i=pos;i<numItems;i++){
	    data[i]=data[i+1];
	}
    }	
}
