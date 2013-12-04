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
	numItems = numItems+1;
	data = tempArray;
    }
    
    public void remove(int pos) { 
	int[] tempArray = new int[data.length-1];
	int i;
	for (i=0;i<pos;i++) { 
	    tempArray[i] = data[i];
	}
	for (i=pos+1;i<tempArray.length;i++) { 
	    tempArray[i] = data[i+1];
	}
	if (data[pos] != 0) 
	    numItems = numItems - 1;
	data = tempArray;
    }	
    
    public int size() { 
	return numItems;
    }

    public int get(int pos) { 
	return data[pos];
    }
    
    public void set(int pos, int d) { 
	data[pos] = d;
	if (d!=0) 
	    numItems++;
    }

    public int find(int d) { 
	for (int i=0;i<data.length;i++) { 
	    if (data[i]==d) 
		return i;
	}
	return -1;
    }
    
    public void fremove(int d) { 
	int pos = find(d);
	remove(pos);
    }
}

