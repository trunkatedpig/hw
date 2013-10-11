import java.io.*;
import java.util.*;

public class Loops {
    private int result;
    
    //first way to do factorials
    public int fact(int n) {
	if (n <= 0) {
	    return 1;
	}
	else {
	    return n * fact(n-1);
	}
    }

    //second way to do factorials
    public int fact2(int n) {
	result = 1;
	while (n > 1) {
	    result = result * n;
	    n = n - 1;
	}
	return result;
    }

    //first way to do GCD
    public int gcd(int a, int b) {
   	if (a > b) {
    	    while (b > 0) {
		if ((a % b) == 0) {
    		    return b;
    		}
    		else {
    		    b = b - 1;
    		}
    	    }
    	}
        else {
    	    gcd(b,a);
	    return b;
	}
    }

    //second way to do GCD
    public int gcd2(int a, int b) {
	if (b == 0) {
	    return a;
	}
	else 
	    return gcd(b,(a%b));
    }

    //checking for prime numbers
    public boolean isPrime(int n) {
	int j = 2;
	while (j < n) {
	    if (n % j == 0) {
		return false;
	    }
	    else {
		j = j + 1;
	    }
	}
	return true;
    }
}

