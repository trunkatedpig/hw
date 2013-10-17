import java.io.*;
import java.util.*;

public class gcd1{
   
    
    public int GCD1(int int1, int int2){
	
	int greaterInt = 0;
	int smallerInt = 0;
	int gcfModuloVariable = 0;
		    
	
	boolean gcfInt1Check = false;
	boolean gcfInt2Check = false;
	boolean correctVariable = false;


	if (int1 > int2){
	    
	    greaterInt = int1;
	    smallerInt = int2;
	    gcfModuloVariable = smallerInt;
	
	}
	
	else {
	
	    greaterInt = int2;
	    smallerInt = int1;
	    gcfModuloVariable = smallerInt;

	}


	
	while (correctVariable == false){

	    
	    gcfInt1Check = (smallerInt % gcfModuloVariable == 0);
	    gcfInt2Check = (greaterInt % gcfModuloVariable == 0);

	    	    
	    if (gcfInt1Check == true && gcfInt2Check == true){
		
		correctVariable = true;
		
	    }

								     
	    
	    System.out.println(greaterInt);
	    System.out.println(smallerInt);
	    System.out.println(gcfModuloVariable);
	    System.out.println(gcfInt1Check);
	    System.out.println(gcfInt2Check);
	    System.out.println(correctVariable);
	    gcfModuloVariable = gcfModuloVariable - 1;


	}
	System.out.println("answer");

	return gcfModuloVariable + 1;
       
    }
}
	
	
	
    


	
	

    
