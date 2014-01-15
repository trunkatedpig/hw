import java.io.*;
import java.util.*;


public class Sorts{
    double[] Data;
    public Sorts(){
	Data = new double[15];
	// Fill the array with stuff
	for (int i = 0; i < Data.length; i++)
	    Data[i]= ((Math.random()* Math.random())*100);
	//now that it's filled do stuff!!
    }
   
    public void radixSort () {
        ArrayList[] buckets = new ArrayList[10];
        
        for (int i = 0; i < 10; i++) {
            buckets [i] = new ArrayList();
        }


        int [] a = new int [4];


        Random r = new Random();
        
        for (int i = 0; i < 4; i++) {
            a[i]= r.nextInt(9999);
        }


        int n = 0;


        for (int i = 0;i < a.length; i++) {
            buckets[(a[i]/10^n)% 10].add(a[i]);
        }
    }
   
    public void bubbleSort (double[] dataSet){
	double holder;
	int numSwaps;
	boolean notSorted;
	
	notSorted = true;
	//	System.out.println(Arrays.toString(dataSet));
		
	while (notSorted){
	    numSwaps = 0;
	    for (int i = 0; i < dataSet.length-1; i++){
		if (dataSet[i]>dataSet[i+1]){
		    holder = dataSet[i+1];
		    dataSet[i+1] = dataSet[i];
		    dataSet[i] = holder;
		    numSwaps++;
		}
	    }
	    if (numSwaps == 0)
		notSorted = false;
	    
	}
	//	System.out.println("--------------------------------------------------------------");
	//	System.out.println(Arrays.toString(dataSet));
	
    }

    public void selectionSort(double[] dataSet){
	double holder;
	int slot;
	
	System.out.println(Arrays.toString(dataSet));
	
	for (int i = 0; i < dataSet.length; i++){
	    holder = dataSet[i];
	    slot = i;
	    for (int j = i; j < dataSet.length; j++){
		if (dataSet[j] < holder){
		    holder = dataSet[j];
		    slot = j;
		}
	    } 
	    dataSet[slot]=dataSet[i];
	    dataSet[i]=holder;
	}
	
	System.out.println("--------------------------------------------------------------");
	System.out.println(Arrays.toString(dataSet));
	
    }
    
}

