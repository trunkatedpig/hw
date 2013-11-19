import java.io.*;
import java.util.*;

public class ArraysTwo{
    
    public int[] RevFill(int n){
	
	int ArrayFiller = n;
	int[] returnArray = new int[n];
	
	for (int CountUp = 0;
	     CountUp != n;
	     CountUp++){
	    
	    returnArray[CountUp] = ArrayFiller;
	    ArrayFiller--;
	    
	}
       
	return returnArray;
	
	
    }}
	    
	    
