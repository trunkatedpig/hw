import java.io.*;
import java.util.*;

public class gcd2{
    
    public int GCD2(int parameter1, int parameter2){
	
	int intGreater = 0;
	int intSmaller = 0;
	int intBuffer = 0;
	    
	
	if (parameter1 > parameter2){
	    
	    intGreater = parameter1;
	    intSmaller = parameter2;
	}
	else {
	    
	    intGreater = parameter2;
	    intSmaller = parameter1;
	    
	}
	
	while (intGreater != intSmaller) {

	    intBuffer = intGreater - intSmaller;
	    
	    if (intBuffer > intSmaller){
		
		intGreater = intBuffer;
		intSmaller = intSmaller;
	    }
	    else {
		
		intGreater = intSmaller;
		intSmaller = intBuffer;
	    }
	    
	    return intSmaller;


	}
	return intSmaller; }
}
