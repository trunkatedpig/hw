import java.util.*;
import java.io.*;

public class MyList {

    private int[] data;
    private int numItems;

    public MyList(){
	data = new int[20];
	numItems = 0;
	data = {2,3,4,5,6,23,35,44,23,45,65,23,87,10,99};
	System.out.println;
    }

    public void insert(int pos, int d) {
	int[] temp = new int[data.length + 1];
	for (int i = data.length; i > pos; i --){
	    data[i] = data[i + 1];
	} 
	int[pos] = d;
	data = temp;
    }

    public int remove(int pos) {
	int[] temp = new int[data.length - 1];
	for (int i = 0; i<pos; i++){
	    temp[i] = data[i+1];
	}
	for (int i = pos +1; i <temp.length; i++)
	    temp[i]= data [i+1];
	if (data[pos] != 0)
	    numItems = numItems - 1;
	data = temp;
	// removes the data item at location pos from the array data
      // remember we have to shift down items.
       // return the removed data item.
    }
    
    public int find(int d){
	for (int i = 0; i < data.length; i++){
	    if (data[i] == d)
		return d;
	}
	return -1;
    }
    
    public void fremove(int d){
	for (int i = 0; i < data.length; i++){
	    if (data[i] == d){
		remove(i);
	    }
	}

    }

}
    
