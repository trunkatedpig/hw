import java.io.*;
import java.util.*;

public class myList {
    private int[] data;
    private int numItems;

    public myList(){
	data = new int[15];
	Random r = new Random();
	for (int i=0;i<data.length;i++){
            data[i]=r.nextInt(100);
	}
        numItems = data.length;
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

    public void add(int pos, int i){
	if (isFull()){
	    grow();
	}
	for (int j=data.length-1;j>pos;j--) {
	    data[j] = data[j-1];
        }
        data[pos] = i;
        numItems++;
    }


    public int size() {
	return numItems;
    }

    public int get(int pos) {
	return data[pos];
    }
    
    public void set(int pos, int i) {
	data[pos] = i;
    }

    public int find(int i){
	for (int j=0;j<data.length-1;j++) {
	    if (data[j] == i) {
		return i;
	    }
	}
	return 0;
    }

    public void fremove(int i){
	for (int j=0;j<data.length-1;j++) {
	    if (data[j] == i) {
		remove(j);
		break;
	    }
	}
    }
}
