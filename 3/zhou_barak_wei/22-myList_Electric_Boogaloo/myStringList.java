import java.util.*;

public class myStringList {
    private String[] data;
    private int numItems;
    
    public myStringList() {
	data = new String[5];
	numItems=0;
    }

    public boolean isFull() {
	return numItems >= data.length;
    }

    public void grow() {
	// "grow" the array by creating a new one and copying over
	String[] tmpArray = new String[data.length+data.length/2];
	for (int i=0;i<data.length;i++) 
	    tmpArray[i]=data[i];
	data = tmpArray;
    }

    public void add(String d) {
	if (isFull()){
	    grow();
	}
        data[numItems]=d;
        numItems = numItems + 1;
    }
    
    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }
	
    public void add(int pos, String d) {
	// to be completed by you
	// inserts the value d at location (index) pos)
	// recall the algorithm we developed in calss:
	// 1. Grow if needed
	// 2. shift everything past the insertion point down
	// 3. add the new item
	// 4. numitems++
	String[] retArray = new String[data.length+1];
	for (int i=0; i<pos; i++){
	    retArray[i] = data[i];
	}
	for (int i=pos; i<data.length; i++) {
	    retArray[i+1] = data[i];
	}
	retArray[pos] = d;
	data = retArray;
	numItems++;
    }

    public void remove(int pos) {
	// removes the item at location pos
	// 1. shift everything down to remove the item
	// 2. numitems--;
	String[] retArray = new String[data.length-1];
	for (int i=0; i<pos; i++)
	    retArray[i] = data[i];
	for (int i=pos+1; i<data.length; i++)
	    retArray[i-1] = data[i];
	data = retArray;
	numItems--;
    }
    public int size() {
	// return the number of items in the list
	return data.length;
    }
    public String get(int pos) {
	//return the item at pos;
	return data[pos];
    }
    public void set(int pos, String d) {
	// change the item at pos to have the value d
	data[pos] = d;
    }
    public String find(String n) {
	for (int i=0; i<numItems; i++) {
	    if (data[i]==n) {return data[i];}
	}
	return "nope";
    }
    public String fremove(String n) {
	for (int i=0; i<numItems; i++) {
	    if (data[i]==n) {
		remove(i);
		return n;
	    }
	}
	return "nope";
    }
}
