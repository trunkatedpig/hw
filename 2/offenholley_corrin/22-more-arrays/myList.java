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
    public void add(int pos, int d){
	int store;
	int otherstore;
	int i =pos;
	store=data[i];
	data[i]=d;
	i++;
	if (numitems>=data.length){
	    add(0);
	    numitems--;
	}
	for (; i <data.length; i++){
	    otherstore=data[i];
	    data[i]=store;
	    store=otherstore;
	}
	numitems++;
    }
    /* public void insert (int pos, int d){
	int i=0;
	int q=0;
	int[] ans;
	ans = new int[data.length+1];
	while (i<pos){
	    ans[i]=a[i];
	    i+=1;
	    q+=1;
	}
	ans[i]=d;
	i+=1;
	while (q<data.length){
	    ans[i]=a[q];
	    i+=1;
	    q+=1;
	}
	data=ans;
	numitems++;
    }*/
    public void remove(int pos){
	int i=0;
	int q=0;
	int[] ans;
	ans = new int[data.length+1];
	while (i<pos){
	    ans[i]=a[i];
	    i+=1;
	    q+=1;
	}
	q++;

	while (q<data.length){
	    ans[i]=a[q];
	    i+=1;
	    q+=1;
	}

	data=ans;
	numitems--;
    }
    public int size(){
	return numitems;
    }
    public int get(int pos){
	return data[pos];
    }
    public void set(int pos, int d){
	data[pos]=d;
    }
}
