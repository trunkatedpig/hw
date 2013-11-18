import java.io.*;
import java.util.*;

public class myList{
    private int[] data;
    private int numItems;
    
    public myList() {
        data = new int[5];
        numItems=0;
    }

  
    public String toString() {
        String s = Arrays.toString(data)+" : "+numItems;
        return s;
    }
    public void insert(int pos, int d){
	int i;
	int[] tmpArray=new int[data.length+1];
	for (i=0;i<pos;i++){
	    tmpArray[i]=data[i];
	}
	tmpArray[pos]=d;
	for (i=pos+1;i<tmpArray.length;i++){
	    tmpArray[i]=data[i-1];
	}
	data=tmpArray;
	System.out.println(data);
    }
}
