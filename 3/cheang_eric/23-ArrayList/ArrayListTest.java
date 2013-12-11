import java.util.*;
import java.io.*;

public class ArrayListTest{
    
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
	
	int numberTimes = 100000;
	
	ArrayList<Integer> ListAdd = new ArrayList<Integer>();

	long tick = System.currentTimeMillis();
	
	for (int countUpInt = 0;
	     countUpInt < numberTimes;
	     countUpInt++){
	     
	ListAdd.add(5);
	
	}
	
	long tock = System.currentTimeMillis();
	System.out.println(" \n ListAdd \n \n" +( tock - tick) );
	
	
	ArrayList<Integer> ListAdd2 = new ArrayList<Integer>();
	
	long ding = System.currentTimeMillis();
	
	for (int countUpInt = 0;
	     countUpInt < numberTimes;
	     countUpInt++){
	     
	    ListAdd2.add(0,5);
	
	}
       
	long dong = System.currentTimeMillis();
	System.out.println(" \n ListAdd2 \n \n" +(dong - ding) );

    } 
}
