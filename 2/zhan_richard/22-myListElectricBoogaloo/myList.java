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
	for (int i = 0; i<data.length;i++)
	    tmpArray[i]=data[i];
	data = tmpArray;
    }

    public void add(int d) {
	
        if (isFull())
	    grow();
        data[numItems]=d;
        numItems = numItems + 1;
    }
    
    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }
    public void add(int pos, int d){

        if (data.length>numItems){
            for (int i = numItems;i > pos;i--)
                data[i]=data[i-1];
            data[pos]=d;
        }
        else{
            int b = 0;
            int[] result = new int[data.length+1];
            for (int a=0; a < data.length;a++){
                if (b==pos){
                    result[b]=d;
                    b++;
                }
            
                result[b]=data[a];
                b++;
            }
            data=result;
        }
        numItems = numItems+1;
    }
    public int remove(int pos){
	int toBeReturned = data[pos];
        for (int i = pos;i<numItems;i++){
	    if (i==numItems-1)
		data[i]=0;
	    else
		data[i]=data[i+1];
	}
	numItems=numItems-1;
	return toBeReturned;
    }
    public int size(){
	return numItems;
    }
    public int get(int pos){
	return data[pos];
    }
    public int set(int pos, int d){
	data[pos]=d;
	return d;
    }
	
}
