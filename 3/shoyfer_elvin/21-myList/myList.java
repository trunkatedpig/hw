import java.io.*;
import java.util.*;

public class myList {
   private int[] data;
   private int numItems;
   private Random r1 = new Random();

   public myList() {
      	data = new int[5];
		numItems = 0;
   }

   public void fill() {
   		
   		for(int i = 0; i < data.length; i++) {
   			int thisElement = r1.nextInt(50);
   			data[i] = thisElement;
   		}
   		numItems = data.length;
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


    public String toString() {
        String s = Arrays.toString(data)+" : "+numItems;
        return s;
    }

    public void insert(int pos, int d) {
    	int[] newArray = new int[data.length + 1];
    	int j = 0; // offset of index
    	for(int i = 0; i < data.length; i++) { // i is in terms of position in data, not newArray
    		if ((!(i == pos)) || ((j == 1) && (i == pos))) { // If we haven't arrived at the position of insertion yet OR to re-allign immediately following the shift in assignment once insertion was completed
    			newArray[i+j] = data[i];
    		}
    		if ((j != 1) && (i == pos)) {
    			newArray[i] = d;
    			j = 1; // position in newArray is now 1 greater than position in data; j represents offset 
    			i--; // this all occurs in terms of position in data; without doing i--, we will have skipped an element in data 
    		}

    	}
    	numItems = numItems + 1;
    	data = newArray;

	}

	public int remove(int pos) {
		int[] newArray = new int[data.length - 1];
		int removedNum = 0;
		int j = 0; // offset of index
		for(int i = 0; i < data.length; i++) {
			if (!(i == pos)) {
				newArray[i+j] = data[i];
			} 

			if ((j != -1) && (i == pos)) {
				removedNum = data[i];
				j = -1; // offset parallel assignment of data and newArray by 1 (data leads)
			}
		}
		data = newArray;
		numItems = numItems - 1;
		return removedNum;
	}

}