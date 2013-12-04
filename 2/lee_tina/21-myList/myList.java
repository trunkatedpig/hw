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

    public void insert(int pos, int d){
	int dataInd = 0;
	int[] temp;
	if (pos > data.length)
	    temp = new int[pos + 1];
	else
	    temp = new int[data.length + 1];
	for (int tempInd = 0; tempInd < temp.length; tempInd++){
	    if (tempInd == pos){
		temp[tempInd] = d;
	    }
	    else if (dataInd < data.length){
		temp[tempInd] = data[dataInd];
		dataInd = dataInd + 1;
	    }
	}
	data = temp;
    }
	
}
