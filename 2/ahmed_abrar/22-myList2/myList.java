import java.io.*;
import java.util.*;

public class myList {
    private int[] data;
    private int numItems;
    
    public myList() {
        data = new int [5];
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
    
    public void insert ( int pos , int d ) {
        if ( isFull() )
            grow();
        for ( int i = data.length - 1 ; i > pos ; i-- )
            data [ i ] = data [ i - 1 ];
        data [ pos ] = d;
        numItems = numItems + 1;
    }


    public void remove ( int pos ) {
        for ( int i = pos ; i < data.length - 1 ; i++ )
            data [ i ] = data [ i + 1 ];
        numItems = numItems - 1;
    }


    public int size() {
        return numItems;
    }


    public int get ( int pos ) {
        return data [ pos ];
    }


    public void set ( int pos , int d ) {
        data [ pos ] = d;
    }


    public String toString() {
        String s = Arrays.toString(data)+" : "+numItems;
        return s;
    }

    public int find ( int n ){
        for ( int i = 0 ; i < data.length ; i++ ) {
            if ( data [ i ] == n )
                return data [ i ];}
        return -1;
    }

    public void fremove ( int n ) {
	loop:
        for ( int i = 0 ; i < data.length ; i++ ) {
            if ( data [ i ] == n ) {
                remove ( i );
		break;
	    }
        }
    }
}
