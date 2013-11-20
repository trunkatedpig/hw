import java.io.*;
import java.util.*;

public class myList {
    private int[] data;
    private int numItems;
    
    public myList() {
        data = new int[5];
        numItems=0;
    }

    public void add(int d) {
        if (numItems>=data.length) {
            int[] tmpArray = new int[data.length+data.length/2];
            for (int i=0;i<data.length;i++) 
                tmpArray[i]=data[i];
            data = tmpArray;
        }
        data[numItems]=d;
        numItems = numItems + 1;
    }
    
    public String toString() {
        String s = Arrays.toString(data);
        return s;
    }

    public void insert(int pos, int d) {
        int[] newList;
        newList = new int[data.length+1];
        for (int i=0; i<pos; i++) {
                newList[i] = data[i];
        }
        newList[pos] = d;
        for (int i=pos; i<(data.length); i++) {
            newList[i+1] = data[i];
        }
        data = newList;
    }
}
