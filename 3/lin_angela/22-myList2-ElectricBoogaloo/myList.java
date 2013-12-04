import java.util.*;
import java.io.*;

public class myList{

    private int[] data;
    private int numItems;

    public myList(){
	data = new int[5];
	numItems = 0;
    }
    public void grow() {
	    // "grow" the array by creating a new one and copying over
	    int[] tmpArray = new int[data.length+data.length/2];
	    for (int i=0;i<data.length;i++) 
		tmpArray[i]=data[i];
	    data = tmpArray;
    }

    public boolean isFull() {
	return numItems >= data.length;
    }

    public String toString(){
	String s = Arrays.toString(data);
	return s;
    }
 
    public void add(int d){
	if (isFull()){
	    grow();
	}
	data[numItems] = d;
	numItems = numItems +1;
    }

    public void add(int pos, int d){
	while (isFull() || pos >= data.length){
	    grow();
	}
	for (int i = pos; i<=numItems; i++){
	    data[i+1] = data[i];
	}
	data[pos] = d;
	numItems++;
    }

    public int get(int pos){
	return data[pos];
    }

    public int size(){
	return numItems;
    }

    public int find(int n){
	for (int i = 0; i<data.length; i++){ //numItems doesnt work for me if there are 0's in between?
	    if (data[i] == n)
		return n;
	}
	return -1;
    }

    public int fRemove(int n){
	for (int i = 0; i<data.length; i++){
	    if (data[i] ==n){
		remove(i);
		return n;
	    }
	}
	return -1;
    }
    //returns -1 if there is no n in data 

    public void insert(int pos, int d){
	int index=0;
	int tmpArray[] = new int[data.length + data.length/2];
	while (index<pos){
	    tmpArray[index] = data[index];
	    index++;
	}
	tmpArray[index] = d;
	index++;
	for (index=index; index<data.length;index++){
	    tmpArray[index+1] = data[index];
	}
	data = tmpArray;
    }

    public void remove(int pos) {
        for (int i=pos; i< numItems;i++) 
            data[i]=data[i+1];
        numItems--;
    }

    public void remove2(int pos){
	int index = 0;
	int tmpArray[]= new int[data.length - 1];
	while (index<pos){
	    tmpArray[index] = data[index];
	    index++;
	}
	for (index = index+1; index<data.length;index++)
	    tmpArray[index-1] = data[index];
	data = tmpArray;
    }


}
