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
    
    public String toString() {
	String s =Arrays.toString(data)+" --- " +numItems;
	return s;
    }


    //insert int d at int position.
    public void insert (int pos, int d) {
	for (int i = data.length-1; i > pos -1; i--) {
	    data [i] = data [i-1];
	}

	data [pos-1] = d;

    }
}
