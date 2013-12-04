import java.io.*;
import java.util.*;

public class myList {
    
    private int[] data;
    private int numItems;
    
    public myList() {
	Random r = new Random();
	data = new int[5];
	numItems=0;
	for (int i = 0; i < data.length; i++){
	    data[i] = r.nextInt(100);
	}
    }

    public boolean isFull() {
	return numItems >= data.length;
    }

    public void grow() {
	    // "grow" the array by creating a new one and copying over
	    int[] tmpArray = new int[data.length+data.length/2];
	    for (int i=0;i<data.length;i++) 
		tmpArray[i]=data[i];
	    data = tmpArray;
    }

    public void add(int d) {
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

    public void add (int pos, int d){
	int[] b = new int[data.length + 1];
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
	int[] a = new int[data.length - 1];
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

    public int get(int pos){
	return data[pos];
    }

    public int set(int pos, int d){
	data[pos] = d;
	return data[pos];
    }

    private int y;
    public int find(int n){
        y = 0;
	for (int i = 0; i < data.length; i = i + 1){
	    if (data[i] == n)
		return n;
	    y++;
	}
	return -1;
    }

    public void fRemove(int n){
	    int i = find(n);
	    if (i != -1)
		remove(y);
    }

}
