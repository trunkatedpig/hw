import java.io.*;
import java.util.*;

public class myStringList {
       private String[] data;
       private int numItems;

       public myStringList() {
          data = new String[5];
	  numItems = 0;
       }


    public boolean isFull() {
	return numItems >= data.length;
    }

    public void grow() {
	String[] tmpArray = new String[data.length+data.length/2];
	for (int i=0;i<data.length;i++) {
	    tmpArray[i]=data[i];
	}
	data = tmpArray;
    }

    public void add(String s) {
	if (isFull()) {
	    grow();
    }

	data[numItems] = s;
	numItems=numItems+1;
    }

    public void add(int pos,String s){
        if (isFull()){
            grow();
        }
        for (int i=numItems;i>=pos;i--){
            if(i==pos){
                data[i] = s;
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
        data[numItems-1]="null";
        numItems--;
    }

    public int size(){
        return data.length;
    }
    
    public String get(int pos){
        return data[pos];
    }

    public void set(int pos,String s){
        data[pos] = s;
    }


    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }
    
    public String find(String s){
	for (int i=0;i<data.length;i++){
	    if (data[i]==s){
		return s;
	    }
	}
	return "Not here";
    }

    public void fremove(String s){
        for (int i=0;i<data.length;i++){
                if (data[i]==s){
                    remove(i);
                    i = data.length;    
            }
        }
    }
}
