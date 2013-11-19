import java.io.*;
import java.util.*;
public class myList {

    private int[] data;
    private int numItems;
    
    public myList()
    {
	data =new int[10];
	numItems=0;
    }
    
    public void add(int d) {

	if (numItems>=data.length) {
	    System.out.println("Growing");
	    int[] tmpArray = new int[data.length+(data.length/2)];
	    for (int i=0;i<data.length;i++) 
		tmpArray[i]=data[i];
	    data = tmpArray;
	}
	
	// then add
	data[numItems]=d;
	numItems=numItems+1;
    }

    public void insert(int pos, int d){
	if (numItems == data.length){
	    int[] tempArray = new int[data.length + 1];
	    for (int i=0; i<pos; i++){
		tempArray[i] = data[i];
	    }
	    tempArray[pos] = d;
	    for (int j = pos; j<data.length; j++){
		tempArray[j+1] = data[j];
	    }
	    data = tempArray;
	    numItems = numItems+1;
	}
	else {
	    data[pos] = d;
	    for (int i=numItems+1; i>pos; i--){
		data[i] = data[i-1];
	    }
	}
    }
	
public int remove (int pos){
	int output=data[pos];
	for (int i=pos; i<data.length-1;i++){
	    data[i]=data[i+1];
	}
	data[data.length-1]=null;
	numItems=numItems-1;
	return output;
    }

    public int get(int i){
	pos = data[i];
	return pos;
    }
    
    public void set(int i, int d){
	data[i]= data[d];
    }

    public int size(){
	return numItems;
    }
    
    public String toString() {
	String s =Arrays.toString(data)+" --- " +numItems;
	return s;
    }
}
