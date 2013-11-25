import java.util.*;
import java.io.*;

public class myStringList {
    private String[] data;
    private int numItems;

    public myStringList() {
	data = new String[10];
	numItems = 0;
    }

    public void grow() {
	String[] tmpArray = new String[data.length + (data.length / 2)];
	for (int i=0; i<data.length; i++)
	    tmpArray[i] = data[i];
	data = tmpArray;
    }

    public boolean valid(int pos) {
	if (pos < numItems)
	    return true;
	else {
	    System.out.println("Invalid Position");
	    return false;
	}
    }

    public String find(String d) {
	for (int i=0; i<numItems; i++) {
	    if (data[i] == d)
		return d;
	}
	return ""; //Not sure what value to return, as d can be any String
    }

    public void add(String d) {
	if (numItems >= data.length)
	    grow();

	//then add
	data[numItems] = d;
	numItems++;
    }

    public void add(int pos, String d) {
	if (pos <= numItems) {
	    add(data[numItems-1]);
	
	    //then shift
	    for (int i=numItems-2; i>pos; i--) {
		data[i] = data[i-1];
	    }
	    data[pos] = d;
	}
	else
	    System.out.println("Invalid position");
    }

    public void remove(int pos) {
	if (valid(pos)) {
	    for (int i=pos; i<numItems-1; i++) 
		data[i] = data[i+1];
	    
	    data[numItems-1] = "";
	    numItems--;
	}
    }

    public void fremove(String d) {
	for (int i=0; i<numItems; i++) {
	    if (data[i] == d) {
		remove(i);
		break;
	    }
	}
    }

    public int size() {
	return numItems;
    }

    public String get(int pos) {
	if (valid(pos))
	    return data[pos];
	else
	    return ""; //Same problem here
    }

    public void set(int pos, String d) {
	if (valid(pos))
	    data[pos] = d;
    }

    public String toString() {
	String s = Arrays.toString(data) + " --- " + numItems;
	return s;
    }
}
