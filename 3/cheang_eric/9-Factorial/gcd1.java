import java.io.*;
import java.util.*;

public class gcd1{
    
    
    public int GCD1(int int1, int int2){
	
	int greaterInt = 0;
	int smallerInt = 0;
	int gcf


	if (int1 > int2){
	    
	    int greaterInt = int1;
	    int smallerInt = int2;
	
	}
	
	else {
	
	int greaterInt = int2;
	int smallerInt = int1;

	}

	int gcfModuloVariable = smallerInt;
	
	while (gcfModuloVariable != 0 || 
	       gcfInt1Check == True && gcfInt2Check == True){
	    
	boolean gcfInt1Check = (smallerInt % gcfModuloVariable == 0);
	boolean gcfInt2Check = (largerInt % gcfModuloVariable == 0);
	
	gcfModuloVariable = gcfModuloVariable - 1;}
    
    return gcfModuloVariable;
    
    }
}
	
	
	
    


	
	

    
