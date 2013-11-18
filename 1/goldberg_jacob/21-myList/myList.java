import java.io.*;
import java.util.*;

public class myList {
    private int[] a;
    private int numItems;
    
    public myList()
    {
        a = new int[10];
        numItems=0;
    }

    public void add (int pos, int d){
	int[] b = new int[a.length + 1];
	for (int i = 0; i < pos; i++){
	    b[i] = a[i];
	}
	b[pos] = d;
	for (int x = pos + 1;  x < b.length; x++){
	    b[x] = a[x-1];
	}
	a = b;
    }

    public void add(int d) {

        if (numItems>=a.length) {
            System.out.println("Growing");
            int[] tmpArray = new int[a.length+(a.length/2)];
            for (int i=0;i<a.length;i++) 
                tmpArray[i]=a[i];
            a = tmpArray;
        }

        
        // then add
        a[numItems]=d;
        numItems=numItems+1;
    }

    public String toString() {
        String s = Arrays.toString(a)+" --- " +numItems;
        return s;
    }

}
