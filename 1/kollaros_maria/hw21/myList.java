import java.io.*;
import java.util.*;

public class myList{
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
    
    public String toString() {
        String s =Arrays.toString(data)+" --- " +numItems;
        return s;
    }

    

    public void insert(int pos, int d){
	if (numItems == data.length) {
            System.out.println("Growing");
            int[] tmpArray = new int[data.length + 1];
            for (int i=0;i<data.length;i++) 
                tmpArray[i]=data[i];
            data = tmpArray;
        }
	int[] next = new int[data.length];
	for(int i = 0; i < pos; i ++){
	    next[i] = data[i];
	}
	next[pos] = d;
	for(int i = (pos + 1); i < next.length; i ++){
	    next[i] = data[i - 1];
	}
	data = next;
	numItems = numItems + 1;
    }
}

	
