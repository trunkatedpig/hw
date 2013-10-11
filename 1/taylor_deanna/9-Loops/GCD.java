import java.io.*;
import java.util.*;

public class GCD{
    
    public int GCD(int a, int b){
        int answer;
        while  (a > 0){
	    if (b%a == 0){
		a = a;
	    }
	    else {
		a = a-1;
	    }
	}
    return a;
    }

    public int  GCD2(int a, int b){
	while (a > 0){
	    if (b == 0){
		a = a;
	    }
	    else {
		a = b;
		b = a%b;
	    }
	}
	return a;
    }

    private String answer;

    public boolean Prime( int a){
	int b = a-1;
	while (b > 1){
	    if (a%b == 0){
	        return false;
	    }
	    else { b = b - 1;
	    }
	}
	return true;
    }
}
 
      

/*if (b == 1){
		return true;
	    }
	    else*/

		
		    
		    
