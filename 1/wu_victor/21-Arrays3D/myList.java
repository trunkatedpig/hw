import java.io.*;
import java.util.*;
public class myList {

    private int[] data;
    private int numItems;
    
    public myList() {
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
	
	data[numItems]=d;
	numItems=numItems+1;
    }

    public void insert(int pos, int d) {
	int[] temp = new int[data.length+1];
	data = temp;
	
	for(int i = data.length-1; i >= pos; i--) {
	    data[i] = data[i-1];
	}

	data[pos] = d;
    }

    public void remove(int pos) {
	int[] temp = new int[data.length-1];

	for(int i = pos; i<data.length-1; i++) {
	    data[i] = data[i+1];
	}

	for(int i = 0; i<temp.length; i++) {
	    temp[i] = data[i];
	}

	data = temp;
    }
    
    public String toString() {
	String s =Arrays.toString(data)+" --- " +numItems;
	return s;
    }
}
