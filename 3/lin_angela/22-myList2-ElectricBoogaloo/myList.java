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


    public String toString(){
	String s = Arrays.toString(data);
	return s;
    }
    ////NOT COMPLETED T_T
    public void add(int pos, int d){
	int index = 0;
	while (pos>=data.length || data.length == numItems){
	    grow();
	}
	int tmpArray[] = new int[data.length+1];
	for (index = index; index<pos;index++){
	    tmpArray[index] = data[index];
	}
	tmpArray[pos] = d;
	index++; 
	for (index=index; index<tmpArray.length;index++){
	    tmpArray[index] = data[index+1];
	}
	data = tmpArray;
	numItems++;
    }

    public int get(int pos){
	return data[pos];
    }

    public int size(){
	return numItems;
    }

   

    


	   


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

    public void remove(int pos){
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
