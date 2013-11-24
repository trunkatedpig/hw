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


}









