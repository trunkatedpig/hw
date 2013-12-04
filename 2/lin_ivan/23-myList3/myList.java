import java.io.*;
import java.util.*;

public class myList {
    private int[] data;
    private int numItems;
    
    public myList() {
        data = new int[5];
        numItems=0;
    }

    public boolean isFull() {
        return numItems >= data.length;
    }

    public void grow() {
            // "grow" the array by creating a new one and copying over
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
    
    public String toString() {
        String s = Arrays.toString(data)+" : "+numItems;
        return s;
    }
        
    public void insert(int pos, int d) {
        if (numItems < data.length){
            for (int i= numItems; i>=pos; i--){
                data[i+1] = data[i];
            }
            data[pos] = d;
            numItems++;
        }
        else{
            int[] temp = new int[data.length+1];
            int i;
            for (i = 0; i<pos; i++){
                temp[i] = data[i];
            }
            temp[pos] = d;
            for (int k = i; k< data.length; k++){
                temp[k+1] = data[k];
            }
            data = temp;
            numItems++;
        }
    }

    public void remove(int pos){
        int[] temp = new int[data.length];
        int i;
        for (i = 0; i<pos; i++){
            temp[i] = data[i];
        }
        for (int k=i+1; k<data.length; k++){
            temp[k-1] = data[k];
        }
        data = temp;
        numItems--;
    }

    public int size() {
        return numItems;
    }
    public int get(int pos) {
        return data[pos];
    }
    public void set(int pos, int d) {
        if (pos < numItems) {
            data[pos] = d;
        }
        else{
            add(d);
        }
    }
    public int find(int n){
        for (int i = 0; i<data.length; i++){
            if (data[i] == n){
                return data[i];
            }
        }
        return 0;
    }
    public void fremove(int n){
        for (int i = 0; i<data.length; i++){
            if (data[i] == n){
                remove(i);
                break;
            }
        }
    }
            
}