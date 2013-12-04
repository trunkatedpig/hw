import java.io.*;
import java.util.*;
public class myStringList {

    private String[] data;
    private int numItems;
    
    public myStringList()
    {
	data =new String[10];
	numItems=0;
    }
    
    public boolean isfull() {
	return numItems>=data.length;
    }

    public void grow() {
	String[] tmpArray = new String[data.length+(data.length/2)];
	for (int i=0;i<data.length;i++) 
	    tmpArray[i]=data[i];
	data = tmpArray;
    }

    public void add(String d) {
	if (isfull()) {
	    grow();
	}
	data[numItems]=d;
	numItems=numItems+1;
    }
    
    public String toString() {
	String s =Arrays.toString(data)+" --- " +numItems;
	return s;
    }

    public void add(String i, int pos) {
	if (isfull()){
	    grow();
	}
	if (pos+1 < data.length) {
	    String k = data[pos];
	    data[pos] = i;
	    for (int j = pos+1; j< data.length; j++) {
		String n = data[j];
		data[j] = k;
		k = n;
	    }
	}
	else {
	    data[numItems] = i;
	    numItems = numItems + 1;
	}
    }
    
    public void remove(int pos) {
	for (int i = pos; i < data.length-1; i++) {
	    data[i] = data[pos+1];
	    pos++;
	}
	data[data.length - 1] = "0";
    }
    
    public int size() {
	return numItems;
    }

    public String get(int pos){
	return data[pos];
    }

    public void set(int pos, String d) {
	data[pos] = d;
    }

    public String find(String n){
	for (int i = 0; i < data.length; i++){
	    if (data[i].equals(n))
		return n;
	}
	return "None";
    }

    public void fremove(String d){
	boolean cont = true;
	if (!(find(d).equals(d)))
	    cont = false;
	int i = 0;
	while (cont){
	    if (data[i].equals(d)){
		remove(i);
		cont = false;
	    }
	}
    }
    
}
