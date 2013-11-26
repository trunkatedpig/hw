import java.util.*;
import java.io.*;

public class ArrayListTestRemove{
    
    /*
      
      testing: 100
      
      LA: 1
      LA2: 0

      testing: 10000
      
      LA: 5
      LA2: 56
      
      testing: 100000
      
      LA: 19
      LA2: 2556
      
    */

    public static void main(String[] args){
	
	int numberTimes = 10000;
	
	ArrayList<Integer> ListAdd = new ArrayList<Integer>();
	
	for (int countUpInt = 0;
	     countUpInt < numberTimes;
	     countUpInt++){
	     
	ListAdd.add(5);
	
	}
	
	long tick = System.currentTimeMillis();
		
	for (int countDownInt = numberTimes;
	     countDownInt == 0;
	     countDownInt--){
	    
	    ListAdd.remove((Integer)5);
	    
	}
	
	long tock = System.currentTimeMillis();
	
	System.out.println("\n\n remove() Time =" + (tock - tick) + "\n\n");

    }}
