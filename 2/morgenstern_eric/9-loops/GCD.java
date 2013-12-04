//worked with Matthew Cook

import java.io.*;
import java.util.*;

public class GCD {
    
    public int GCD(int a, int b) {
	int n;
	if (a<b) {
	    n=a;
	    while (n!=0) {
		if (b%n==0 && a%n==0) {
		    return n;
		}
		else {
		    n=n-1;
		}
	    }
	    return 1;
	}
	else{
	    n=b;
	    while (n!=0) {
		if (b%n==0 && a%n==0) {
		    return n;
		}
		else {
		    n=n-1;
		}
	    }
	    return 1;
	}
    }
    public int GCD2(int a, int b){
	if (b==0){
	    return a;
	}
	
	else if (a==0) {
	    return b;
	}
	else {
	    while (a!=b) {
	    if (a>b){
	        a=a-b;
	    }
	    else {b=b-a;}
	    }
	}
	return a;
    } /* there is no obvious speed difference between the two gcd functions */
    
    public boolean isPrime(int n){
        int q=2;
	while (q<n){
	    if (n%q == 0) {
		return false;
	    }
	    else {
		q=q+1;
	    }
	}
	return true;
    }
	    

}


