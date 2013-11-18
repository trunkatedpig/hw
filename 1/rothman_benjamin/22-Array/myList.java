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
    
    public boolean full() {
	return numItems>=data.length;
    }

    public void grow() {
	int[] tmpArray = new int[data.length+(data.length/2)];
	for (int i=0;i<data.length;i++) 
	    tmpArray[i]=data[i];
	data = tmpArray;
    }

    public void add(int d) {
	if (full()) {
	    grow();
	}
	data[numItems]=d;
	numItems=numItems+1;
    }
    
    public String toString() {
	String s =Arrays.toString(data)+" --- " +numItems;
	return s;
    }

    public int get(int n) {
	if (n>=0 && n < a.length) 
	    return a[n];
	else
	    return -1;
    }

    public int set (int i, int d) {
	while (d > numItems) {
	    grow();
	}

	data [i] = d;

    }

    public int size () {
	return numItems;

    }

 //insert int d at int position.
    public void insert (int pos, int d) {
	if (full) {grow();}
	
	for (int i = data.length-1; i > pos; i--) {
	    data [i] = data [i-1];
	}

	data [pos] = d;

    }

}



