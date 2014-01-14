import java.io.*;
import java.util.*;


public class Driver {
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
            buckets[(a[i]/10^n)% 10].set(a[i]);
        }
    }
    
    public void bubbleSort (){
	double holder;
	int numSwaps;
	boolean notSorted;
	double[] Data = new double[15];
	// Fill the array with stuff
	for (int i = 0; i < Data.length; i++)
	    Data[i]= ((math.random()* math.random())*100);
	//now that filled do stuff!!
	
	for (int i = 0; i < Data.length-1; i++){
	    numSwaps = 0;
	    if (Data[i]>Data[i+1]){
		//finish later
	    }
	}

    }
	
}

