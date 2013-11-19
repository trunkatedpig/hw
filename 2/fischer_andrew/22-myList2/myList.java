//Worked in conjunction with partner Sam Kim



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
        int[] tmpArray = new int[data.length + data.length/2];
        for (int i = 0; i < data.length; i++) {
            tmpArray[i] = data[i];
        }
        data = tmpArray;
    }
    
    public void add(int d) {
        if (isFull()){
            grow();
        }
        data[numItems] = d;
        numItems = numItems + 1;
    }
    
    public void insert(int pos, int d) {
        int[] tmpArray = new int[data.length+1];
        for (int i = 0; i < pos; i++) {
            tmpArray[i] = data[i];
        }
        tmpArray[pos] = d;
        for (int j = pos; j < data.length; j++) {
            tmpArray[j+1] = data[j];
        }
        data = tmpArray;
        numItems = numItems + 1;
    }

    public String toString() {
        String s = Arrays.toString(data) + " : " + numItems;
        return s;
    }
    
    public void add(int pos, int d) {
        if (isFull()){
            grow();
        }
        for(int i = numItems + 1; i > pos; i--){
            data[i] = data[i-1];
        }
        data[pos] = d;
        numItems = numItems + 1;
    }
    
    public void remove(int pos){
        data[pos] = 0;
        for(int i = pos; i < numItems; i++){
            data[i] = data[i+1];
        }
        numItems = numItems - 1;
    }

    public void size(){
        System.out.println("Number of items: " + numItems);
    }

    public void get(int pos){
        System.out.println("At position " + pos + " is " + data[pos]);
    }

    public void set(int pos, int d){
        data[pos] = d;
    }
}
