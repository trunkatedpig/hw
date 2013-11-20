import java.io.*;
import java.util.*;

public class myList{

    private int[] a;
    private Random r;
    private int numitems;
   
    public myList(int length, int range) {
        r = new Random();
        a = new int[length];
        for (int i=0;i<a.length;i++){
            a[i]=r.nextInt(range);
	}
	numitems = a.length;
    }

    public myList(int length) {
        a = new int[length];
	numitems = 0;
    }

    public myList() {
        a = new int[10];
	numitems = 0;
    }

    public boolean isFull() {
	return numitems >= a.length;
    }

    public int get(int n){
        return a[n];
    }

    public int size(){
	return numitems;
    }

    public void set(int pos, int d){
	a[pos]=d;
    }

    public String toString(){
        return Arrays.toString(a);
    }

    public int remove(int pos){
        int result = a[pos];
        int[] b = new int [a.length-1];
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

    public void add(int d) {
	if (isFull()){
	    grow();
	}
        a[numitems]=d;
        numitems = numitems + 1;
    }

    public void add(int pos, int d){
	if (isFull()){
	    grow();
	}
	int x = a[pos];
	int y = 0;
	for (int i = pos; i < numitems; i ++){
	    y = a[i+1];
	    a[i+1] = x;
	    x = y;
	}
	a[pos]=d;
    }
	     
    
    public void grow() {
	    // "grow" the array by creating a new one and copying over
	    int[] tmpArray = new int[a.length+a.length/2];
	    for (int i=0;i<a.length;i++) 
		tmpArray[i]=a[i];
	    a = tmpArray;
    }

    public int find(int n){
	for (int i = 0; i < numitems; i++){
	    if (a[i] == n)
		return a[i];
	}
	return 0;
    }

    public void fremove(int n){
	int pos = -1;
	for (int i = 0; i < numitems && pos < 0; i++){
	    if (a[i] == n){
		pos = i;
	    }
	}
	if (pos >= 0){
	    remove(pos);
	}
	else{
	    System.out.println(n + " not found in the list.");
	}
    }
}
