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

    public void retList () {
        for (int i = 0; i < data.length; i++) {


            System.out.print ( data [i] + ",");
        }
        System.out.println ("---- " + numItems);
    }

    
    /*  public String toString() {
        String s = Arrays.toString(data)+" --- " +numItems;
        return s;
    }
    */
    //for some reason this cause an error in my program, so I commented it out.
	
    public void add(int pos, int d) {
	int [] data2 = new int [data.length + 1];
        if (pos > data2.length) {
            data2 = new int [data2.length + pos  + data2.length];
        }
        data2 [pos] = d;
        for (int i = 0; i < data.length; i ++){
            if (pos > i ) {
                data2 [i] = data [i];
            }
            if (pos < i ) {
                data2 [i + 1] = data [i];
            }
        }
        
        data = data2;
        numItems = numItems + 1;
        System.out.println ("We have inserted " + d  + " at index " + pos);
    }

    // to be completed by you
    // inserts the value d at location (index) pos)
    // recall the algorithm we developed in class:
    // 1. Grow if needed
    // 2. shift everything past the insertion point down
    // 3. add the new item
    // 4. numitems++
	

    public void remove(int pos) {
	for (int i = pos; i < data.length - 1; i ++) {
	    data [i] = data [i + 1];
	}
	data [data.length - 1] = 0;
	numItems--;
    }

    public int size() {
	return numItems;
    }
    public int get(int pos) {
	if (pos < data.length) {
	    return data [pos];
	}
	return -1;
    }
    public void set(int pos, int d) {
	if (pos < data.length){
	    data [pos] = d;
	}
    }

   public int find(int d){
        for (int i=0;i<data.length;i++) {
            if (data[i]==d){
                return data[i];
            }
        }
        return -1;
    }


    public void fremove(int d){
        for (int i=0;i<data.length;i++) {
            if (data[i]==d){
                remove (i);
                i=data.length;
            }
            else if (i==data.length - 1){
                System.out.println("The number " + d + " is not in the array.");
            }
        }
    }

}
