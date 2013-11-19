import java.util.*;
import java.io.*;

public class myList {
    private int[] data;
    private int numItems;

    public myList() {
	data = new int[10];
	numItems = 0;
    }

    public void add(int d) {
	if (numItems >= data.length) {
	    System.out.println("Growing");
	    int[] tmpArray = new int[data.length + (data.length / 2)];
	    for (int i=0; i<data.length; i++)
		tmpArray[i] = data[i];
	    data = tmpArray;
	}

	//then add
	data[numItems] = d;
	numItems++;
    }

    public void insert(int pos, int d) {
	if (pos <= numItems) {
	    add(data[numItems-1]);
	
	    //then shift
	    for (int i=numItems-2; i>pos; i--) {
		data[i] = data[i-1];
	    }
	    data[pos] = d;
	}
	else
	    System.out.println("Position invalid");
    }

    public String toString() {
	String s = Arrays.toString(data) + " --- " + numItems;
	return s;
    }
}
