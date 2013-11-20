import java.io.*;
import java.util.*;

public class myStringList {

       private String[] data;
       private int numItems;

       public myStringList() {
          data = new String[5];
	  numItems = 0;
       }


    public boolean isFull() {
	return numItems >= data.length;
    }

    public void grow() {
	String[] tmpArray = new String[data.length+data.length/2];
	for (int i=0;i<data.length;i++) {
	    tmpArray[i]=data[i];
	}
	data = tmpArray;
    }

    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }

    public void add(String s) {
        if (isFull()) {
            grow();
    }

        data[numItems] = s;
        numItems=numItems+1;
    }

    public String remove(int pos) {
	String result = data[pos];
	for (;pos<numItems-1;pos++)
	    data[pos]=data[pos+1];
	numItems--;
	return result;
    }

    public void add(int pos, String s) {
	if (isFull()) {
	    grow();
	}
	for (int temp = numItems;temp>pos;temp--)
	    data[temp]=data[temp-1];
	data[pos]=s;
	numItems++;
    }

    public String set(int pos, String s) {
	String result = data[pos];
	data[pos]=s;
	return result;
    }
    

    public int size() {
	return numItems;
    }

    public String get(int pos) {
	return data[pos];
    }
    
    public String find(String s) {
	for (int i=0;i<numItems;i++) {
	    if (data[i]==s)
		return data[i];
	}
	return "String not found";
    }
    
    public String fremove(String s) {
	for (int i=0;i<numItems;i++) {
	    if (data[i]==s) {
		String result = data[i];
		remove(i);
		return result;
	    }
	}
	return "String not found";
    }
}