import java.util.*;
import java.io.*;

public class radixSort{

    //Instance Vars
    private int[] L; //Makes int array 'L'
    
    //Constructors
    public radixSort(int n){  //will fill int array 'L' with 'n' random numbers
        
	Random r = new Random();
        double s;

        L = new int[n];
        for (int i=0;i<n;i++){
            s = r.nextDouble() * 1000;
            L[i]=(int)(s);
        }
    }

    //Methods

    ///THE RADIX SORT!

    public void radixSort(){
	for (int x = 0; x < 3; x++){ 
                
	    ArrayList[] buckets = new ArrayList[10]; //Creates a 10 place array called buckets to hold the bucket arrays
	    for (int i = 0; i < 10; i++)
		buckets[i] = new ArrayList(); //Places a new array list in each of the bucket spaces
                
	    for(int i = 0; i < buckets.length; i++){
		int j = (buckets[i] / (Integer)( Math.pow(10, x)))%10; //checks the last number that needs to be checked,
		buckets[j].add(buckets[i]); //puts the data in it's respective bukcket'
	    }

	    int counter = 0; 

	    for (int i=0; i<10; i++ ) { //loops through the bucket to fix ordering
		for (int y = 0; y < buckets[i].size(); y++){
		    buckets[counter]=(buckets[i].get(y)); //This line is driving me absolutly crazy.
		    counter++;
		}
	    }
	}
    }

    //The beloved toString method.
    public String toString(){
        String s = Arrays.toString(L);
        return s;   
    }

}
