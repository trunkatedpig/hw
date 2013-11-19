import java.io.*;
import java.util.*;

public class myList {
    private int[] data;
    private int numItems;
    
    public myList( int max) {
        data = new int[5];
        numItems=0;
    }

    public void insert(int pos, int d) {
	int temp[]=new int[data.length+1];
	for (int x=0;x<pos; x++){
	    templ[x]=data[x];}
	for(int c=pos; c<temp.length;c++){
	    if (c==pos){
		temp[c]=d;}
	    else{
		
		templ[c]=data[c-1];}

	}
	data=temp;
	return "Array now has "+ d + "at position "+ pos+ "/n"+data;}

    
    public void remove(int pos) {
	for(int x=pos;i<numsItems;i++){
	    data[i]=data[i+1];
	    numItems=numItems-1;
	}  }

    public String toString(){
	return Arrays.toString(data);

}

}
        