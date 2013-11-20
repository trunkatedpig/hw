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
	int temp = 0;
	for (int i=pos;i<data.length;i++){
	    temp = data[i+1];
	    data[i]=data[temp];
	}
	data[pos]=d;
	System.out.println(data);
    }
}
