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

    public void insert(int pos, int d){
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


}

