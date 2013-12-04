import java.io.*;
import java.util.*;

public class myStringList{

    private String[] a;
    private Random r;
    private int numitems;
   
    public myStringList(int length) {
        a = new String[length];
	numitems = 0;
    }

    public myStringList() {
        a = new String[10];
	numitems = 0;
    }

    public boolean isFull() {
	return numitems >= a.length;
    }

    public String get(int n){
        return a[n];
    }

    public int size(){
	return numitems;
    }

    public void set(int pos, String s){
	a[pos]=s;
    }

    public String toString(){
        return Arrays.toString(a);
    }

    public String remove(int pos){
        String result = a[pos];
        String[] b = new String [a.length-1];
        for (int i = 0; i < pos; i ++){
            b[i]=a[i];
        }
        for (int i = pos; i < b.length; i ++){
            b[i]=a[i+1];
        }
        a = b;
	numitems = numitems - 1;
        return result;
    }

    public void add(String s) {
	if (isFull()){
	    grow();
	}
        a[numitems]=s;
        numitems = numitems + 1;
    }

    public void add(int pos, String s){
	if (isFull()){
	    grow();
	}
	String x = a[pos];
	String y = "";
	for (int i = pos; i < numitems; i ++){
	    y = a[i+1];
	    a[i+1] = x;
	    x = y;
	}
	a[pos]=s;
    }
	     
    
    public void grow() {
	    // "grow" the array by creating a new one and copying over
	    String[] tmpArray = new String[a.length+a.length/2];
	    for (int i=0;i<a.length;i++) 
		tmpArray[i]=a[i];
	    a = tmpArray;
    }

    public String find(String s){
	for (int i = 0; i < numitems; i++){
	    if (a[i] == s)
		return a[i];
	}
	return "Not in the list";
    }

    public void fremove(String s){
	int pos = -1;
	for (int i = 0; i < numitems && pos < 0; i++){
	    if (a[i] == s){
		pos = i;
	    }
	}
	if (pos >= 0){
	    remove(pos);
	}
	else{
	    System.out.println(s + " not found in the list.");
	}
    }
}
