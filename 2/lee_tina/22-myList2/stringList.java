import java.io.*;
import java.util.*;

public class stringList {
    private String[] data;
    private int numItems;
    
    public stringList() {
	data = new String[5];
	numItems=0;
    }

    public boolean isFull() {
	return numItems >= data.length;
    }

    public void grow() {
	    // "grow" the array by creating a new one and copying over
	    String[] tmpArray = new String[data.length+data.length/2];
	    for (int i=0;i<data.length;i++) 
		tmpArray[i]=data[i];
	    data = tmpArray;
    }

    public void add(String d) {
	if (isFull()){
	    grow();
	}
        data[numItems]=d;
        numItems = numItems + 1;
    }
    
    public String toString() {
	String s = Arrays.toString(data)+" : "+numItems;
	return s;
    }

    public void add(int pos, String d){
	if (isFull() || pos > data.length)
	    grow();
        
	int b = 0;
	String[] result = new String[data.length+1];
	for (int a=0; a < data.length;a++){
	    if (b==pos){
		result[b]=d;
		b++;
	    }
            
	    result[b]=data[a];
	    b++;
	}
	data=result;
        
        numItems = numItems+1;        
    }	
    
    public void remove(int pos){
	boolean removed = false;
	for (int ind = pos; ind < data.length - 1; ind++){
	    data[ind] = data[ind + 1];
	    removed = true;
	}
	if (removed == true)
	    numItems = numItems - 1;
    }

    public int size(){
	return numItems;
    }

    public String get(int pos){
	if (pos > numItems)
	    return "-1";
	else
	    return data[pos];
    }
    
    public String set(int pos, String d){
	if (pos > numItems)
	    return "-1";
	else{
	    String change = data[pos];
	    data[pos] = d;
	    return change;
	}
    }

    public String find(String d){
	for (int ind = 0; ind < numItems; ind++){
	    if (data[ind].equals(d))
		return d;
	}
	return "-1";
    }

    public void fremove(String d){
	int ind;
	for (ind = 0; ind < numItems; ind++){
	    if (data[ind].equals(d)){
		remove(ind);
		break;
	    }
	}
    }
}
