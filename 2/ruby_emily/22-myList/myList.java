import java.io.*;
import java.util.*;

public class myList{
    private int[] data;
    private int numItems;
    
    public myList() {
        data = new int[5];
	numItems=0;
	Random r=new Random();
	for (int i= 0; i<data.length;i++){
	    data[i]=r.nextInt(10);
	    numItems=numItems+1;
	}
    }

    public boolean isFull() {
	return numItems >= data.length;
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
	numItems=numItems + 1;
	System.out.println(data);
    }

    public void remove(int pos){
	int i;
	for (i=pos;i<data.length-1;i++){
	    data[i]=data[i+1];
	}
	data[data.length-1]=0;
	numItems=numItems + 1;
	System.out.println(data);
    }

    public int find(int n){
	int result=-1;
	for(int i=0;i<data.length;i++){
	    if (data[i]==n){
		result= n;
	    }
	}
	return result;
    }

    public void fremove(int n){
	for (int i=0;i<data.length;i++){
	    if (data[i]==n){
		remove(n);
	    }
	}
	System.out.println(data);
    }

    public int size(){
	return numItems;
    }

    public int get(int pos){
	return data[pos];
    }

    public void set(int pos, int d){
	data[pos]=d;
    }

    public String toString() {
        String s = Arrays.toString(data)+" : "+numItems;
        return s;
    }
}

