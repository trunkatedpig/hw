import java.io.*;
import java.util.*;

public class myList {
	private int[] data;
    private int numItems;

    public myList() {
		data = new int[5];
	 	numItems = 0;
    }

//Checks if the int Array is full using numItems
    public boolean isFull() {
		return numItems >= data.length;
    }

/*Expands the length of the array by creating a new larger array and then
copying it over. The length of the array increases by 1.5 */
    public void grow() {
		int[] tmpArray = new int[data.length+data.length/2];
		for (int i=0;i<data.length;i++) {
		    tmpArray[i]=data[i];
		}
		data = tmpArray;
    }

/* Adds an interger d to the end of the array. If the array is full, it
first grows the array and then adds */
    public void add(int d) {
		if (isFull())
	  	  grow();
		data[numItems] = d;
		numItems=numItems+1;
    }

/* Inserts data item d at location pos in the data array. Remember to
shift down items and that the array might need to grow */
	public void insert(int pos, int d){
		if (isFull())
	  	  grow();
		int[] tmpArray = new int[data.length];
		for (int i = 0; i<data.length; i++){
			if(i<pos)
				tmpArray[i] = data[i];
			else if (i == pos)
				tmpArray[i] = d;
			else
				tmpArray[i] = data[i-1];
		}
		data = tmpArray;
		numItems = numItems+1;
	}

/* Removes the data item at location pos from the array data
Decreases the length of Array by 1.*/
	public int remove(int pos) {
		int removed = 0;
		removed = data[pos];
		int [] tmpArray = new int[data.length-1];
		for (int i = 0; i<pos; i++)
			tmpArray[i] = data[i];
		for (int j = pos; j<tmpArray.length; j++)
			tmpArray[j] = data[j+1];
		data = tmpArray;
		numItems = numItems - 1;
		return removed;
	}

//Returns the number of items in the list
	public int size(){
		return numItems;
	}

//Returns the elements at position/index pos
	public int get(int pos){
		return data[pos];
	}

//Change the element at position pos to have value d
	public void set(int pos, int d){
		data[pos] = d;
	}

//ToString returns the array followed by the number of items
    public String toString() {
		String s = Arrays.toString(data)+" : "+numItems;
		return s;
    }

}