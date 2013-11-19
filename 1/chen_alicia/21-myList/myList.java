import java.io.*;
import java.util.*;
public class myList {

    private int[] data;
    private int numItems;
    
    public myList()
    {
        data =new int[10];
        numItems=0;
    }
    
    public void add(int d) {

        if (numItems>=data.length) {
            System.out.println("Growing");
            int[] tmpArray = new int[data.length+(data.length/2)];
            for (int i=0;i<data.length;i++) 
                tmpArray[i]=data[i];
            data = tmpArray;
        }
        // then add
        data[numItems]=d;
        numItems=numItems+1;
    }
    
    public void insert(int pos, int d) {
	// inserts data item d at location pos in the data array
	// remember we have to shift down items to make room and
	// we might have to grow the array

	int[] result = new int[data.length+1];
	for (int i =0; i <pos; i++){
	    result[i] = data[i];
	}
        result[pos] = d;
	for (int i = pos + 1; i <data.length; i++){
	    result[i] = data[i-1];
	}
	data = result;
	numItems = numItems+1;
    }

    public String toString() {
	String s =Arrays.toString(data)+" --- " +numItems;
	return s;
    }
}
