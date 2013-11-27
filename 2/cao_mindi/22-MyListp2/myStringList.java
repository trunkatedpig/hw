import java.io.*;
import java.util.*;

public class myStringList {
    private String[] data;
    private int numItems;
    private String[] tmp;
    
    public myStringList() {
	data = new String[5];
	numItems=0;
    }

    public boolean isFull() {
	return numItems >= data.length;
    }

    public void grow() {
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
	if (isFull()){
	    grow();
	    tmp = data;
	    for (int i = pos + 1; i < tmp.length; i ++){
		tmp[i] = data[i - 1];
	    }
	    tmp[pos] = d;
	    numItems ++;
	}
	else{
	    for (int i = pos + 1; i < tmp.length; i ++){
		tmp[i] = data[i - 1];
	    }
	    tmp[pos] = d;
	     numItems ++;
	}
    }
	
    public void remove(int pos) {
	tmp = data;
	for(int i = pos; i < data.length - 1; i ++){
	    tmp[i] = data[i + 1];
		}
	numItems --;
    }

    public String find(String d){
	for (int i = 0; i < data.length; i ++){
	    if (data[i] == d){
		i = data.length;
		return d;
	    }
	    return "";
	    }
	return "";
 }

    public void fremove(String d){
	for (int i = 0; i < data.length; i ++){
	    if (data[i] == d){
	    remove(i);
	    i = data.length;
	}
    }
    }

	public int size() {
	    return numItems;
	}
	public String get(int pos) {
	    return data[pos];
	}
	public void set(int pos, String d) {
	    data[pos] = d;
	}
}
