import java.util.*;
import java.io. *;

public class Loops {

    public int fact (int n) {
	if (n == 0) {
	    return 1;
	}
	else {
	    return n * fact (n - 1);
	}
    }
	
    public int fact2 (int n) {
	int n2 = 1;
	while (n > 0){
	    n2 =  n2 * n ;
	    n = n - 1;
	}
	return n2;
    }
       

    
    public int GCD (int a,int b) {
	int c = 1 ;
	if (a == b) {
	    c = a;
		}
	else if (a > b){
	    c = b;
	     	   
	}
        else {
	    c = a;
		}

	while (b % c != 0 || a % c != 0) {	       
	    c = c - 1;
	       
		    }
    
	return c;
	    }

    public int GCD2 (int a , int b) {
	int r, a2, b2;
	a2 = a;
	b2 = b;
	    
	if (a < b) {
	    a2 = b;
	    b2 = a;
	}
	r = a2 % b2;
	while (r != 0) {
	    a2 = b2;
	    b2 = r;
	    r = a2 % b2;
	}

	return b2;
	
	    }

    public boolean isPrime (int n) {
	int t = n - 1;
	boolean s = true;
	while (t > 1) {
	    if (n % t == 0) {
		s = false;
	    }
	    t = t - 1;
	}
	return s;
    }
    
    
}
