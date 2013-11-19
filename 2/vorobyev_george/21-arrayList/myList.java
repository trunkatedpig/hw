import java.io.*;
import java.util.*;

public class myList {
    private int[] data;
    private int numItems;
    
    public myList() {
	data = new int[5];
	numItems=0;
    }

    public void add(int d) {
	
	if (numItems>=data.length) {
	    System.out.println("Growing from "+data.length+" to "+data.length*1.5);
	    // "grow" the array by creating a new one and copying over
	    int[] tmpArray = new int[data.length+data.length/2];
	    for (int i=0;i<data.length;i++) 
		tmpArray[i]=data[i];
	    data = tmpArray;
	}
        data[numItems]=d;
        numItems = numItems + 1;
    }

    public void insert(int pos, int d)
    {
        if(pos >= numItems)
	{System.out.println("ERROR INVALID ARRAYLIST INDEX");return;}

	if(numItems + 1 >= data.length)
	{	
	    int[] temp = new int[data.length + data.length / 2];
	    for(int i = 0; i < pos; i++)
	    {
		temp[i] = data[i];
	    }
	    temp[pos] = d;
	    for(int i = pos; i < numItems; i++)
	    {
		temp[i + 1] = data[i];
	    }
	    data = temp;
	    numItems++;
	}
	
	else
	{
	    for(int i = numItems; i > pos;i--)
	    {
	        data[i] = data[i - 1]; 
	    }
	    data[pos] = d;
	    numItems++;
	}
    }

    public int remove(int pos)
    {
	int temp = data[pos];
	for(int i = pos; i < numItems - 1; i++)
	{
	    data[i] = data[i + 1];
	}
	numItems--;
	return temp;
    }

    public int get(int pos)
    {return data[pos];}

    public void set(int pos, int d)
    {data[pos] = d;}

    public int size()
    {return numItems;}

    
    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }
	
}
