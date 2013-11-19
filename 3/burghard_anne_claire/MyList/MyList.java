import java.io.*;
import java.util.*;

public class MyList {
    private int[] a;
    private Random r;
    private int numItems;
    
    public MyList() {
        r = new Random();
        a = new int[20];
        for (int i=0;i<a.length;i++)
            a[i]=r.nextInt(100);
	numItems = a.length;
    }

      public String toString() {
        return Arrays.toString(a);
    }

    public int remove(int pos) {
	int answer = a[pos];
	for (int i = pos; i < a.length-1; i++) {
	    a[i] = a[i+1];
	}
	int[] temp = new int[a.length-1];
	for (int i = 0; i < temp.length; i++) {
	    temp[i] = a[i];
	}
	a = temp;
	numItems = numItems + 1;
	return answer;
    }

    public boolean isFull() {
	return numItems >= a.length;
    }

    public void grow() {
	    // "grow" the array by creating a new one and copying over
	    int[] tmpArray = new int[a.length+a.length/2];
	    for (int i=0;i<a.length;i++) 
		tmpArray[i]=a[i];
	    a = tmpArray;
    }

    public void add(int d) {
	if (isFull()){
	    grow();
	}
        a[numItems]=d;
        numItems = numItems + 1;
    }
    
	
    public void add(int pos, int d) {
	if (isFull()) {
	    grow();
	}
	for (int i = a.length-1; i > pos; i--) {
	    a[i] = a[i-1];
	}
	a[pos] = d;
	numItems = numItems + 1;
	}

	public int size() {
	    return a.length;
	}
	public int get(int pos) {
	    return a[pos];
	}
	public void set(int pos, int d) {
	    a[pos] = d;
	}
} 
