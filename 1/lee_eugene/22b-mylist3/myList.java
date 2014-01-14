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

    public void add(int d) {
	if (isFull()) {
	    grow();
    }

	data[numItems] = d;
	numItems=numItems+1;
    }

    public void add(int pos,int d){
        if (isFull()){
            grow();
        }
        for (int i=numItems;i>=pos;i--){
            if(i==pos){
                data[i] = d;
            }else{
                data[i] = data[i-1];
            }
        }
        numItems++;
    }

    public void remove(int pos){
        for (int i=pos;i<numItems-1;i++){
            data[i]=data[i+1];
        }
        data[numItems-1]=0;
        numItems--;
    }

    public int size(){
        return numItems;
    }
    
    public int get(int pos){
        return data[pos];
    }

    public void set(int pos,int d){
        data[pos] = d;
    }


    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }
    
    public int find(int n){
	for (int i=0;i<data.length;i++){
	    if (data[i]==n){
		return n;
	    }
	}
	return 0;
    }

    public void fremove(int n){
        for (int i=0;i<data.length;i++){
                if (data[i]==n){
                    remove(i);
                    i = data.length;    
            }
        }
    }
}
