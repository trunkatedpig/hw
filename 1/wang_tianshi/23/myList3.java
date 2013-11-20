import java.io.*;
import java.util.*;
public class myList3{

    private int[] data;
    private int numItems;
    private String[] sdata;
    
    public myList3(){
	data = new int[10];
	numItems=0;
    }
    
    public void add(int d) {
	if (numItems>=data.length) {
	    System.out.println("Growing");
	    int[] tempArray = new int[data.length+(data.length/2)];
	    for (int i=0;i<data.length;i++) 
		tempArray[i]=data[i];
	    data = tempArray;
	}

	data[numItems]=d;
	numItems=numItems+1;
    }
    
    public void add(int pos, int d){

    }	

    public String toString() {
	String s =Arrays.toString(data)+" --- " +numItems;
	return s;
    }

    public int find(int d){
	for (int i=0;i<data.length;i++) {
	    if (data[i]==d){
		return data[i];
	    }
	}
	return -1;
    }

   public void remove(int pos) {
        for (int i = pos; i<numItems-1;i++){
	    data[i]=data[i+1];
	}
	set(numItems-1,0);
	numItems--;
    }

    public int size() {
	return numItems;
    }

    public int get(int pos) {
	return data[pos];
    }

    public void set(int pos, int d) {
        data[pos]=d;
    }
    

    public void fremove(int d){
	for (int i=0;i<data.length;i++) {
	    if (data[i]==d){
		remove (i);
		i=data.length;
	    }
	    else if (i==data.length-1){
		System.out.println(d + " is not in the array.");
	    }
	}
    }

    public String[] convert(){
	sdata= new String[data.length];
	for (int i=0; i<data.length; i++){
	    sdata[i]=""+data[i];
	}
	return sdata;

    }
}