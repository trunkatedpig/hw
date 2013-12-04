import java.io.*;
import java.util.*;

public class  myListStrings{
    String[] data =new String[10];
    int numItems=0;
    
    public void add(String d) {

	if (numItems>=data.length) {
	    System.out.println("Growing");
	    String[] tmpArray = new String[data.length+(data.length/2)];
	    for (int i=0;i<data.length;i++) 
		tmpArray[i]=data[i];
	    data = tmpArray;
	}
	
	// then add
	data[numItems]=d;
	numItems=numItems+1;
    }

    public void insert(int pos, String d){
	if (numItems == data.length){
	    String[] tempArray = new String[data.length + 1];
	    for (int i=0; i<pos; i++){
		tempArray[i] = data[i];
	    }
	    tempArray[pos] = d;
	    for (int j = pos; j<data.length; j++){
		tempArray[j+1] = data[j];
	    }
	    data = tempArray;
	    numItems = numItems+1;
	}
	else {
	    data[pos] = d;
	    for (int i=numItems+1; i>pos; i--){
		data[i] = data[i-1];
	    }
	}
    }
	
public String remove (int pos){
	String output=data[pos];
	for (int i=pos; i<data.length-1;i++){
	    data[i]=data[i+1];
	}
	data[data.length-1]="null";
	numItems=numItems-1;
	return output;
    }

    public String get(int i){
	String dat = data[i];
	return dat;
    }
    
    public void set(int i, String d){
	data[i]= d;
    }

    public int size(){
	return numItems;
    }

    public String find(String d){
	for (int i=0; i<numItems; i++){
	    if (data[i].equals(d)){
		return d;
	    }
	}
	return "not found";
    }
    
    public void fremove(String d){
	boolean t = true;
	int i = 0;
	while ( i<data.length && t){
	    if (data[i].equals(d)){
		remove(i);
		t = false;
	    }
	    i = i + 1;
	    }	
    }
    
    public String toString() {
	String s =Arrays.toString(data)+" --- " +numItems;
	return s;
    }
}
