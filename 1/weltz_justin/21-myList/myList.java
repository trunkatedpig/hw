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
	add(0);
	if (pos < data.length){
	    int gone = data[pos];
	    data[pos] = d;
	    
	    for (int i = pos + 1; i < data.length; i++){
		int gone1 = data[i];
		data[i]= gone;
		gone = gone1;
	    }
	}
	else { System.out.println("Wrong input");}
    }
		
    
    public String toString() {
	String s =Arrays.toString(data)+" --- " +numItems;
	return s;
    }
}
