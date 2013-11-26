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

    public void insert(int pos, int d) { 
	int[] tempArray;
	if (pos<=data.length) { 
	    tempArray = new int[data.length+1];
	}
	else { 
	    tempArray = new int[pos+1];
	}
	tempArray[pos] = d;
	int i;
	if (pos<data.length) { 
	    for (i=0;i<pos;i++) { 
		tempArray[i] = data[i];
	    }
	    for (i=pos+1;i<tempArray.length;i++) { 
		tempArray[i] = data[i-1];
	    } 
	}
	else { 
	    for (i=0;i<data.length;i++) { 
		tempArray[i] = data[i];
	    }
	}
	data = tempArray;
    }

    public int remove(int i){
	int a = data[i];
	int[] tempArray = new int[data.length - 1];
	for (int x = 0; x < i; x++){
	    tempArray[x] = data[x];
	}
	for (int x = i; x < data.length; x++){
	    tempArray[x] = data[x+1];
	}
	data = tempArray;
	return a;

    }
}
