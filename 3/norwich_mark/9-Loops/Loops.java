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

    public int gcd(int a, int b) {
       	int c;
	if (b > a)
	      	c = a;
       	else
	       	c = b;
       	while (c > 1) {
	       	if (b % c ==0 && a % c == 0)
		       	return c;
		 else
				c = c - 1;
		}
		return c;
	}

    public boolean isPrime(int a) {
	int r = a -1;
	while (r > 1){
	    if (a % r == 0)
		return false;
	    else 
		r = r - 1;
	}
	return true;
    }
    
    public int gcd2(int a, int b) {
		int r;
		r = 1;
		while (r > 0) {
		r = a % b;
		a = b;
		b = r;
		}
		return a;
	}
    ///still having trouble understanind this one^^
}

