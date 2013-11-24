import java.io.*;
import java.util.*;

public class myStringList {
       private String[] data;
       private String  numItems;

       public myStringList() {
          data = new String[5];
	  numItems = 0;
       }


    public boolean isFull() {
	return numItems >= data.length;
    }
    
   
   
    public void grow(int d) {
	String[] tmpArray = new String[data.length + data.length + d ];
	for (int i=0;i<data.length;i++) {
	    tmpArray[i]=data[i];
	}
	data = tmpArray;
    }

    public void add(int d) {
	if (isFull()) {
	    grow(d);
    }

	data[numItems] = d;
	numItems=numItems+1;
    }


    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }


    public int remove(int pos){
	String[] temp = new String[numItems - 1]; 
	int i = 0; 
	int j = 0; 
	while (i < numItems){ 
	    if (i != pos){
		temp[j] = data[i];
		i = i + 1;
		j = j + 1; 
	    } 
	    else 
		i = i + 1; 
	}
	data  = temp; 
	return i;
    }
   
   
	public int size() {
	    return numItems;

	    // return the number of items in the list
	}
	public int get(int pos) {
	    return data[pos];
	    //return the item at pos;
	}
	public int set(int pos, int d) {
	    String[] temparray = new String[numItems];
	    for (int i = 0; i < numItems; i++){
		if (i !=  pos)
		    temparray[i] = data[i];  
		else
		    temparray[i] = d; 
	    }
	    temparray = data; 
	    return numItems;
	}
		// change the item at pos to have the value d
    public int find(int b){ 
	for (int i = 0; i < numitems; i++){ 
	    if( data[i] == b)
		return b;
	}
    }
   

}
