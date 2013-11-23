import java.io.*;
import java.util.*;

public class myList {

       private int[] data;
       private int numItems;

       public myList() {
          data = new int[5];
         numItems = 0;
       }


    public boolean isFull() {
        return numItems >= data.length;
    }

    public void grow() {
        int[] tmpArray = new int[data.length+data.length/2];
        for (int i=0;i<data.length;i++) {
         tmpArray[i]=data[i];
        }
        data = tmpArray;
    }

    public String toString() {
        String s = Arrays.toString(data)+" : "+numItems;
        return s;
    }

    public void add(int d) {
        if (isFull()) {
            grow();
    }

        data[numItems] = d;
        numItems=numItems+1;
    }

    public int remove(int pos) {
        int result = data[pos];
        for (;pos<numItems-1;pos++)
         data[pos]=data[pos+1];
        numItems--;
        return result;
    }

    public void add(int pos, int d) {
        if (isFull()) {
         grow();
        }
        for (int temp = numItems;temp>pos;temp--)
         data[temp]=data[temp-1];
        data[pos]=d;
        numItems++;
    }

    public int set(int pos, int d) {
        int result = data[pos];
        data[pos]=d;
        return result;
    }
    

    public int size() {
        return numItems;
    }
    public int get(int pos) {
        return data[pos];
    }

    public int find(int n){
	for (int i = 0; i < data.length; i++)
	    if (data[i] == n)
		return n;
	return 0;
    }

    public int fremove(int n){
	for (int i = 0; i < data.length; i++)
	    if (data[i] == n){
		remove(i);
		return n;
	    }
	return 0;
    }
}