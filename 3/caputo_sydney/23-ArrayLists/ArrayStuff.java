import java.util.*;
import java.io.*;

public class ArrayStuff{
	ArrayList<Integer> a=new ArrayList<Integer>();
	
    public String firstadd(int size){
	double start= System.currentTimeMillis();
	int i=0;
	while (i<size){
	    a.add(8);
	    i++;
	}
	double end = System.currentTimeMillis();
	String s="Time for a.add(x): " + (end-start);
	return s;
    }
    public String secondadd (int size, int num){
	long start= System.currentTimeMillis();
	int i =0;
	while(i<size){
	    a.add(i,num);
	    i++;
	}
	long end= System.currentTimeMillis();
	String s= "Time for a.add(0,x): " + (end-start);
	return s;
    }

    public String removeFront (){
	double start=System.currentTimeMillis();
	while (a.size()> 0){
	    a.remove(0);
	}
	double end =System.currentTimeMillis();
	String s= "Time for removeFront: " + (end-start);
	return s;
    }
    
    public String removeEnd (){
	double start=System.currentTimeMillis();
	for(int x=a.size()-1;x>=0;x--){
	    a.remove(x);
	}
	double end =System.currentTimeMillis();
	String s= "Time for removeEnd: "+ (end-start);
	return s;
    }

     public void reverse() { 
	ArrayList temp = (ArrayList)a.clone();
	for (int j = 0;j<a.size();j++) {
	    temp.set(j,a.get((a.size()-j)-1));
	}
	a.clear();
	a.addAll(temp); 
	
}









