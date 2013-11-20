import java.io.*;
import java.util.*;


public class myStringList {
    private String[] data;
    private int numItems;
    
    public myStringList() {
        data = new String[5];
        numItems=0;
    }


    public boolean isFull() {
        return numItems >= data.length;
    }

    public void grow() {
            String[] tmpArray = new String[data.length+data.length/2];
            for (int i=0;i<data.length;i++) 
                tmpArray[i]=data[i];
            data = tmpArray;
    }


    public void add(String d) {
        if (isFull()){
            grow();
        }
        data[numItems]=d;
        numItems = numItems + 1;
    }

    public void retStr () {
        for (int i = 0; i < data.length; i++) {
            System.out.print ( data [i] + ",");
        }
        System.out.println ("---- " + numItems);
    }

    /*    public String toString() {
        String s = Arrays.toString(data)+" : "+numItems;
        return s;
    }
    still don't understand why this causes an error in my program. */


    public void add (int pos, String d) {
        String [] data2 = new String [data.length + 1];
        if (pos > data2.length) {
            data2 = new String [data2.length + pos  + data2.length];
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

    
    public void remove(int pos) {
	for (int i = pos; i < data.length - 1; i ++) {
	    data [i] = data [i + 1];
	}
	data [data.length - 1] = "";
	numItems--;
    }




    public String get(int pos) {
	if (pos < data.length) {
	    return data[pos];
	}
	return "The data list does not contain that index";
    }


    public void set(int pos, String d) {
	if (pos < data.length) {
	    data[pos]=d;
	}
	else {
	    System.out.println ("Index is out of range.");
	}
       
    }

    public String size() {
        return "Data is length; " + data + "---- NumItems is " + numItems;
	
    }


    public String find(String d){
        for(int i=0; i < data.length; i++){
	    if (data [i] == null) {
	    }
            else if(data[i].equals(d))
                return d;
        }
        return "String not in data";
    }


    public void fremove(String d){
        for(int i=0;i<data.length;i++){
	    if (data [i] == null) {
	    }
	    else if(data[i].equals(d)){
                remove(i);
		i = data.length;
	    }
	    else if (i==data.length - 1){
                System.out.println("The String " + d + " is not in the array.");
	    }
    }


    }

        
}

