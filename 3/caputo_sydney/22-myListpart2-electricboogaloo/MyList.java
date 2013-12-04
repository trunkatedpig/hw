import java.io.*;
import java.util.*;

public class MyList {
    private int[] data;
    private int numItems;
    
 
 public MyList(int max) {
        data = new int[5];
	r= new Random();
	for (int i=0; i<data.length; i++){
	    data[i]=r.nextInt(max+1);
	}
        numItems=data.length;
    }
    }

    public void grow(){
	int[]tmpArray= new int[data.length+data.length/2];
	for(int i=0; i<data.length; i++){
	    tmpArray[i]=data[i];}
	data=tmpArray;
	}
   
    public void add(int d) {
	if (isFull()) {
	    grow();
	}
	for (int i = a.length-1; i > pos; i--) {
	    a[i] = a[i-1];
	}
	a[pos] = d;
	numItems = numItems + 1;
	}

	public int size() {
	    return a.length;
	}
	public int get(int pos) {
	    return a[pos];
	}
	public void set(int pos, int d) {
	    a[pos] = d;
	}
} 

    public void insert(int pos, int d) {
	int temp[]=new int[data.length+1];
	for (int x=0;x<pos; x++){
	    temp[x]=data[x];}
	for(int c=pos; c<temp.length;c++){
	    if (c==pos){
		temp[c]=d;}
	    else{
		
		temp[c]=data[c-1];}

	}
	data=temp;
	//return "Array now has "+ d + "at position "+ pos+ "/n"+data;}
    }
    
    public void remove(int pos) {
	int[]ans= new int[data.length-1];
	for(int x=0;x<pos;x++){
	    ans[x]=data[x];}
	for(int i =pos; i <ans.length; i++){
	    ans[i]=data[i+1];
	}
	data=ans;
	 numItems=numItems-1;
	} 

    public String toString(){
	String s= Arrays.toString(data)+" "+numItems;
	return s;
}
    public int size(){
	return numItems;
    }

    public int get(int pos){
	return data[pos];
    }
    public int set(int pos, int d){
	data[pos]=d;
	return d; //not sure what to return

}
}
        
