import java.io.*;
import java.util.*;

//When I wrote this code, only God and I knew what I was doing.
//Now, only God knows.

public class myStringList {
    private String[] data;
    private int numItems;
    
    public myList() {
	data = new String[5];
	numItems = 0;
    }

    public String makeRandomStrings() {
	Random r = new Random();
	String stupidreturnstatement;
	if (r.nextInt(100)%2 == 0)
	    stupidreturnstatement = "voleum";
	else
	    stupidreturnstatement = "idunnomybffjill";
	return stupidreturnstatement;
    }

    public boolean isFull() {
	return (numItems >= data.length);
    }

    public void grow() {
	if (isFull()) {
	    System.out.println("Increasing array size from "+data.length+" to "+data.length*3/2+".");
	    String[] tmpArray = new String[data.length*3/2];
	    for (int i=0;i<data.length;i++) 
		tmpArray[i] = data[i];
	    data = tmpArray;
	}
    }

    public int size() {
	return numItems;
    }

    public void set(int pos, String s) {
	if (pos > numItems) {
	    data[numItems] = d;
	    System.out.println("Index exceeded array size.  Value (s) added to end of array.");
	}
	else
	    data[pos] = d;
    }

    public int get(int pos){
	if (pos >= data.length)
	    return -1;
	return data[pos];
    }

    public void add(String s) {
        grow();
        data[numItems] = d;
        numItems++;
    }

    public void add(int pos, String s) {
	grow();
        if (pos < numItems) {
	    for (int i = numItems; i >= pos; i--)
		set(i, data[i-1]);
	}
	set(pos, s);
	numItems++;
    }

    public void remove(int pos) {
        grow();
	for (int i = pos; i < numItems; i++)
	    set(i, data[i+1]);
	numItems--;
    }

    /* less efficient--but still functional--remove method

    public void remove1(int pos){
	int[] temp = new int[data.length-1];
	for (int i=0; i<temp.length; i++) {
	    if (i<pos)
		temp[i] = data[i];
	    else
		temp[i] = data[i+1];
	}
	data = temp;
	numItems--;
    }

    */

    public String find(String s) {
	for (int i = 0; i < numItems; i++) {
	    if data[i].equals(s)
		       return data[i];
	}
	return "null";
    }

    public void fRemove(String s) {
	if (find(s).equals("null"))
	    System.out.println("Error: Out of Bounds");
	remove(find(s));
    }
    
    public String toString() {
	String s = Arrays.toString(data)+" -- Data Set Size: "+size();
	return s;
    }
	
}
