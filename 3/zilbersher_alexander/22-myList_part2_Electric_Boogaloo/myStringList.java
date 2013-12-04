import java.io.*;
import java.util.*;

public class myStringList {
    private String[] data;
    private int numItems;

    public myStringList(){
	data = new String[15];
        numItems = 0;
    }

    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }

    public void grow() {
	String[] tempArray = new String[data.length + data.length/2];
	for (int i=0;i<data.length;i++) 
	    tempArray[i] = data[i];
	data = tempArray;
    }

    public boolean isFull() {
	return numItems >= data.length;
    }

    public void add(String s) {
	if (isFull()){
	    grow();
	}
        data[numItems]=s;
        numItems++;
    }

    public void remove(int pos){
	if (data[pos] != null) {
	    numItems--;
	}
	int j = 0;
        String[] temparray = new String[data.length-1];
        for (int i=0;i<data.length;i++){
            if (i != pos) {
                temparray[j] = data[i];
		j++;
	    }
	}
	data = temparray;
    }

    public void add(int pos, String s){
	if (isFull()){
	    grow();
	}
	for (int j=data.length-1;j>pos;j--) {
	    data[j] = data[j-1];
        }
        data[pos] = s;
        numItems++;
    }


    public int size() {
	return numItems;
    }

    public String get(int pos) {
	return data[pos];
    }
    
    public void set(int pos, String s) {
	data[pos] = s;
    }

    public String find(String s){
	for (int j=0;j<data.length-1;j++) {
	    if (data[j] == s) {
		return s;
	    }
	}
	return "None";
    }

    public void fremove(String s){
	for (int j=0;j<data.length-1;j++) {
	    if (data[j] == s) {
		remove(j);
		break;
	    }
	}
    }
}
