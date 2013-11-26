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
    
    public String toString() {
        String s =Arrays.toString(data)+" --- " +numItems;
        return s;
    }

    public void insert (int pos, int d) {
	int[] placeholder = new int[data.length + 1];
        for(int i = 0; i < placeholder.length; i = i + 1) {
	    if (i < pos){
	        placeholder[i] = data[i];
	    }
	    else if (i > pos){
		placeholder[i] = data [i-1];
		    }
	    else if (i == pos){
		placeholder[i] = d;
        }
	    
    }
	numItems = numItems + 1;
	System.out.println (placeholder.length);
	    data=placeholder;

    }

    public void remove (int pos){
	int[] placeholder = new int[data.length-1];
	for (int i = 0; i < placeholder.length; i = i + 1){
	    if (i<pos) {
		placeholder[i] = data[i];
	    }
	
	    else {
		placeholder[i] = data[i+1];
	    }
	}
	numItems = numItems - 1;
    }
}
