import java.io.*;
import java.util.*;
public class myList {

    private String[] data;
    private int numItems;

    public myList()
    {
        data =new String[10];
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

    public void add(String d) {
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
        if (n>=0 && n < data.length)
            return data[n];
        else
            return -1;
    }

    public void set (int i, String d) {
        while (data.indexOf(d) > numItems) {
            grow();
        }

        data [i] = d;

    }

    public int size () {
        return numItems;

    }

    public void add (int pos, int d) {
        if (full()) {grow();}

        for (int i = data.length-1; i > pos; i--) {
            data [i] = data [i-1];
        }

        data [pos] = d;
	numItems = numItems + 1;
    }

    public void remove (int pos) {
	for (int i = pos; i<numItems; i++) {
	    data[i] = data[i + 1];
	}
	set(numItems, 0);
	numItems = numItems - 1;
    }

    public int find (String d) {
	for (int i = 0; i < numItems; i++) {
	    if (data[i] == d){
	    return d;
	    }
	}
	return data[numItems];
    }

    public void fremove (String d) {
	int p = data.indexOf(d);
	if (p != -1) {
	    remove(p);
	}
    }
}
