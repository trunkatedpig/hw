import java.io.*;
import java.util.*;

public class Loops{
     
    public int fact(int n){
	if(n == 0 || n == 1)
	   return 1;
	 else 
	   return n * fact(n-1);
    }
    public int fact2(int n){
	int x = 1;
	    while (n > 0) {
		x = x * n;
		n = n -1; 
	    }
	return x;
	    }
}
	    
	    
