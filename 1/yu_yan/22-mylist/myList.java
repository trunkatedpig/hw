public class myList{
    int[] array;
    public myList(int n){
	array = new int[n];
	for (int x = 0; x < n; x++){
	    array[x] = x;
	}
    }

    public String toString(){
	String s = new String();
	s = "[";
	for (int x = 0; x < array.length-1; x++){
	    s = s + array[x] + ",";
	}
	s = s + array[array.length-1]+"]";
	return s;
    }

    public void insert(int pos, int d){
	int[] a = new int[array.length + 1];
	for (int c = 0; c < pos; c++){
	    a[c] = array[c];
	}
	a[pos] = d;
	for (int c = pos; c < array.length; c++){
	    a[c+1] = array[c];
	}
	array = a;
    }
    public int remove(int pos){
	int x = array[pos];
	int[] a = new int[array.length - 1];
	for (int c = 0; c < pos; c++){
	    a[c] = array[c];
	}
	for (int c = pos+1; c < array.length; c++){
	    a[c-1] = array[c];
	}
	array = a;
	return x;
    }

}
import java.io.*;
import java.util.*;
public class myList {

    private int[] data;
    private int numItems;
    
    public myList()
    {
	data =new int[10];
	numItems=0;
    }
    
    public boolean isfull() {
	return numItems>=data.length;
    }

    public void grow() {
	int[] tmpArray = new int[data.length+(data.length/2)];
	for (int i=0;i<data.length;i++) 
	    tmpArray[i]=data[i];
	data = tmpArray;
    }

    public void add(int d) {
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

    public void add(int i, int pos) {
	if (isfull()){
	    grow();
	}
	if (pos+1 < data.length) {
	    int k = data[pos];
	    data[pos] = i;
	    for (int j = pos+1; j< data.length; j++) {
		int n = data[j];
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
	data[data.length - 1] = 0;
    }
    
    public int size() {
	return numItems;
    }

    public int get(int pos){
	return data[pos];
    }

    public void set(int pos, int d) {
	data[pos] = d;
    }

    public int find(int n){
	for (int i = 0; i < data.length; i++){
	    if (data[i] == n)
		return n;
	}
	return 0;
    }

    public void fremove(int d){
	boolean cont = true;
	if (find(d) != d)
	    cont = false;
	int i = 0;
	while (cont){
	    if (data[i] == d){
		remove(i);
		cont = false;
	    }
	}
    }
    
}
	
