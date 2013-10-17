import java.io.*;
import java.util.*;

public class GCD{
    //worked with Deanna 
    //helped by Brian
    public int GCD(int a, int b){
        int answer = a;
	
	while  (answer > 0){
	    if (b%answer == 0 && a%answer == 0 ){
		//answer = a;
		return answer;
	    }
	    else {
		answer = answer-1;
	    }
	}
	return answer;
	
	
    
    }

    public int  GCD2(int a, int b){
	//int answer = a;
	while (a > 0){
	    if (b == 0){
		
		return a;
	    }
	    else {
		int t= a; 
		a = b;
		b = t%b;
		//answer = answer - 1;
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

		
		    
		    
