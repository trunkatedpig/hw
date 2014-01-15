import java.io.*;
import java.util.*;

public class Radix{
    private int[] data;
    private int dig;
    private int numCond=0;
    private int numSwap=0;
    public Radix(int len, int digi){
	data = new int[len];
	dig = digi;
	double r1;
	for (int i = 0; i<data.length;i++){
	    r1 =(double) Math.random();
	    data[i]=(int)(r1*Math.pow(10,dig));
	}
    }
    public String toString(){
	return Arrays.toString(data);
    }
    public void sort(){
	int thedigit = 0;
	int index = 0;
	ArrayList[] bucket = new ArrayList[10];
	for (int i = 0; i <10; i++)
	    bucket[i] = new ArrayList();;
	for (int digit = 0; digit < dig ; digit++){
	    for (int i = 0; i < data.length; i++){
		thedigit = (int)((data[i]/Math.pow(10,digit))%10);
		bucket[thedigit].add(data[i]);
	    }
	    index = 0;
	    for (int deep = 0; deep < 10; deep++){
		for (int verydeep=0; verydeep < bucket[deep].size();verydeep++){
		    data[index] =(Integer) bucket[deep].get(verydeep);
		    index++;
		}
	    }
	    for (int i = 0 ; i < 10; i++)
		bucket[i].clear();
	}
    }
    public int[] getData(){
	return data;
    }
    public int[] bSort(int[] i){
	int newPos1;
	int newPos2;
	for (int j = 0; j < i.length-1; j++){
	    for(int k = 0; k < i.length-1; k++){
		numCond++;
		if (i[k]>i[k+1]){
		    newPos1=i[k];
		    newPos2=i[k+1];
		    i[k]=newPos2;
		    i[k+1]=newPos1;
		    numSwap=numSwap+1;
		}
	    }
	}
	return i;
    }
    public int[] optBSort(int[] i){
	int currentSwap=0;
	int currentCond = i.length-1;
	int newPos1;
	int newPos2;
	for (int j = 0; j < i.length-1; j++){
	    for(int k = 0; k < currentCond; k++){
		numCond++;
		if (i[k]>i[k+1]){

		    newPos1=i[k];
		    newPos2=i[k+1];
		    i[k]=newPos2;
		    i[k+1]=newPos1;
		    numSwap=numSwap+1;
		    currentSwap=currentSwap+1;
		}
	    }
	    if (currentSwap == 0)
		return i;
	    currentSwap=0;
	    currentCond=currentCond-1;
	}
	return i;
    }
}

