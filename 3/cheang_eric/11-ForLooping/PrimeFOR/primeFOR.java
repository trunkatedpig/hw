import java.io.*;
import java.util.*;

public class primeFOR{
    
    int factorCounter;
    
    public boolean isPrime(int number){
	
	factorCounter = 0;
	
	if (number == 2){
	    
	    return true;
	    

	}
	
	for (int primeChecker = number - 1;
	     primeChecker != 2 && factorCounter < 1; 
	     primeChecker = primeChecker - 1) {
	    
	    if (number % primeChecker == 0){
		
		factorCounter = factorCounter + 1;
		//		System.out.println(factorCounter);
		//		System.out.println(primeChecker);
	    } 
	    
	    //System.out.println(factorCounter);
	    // System.out.println(primeChecker);
	    
	}
	
	if (factorCounter == 0){
	    
	    return true;

	}

	else {
	    
	    return false;

	}
	
    
    }}
