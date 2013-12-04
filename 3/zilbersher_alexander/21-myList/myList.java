import java.io.*;
import java.util.*;

public class myList {
    private int[] data;
    private int numItems;

    public myList(){
	data = new int[5];
	numItems = 0;
    }

    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }

    public void grow() {
	int[] tempArray = new int[data.length + data.length/2];
	for (int i=0;i<data.length;i++) 
	    tempArray[i] = data[i];
	data = tempArray;
    }

    public boolean isFull() {
	return numItems >= data.length;
    }

    public void add(int d) {
	if (isFull()){
	    grow();
	}
        data[numItems]=d;
        numItems++;
    }

    public void remove(int pos){
	int j = 0;
        int[] temparray = new int[data.length-1];
        for (int i=0;i<data.length;i++){
            if (i != pos) {
                temparray[j] = data[i];
		j++;
	    }
	}
	data = temparray;
	numItems--;
    }

    public void insert(int pos, int i){
	if (pos < data.length) {
	    if (data[pos]==0){
		data[pos] = i;
		numItems++;
	    }else{
		add(0);
		for (int j=data.length-1;j>pos;j--) {
		    data[j] = data[j-1];
		}
		data[pos] = i;
	    }
	} else {
	    add(i);
	}
    }
}