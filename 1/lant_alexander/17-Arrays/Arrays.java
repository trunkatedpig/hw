import java.util.*;
import java.io.*;

public class Arrays {
	
    /* methods:
     * ModThree
     * Sum13
     * MidWay
     * MakeEnds
     * FizzArray  
     * Only14
     * MakeRandom
     * RevFill
     */      
    
    public int[] FizzArray (int n){
	
	int[] intArray = new int[n];

	for(int i = 0; i < n; i ++) {
	    intArray[i] = i;
	    }
	
	return intArray;
    }

    public int[] Bang(){
    	int[] array = new int[6];
	for(int i = 0; i < 5; i ++){
	    array[i] = i;
	    //getarray(array[i]);
	}
	return array;

   }
   

    
    //Getarray method?
    //I keep on getting bizarre outputs...
    //like this >>>> [I@3343c8b3
    //WTFWTFWTF!?!?!!?!

}
