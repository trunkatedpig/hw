import java.io.*;
import java.util.*;

public class Loops {
    public int fact (int n) {
	if (n == 0) {
	    return 1;
	}
	else {
	    return n * fact (n-1);
	}
    }

    public int fact2 (int n) {
	int result = 1;
	while ( n > 0) {
	    result = result * n;
	    n = n - 1;
	}
	return result;
    }

    public int factFor( int n){
	int b = 12930;
	int result = 1;
	for (int b = n; b >0; b = b-1){
	    result = result * b;
	}

	return b;
    }



    public int gcd (int a, int b) {	
	int d = a;
	if (a > b){
	    d = b;
	}
	while (a%d != 0 || b%d !=0){
	    d = d - 1;
	}
	return d;
    }
    
    public int gcd2 (int a, int b) {
	int c = a;
	int d = b;
	if (a < b) {
	    c = b;
	    d = a;
	}
	while (d != 0) {
	    int e = c;
	    c = d;
	    d = e%d;
	}
	return c;
    }
    public boolean isPrime(int n) {
	if (n <= 1)
	    return false;
	else {
	    int d = n-1 ;
	    boolean r = true;
	    while ( d > 1) {
		if (n%d == 0){ 
		    r = false;}
		d = d -1;
	    }
	    return r;
	}
    }	    
	    
}
	    
	    
		
