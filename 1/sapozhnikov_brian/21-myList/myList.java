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
    
    public void insert(int pos, int d){
	if (pos == numItems)
	    add(d);
	else if(pos < numItems){
	    if (numItems>=data.length) {
		System.out.println("Growing");
		int[] tmpArray = new int[data.length+(data.length/2)];
		for (int i=0;i<data.length;i++) 
		    tmpArray[i]=data[i];
		data = tmpArray;
	    }
	    for(int i = numItems-1; i>=pos; i--){
		data[i+1] = data[i];
	    }
	    data[pos] = d;
	    numItems=numItems+1;
	}
	else{
	    //if pos > numItems, add 0's to the list to fill the spaces and then add d to the end of that list
	    //note: this will add 0's to the list (and increase numItems) until pos is in range to be inserted
	    for(int n = numItems; n<pos; n++)
		add(0);
	    add(d);
	}
    }

    public String toString() {
	String s =Arrays.toString(data)+" --- " +numItems;
	return s;
    }
}
