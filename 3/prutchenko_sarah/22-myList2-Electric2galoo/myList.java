import java.io.*;
import java.util.*;

public class myList {
       private int[] data;
       private int numItems;

       public myList() {
          data = new int[5];
	  numItems = 0;
       }


    public boolean isFull() {
	return numItems >= data.length;
    }

    public void grow() {
	int[] tmpArray = new int[data.length+data.length/2];
	for (int i=0;i<data.length;i++) {
	    tmpArray[i]=data[i];
	}
	data = tmpArray;
    }

    public void add(int d) {
	if (isFull()) {
	    grow();
    }

	data[numItems] = d;
	numItems=numItems+1;
    }


    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }
    //Sarah's work starts here
    public void add(int pos,int d){
	if (numItems== pos){
	    grow();
	}
	else{
	    for(int i=numItems; i>pos-1;i--){
		if(i==pos){
		    data[i]=data[i-1];
		    data[i-1]=d;
		}
		else{
		    data[i]=data[i-1];
		}
	    }
	    numItems=numItems+1;

	}
    }
    public int size(){
	return numItems;
    }
    public int get(int pos){
	return data[pos];
    }
    public void set(int pos, int d){
	data[pos]=d;
    }
    //the remove function was in my last hw
}
