import java.io.*;
import java.util.*;

public class MyList {

    private int[] data;
    private int numItems;
    
    public MyList(){
        data = new int[10];
        numItems = 0;
    }
    
    public void add(int d) {
        if (numItems >= data.length) {
            System.out.println("Growing");
            int[] tmpArray = new int[data.length + data.length/2];
            for (int i = 0; i < data.length; i ++) 
                tmpArray[i] = data[i];
            data = tmpArray;
        }
        
        // then add
        data[numItems] = d;
        numItems = numItems + 1;
    }
    
    public void insert(int pos, int d){
	int[] tempArray = new int[data.length * 3 / 2];
        for (int i = 0; i < pos; i ++){
            tempArray[i] = data[i];
        }
        tempArray[pos] = d;
        for (int j = pos; j < data.length; j ++){
            tempArray[j + 1] = data[pos];
        }
        data = tempArray;
        numItems = numItems + 1;
    }

    public String toString() {
        String s = Arrays.toString(data) + " --- " + numItems;
        return s;
    }
}
