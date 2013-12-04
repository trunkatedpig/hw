import java.io.*;
import java.util.*;

public class myStringList{

    private String[] data;
    private int numItems;
    
    public myStringList() {
	data = new String[5];
	numItems=0;
	for (int i = 0; i < data.length; i++){
	    data[i] =randString();
	}
    }

    public String randString(){
	Random r = new Random();
	if (r.nextInt(3)%2 ==0){
	    return "C";
	} else{
	    return "G";
	}
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
        data[numItems] = d;
        numItems = numItems + 1;
    }

     public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }

    public void add (int pos, String d){
	String[] b = new String[data.length + 1];
	for (int i = 0; i < pos; i++){
	    b[i] = data[i];
	}
	b[pos] = d;
	for (int x = pos + 1;  x < b.length; x++){
	    b[x] = data[x-1];
	}
	data = b;
	numItems++;
    }

    public void remove(int pos){
	String[] a = new String[data.length - 1];
	for (int i = 0; i < pos; i++){
	    a[i] = data[i];
	}
	for (int p = pos + 1; p < data.length; p++){
	    a[p-1] = data[p];
	}
	data = a;
	numItems--;
    }

    public int size(){
	return numItems;
    }

    public String get(int pos){
	return data[pos];
    }

    public String set(int pos, String d){
	data[pos] = d;
	return data[pos];
    }

    private int y;
    public String find(String n){
        y = 0;
	for (int i = 0; i < data.length; i = i + 1){
	    if (data[i].equals(n))
		return n;
	    y++;
	}
	return "No";
    }

    public void fRemove(String n){
	    String i = find(n);
	    remove(y);
    }



}
