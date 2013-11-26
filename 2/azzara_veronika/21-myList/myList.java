import java.io.*;
import java.util.*;

public class myList{
    private int[] data;
    private int numItems;
    
    public myList() {
	Random r=new Random();
        data = new int[5];
        numItems=0;
    }

    public boolean isFull() {
        return numItems >= data.length;
    }
  
    public String toString() {
        String s = Arrays.toString(data)+" : "+numItems;
        return s;
    }

    public void grow() {
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
    
    public void insert(int pos, int d){
	int i;
	int[] tmpArray=new int[data.length+1];
	for (i=0;i<pos;i++){
	    tmpArray[i]=data[i];
	}
	tmpArray[pos]=d;
	for (i=pos+1;i<tmpArray.length;i++){
	    tmpArray[i]=data[i-1];
	}
	data=tmpArray;
	System.out.println(data);
	numItems=numItems + 1;
    }

    public void insert2(int pos, int d){
	if (data[data.length-1]!=0)
	    data.grow();
	int temp = 0;
	int i = data.length-1;
	while (temp==0){
	    temp = data[i];
	    i--;
	}
	for (int j=temp;j>pos;j--){
	    data[j+1]=data[j];
	}
	data[pos]=d;
	numItems++;
	System.out.println(data);
    }

    public void remove(int pos) {
	for (int i=pos;i<data.length;i++){
	    if (i==data.length-1)
		data[i]=0;
	    data[i]=data[i+1];
	}
	numItems--;
	System.out.println(data);
    }
    
    public int size() {
	return data.length;
    }

    public int get(int pos) {
        return data[pos];
    }

    public void set(int pos, int d) {
	data[pos]=d;
	System.out.println(data);
    }

      public int find(int n) {
	for (int i=0; i<numItems; i++) {
	    if (data[i] == n)
		return data[i];
	}
	return -1;
    }

    public boolean in(int n) {
	for (int i=0; i<numItems; i++) {
	    if (data[i] == n)
		return true;
	}
	return false;
    }

    public void fremove(int n) {
	if (in(n)) {
	    int firstIndex=0;
	    while (data[firstIndex]!=n) {
		firstIndex = firstIndex +1;
	    }
	    remove(firstIndex);
	}
	else
	    System.out.println("Sorry, that is not in the list.");
    }
}
