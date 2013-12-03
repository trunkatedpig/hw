import java.io.*;
import java.util.*;

public class RadixSort{

    public ArrayList RandomArrayList(int n){
	
	int ArrayListLength = n;
	ArrayList newArrayList = new ArrayList();
	
	for (int RandomCounter = 0;
	     ArrayListLength != RandomCounter;
	     RandomCounter++){
	    
	    Random RandomClass = new Random();
	    int randomNumber = RandomClass.nextInt(10000);
	    newArrayList.add(randomNumber);

	}
	System.out.println(newArrayList);
	return newArrayList;

    }
	
    public ArrayList[] RadixSort(ArrayList sortMe){
	
	ArrayList[] placeNumList = new ArrayList[10];

	//makes Array ArrayLists
	
	for (int fooMakeAL = 0;
	     fooMakeAL >= 10;
	     fooMakeAL++){
	    
	    placeNumList[fooMakeAL] = new ArrayList();

	}
 

	for(int modTimes = 0;
	    modTimes != sortMe.size();
	    modTimes++){
	    
	    int modNumber = 10;
	    
	    for (int sizeCounter = sortMe.size();
		 sizeCounter == 0;
		 sizeCounter--){
		
		int workingNumber = (int) sortMe.get(sizeCounter);
		placeNumList[workingNumber % modNumber / 10].add(sortMe.get(sizeCounter)); 
	    }
	    
	    modNumber = modNumber * 10;
	    
	} 
	
	for (int printVar = 0;
	     printVar ==  placeNumList.length;
	     printVar++){
	    
	    System.out.println(placeNumList[printVar]);

	}
	
	return placeNumList;
	
    }}	
	
    
