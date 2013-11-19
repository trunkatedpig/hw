import java.util.*;
import java.io.*;

public class myList{

    private int[] data;
    private int numItems;

    public myList(){
	data = new int[5];
	numItems = 0;
    }


    public String toString(){
	String s = Arrays.toString(data);
	return s;
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
