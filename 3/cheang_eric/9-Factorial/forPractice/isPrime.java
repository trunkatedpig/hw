import java.io.*;
import java.util.*;

public class isPrime{
    

	int factorCheck = 0;
	int factorCounter = 0;


    public boolean isPrime(int number){
	
	factorCheck = number;
	factorCounter = 0;
	    
	
	while (factorCounter != 0 || factorCounter > 2){
		
		if (number % factorCheck == 0){
		    
		    factorCounter = factorCounter + 1;
		    factorCheck = factorCheck - 1;
		}
		
		else {
		    factorCheck = factorCheck - 1;
		}}
	
	if (factorCheck <= 2) {
	    return true ;
	}
	else {
	    return false;
		}}}
	
	
		       
