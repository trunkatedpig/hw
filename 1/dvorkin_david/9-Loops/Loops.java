import java.io.*;
import java.util.*;

public class Loops {
   
    private int n;

    private int x;
 
    public int fact (int n){
       
	if (n == 1)
	    return n;
	else {
	    return n * fact (n-1);		
	}
}

    public int fact2 (int n){
	int x = 1;
	while (n > 1){
	    x = x * n;
	    n=n-1;
	}
	return x;
   }
}
