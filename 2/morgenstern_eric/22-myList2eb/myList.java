import java.io.*;
import java.util.*;

public class myList {
    private int[] data;
    private int numItems;
    
    public myList() {
	data = new int[5];
	numItems=0;
    }
    public boolean isFull(){
	return numItems >= data.length;
    }
    public void grow(){
	int[] tmpArray = new int[data.length+data.length/2];
	for(int i=0;i<data.length;i++)
	    tmpArray[i]=data[i];
	data = tmpArray;
    }
    public void setData(int a,int b,int c,int d,int e){
	data[0]=a;
	data[1]=b;
	data[2]=c;
	data[3]=d;
	data[4]=e;
    }
    public void add(int d) {
	if (isFull()){
	    grow();
	}
	data[numItems]=d;
	numItems=numItems+1;
    }
    
    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }
    public void add(int val,int pos){
	int[] a = new int[data.length+1];
        for(int i = 0;i<pos;i++){
            a[i] = data[i];
        }
        a[pos] = val;
        for(int i = pos+1;i<a.length;i++){
            a[i] = data[i-1];
        }
        data = a;
	numItems++;
    }
    public void add2(int val,int pos){
	if(isFull())
	    grow();
	for(int i = numItems+1;i>pos;i--){
	    data[i]=data[i-1];
	}
	data[pos]=val;
	numItems++;
    }
    public void remove(int pos){
	data[pos]=0;
	for(int i=pos;i<numItems;i++){
	    data[i]=data[i+1];
	}
	numItems--;
    }
    public int size(){
	return numItems;
    }
    public int get(int pos){
	return data[pos];
    }
    public void set(int pos,int d){
	data[pos]=d;
    }
}
