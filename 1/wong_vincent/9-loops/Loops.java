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
	int n = 0;
   	if (a > b) {
	    while ((a % b) != 0) {
    		    b = b - 1;
    		}
            n = b;
    	    }
        else {
    	    while ((b % a) != 0) {
		    a = a - 1;
	        }
	    n = a;
    }
	return n;
}

	//GCD using for loop
	public int gcdloop(int a, int b) {
	if (a < b) {
	   gcdloop (b,a);
	}	
	else {
	   for (int n=b; (a % b) != 0; b = b - 1) {
		n = 4;
		}
	}
	return b;
}



    //second way to do GCD
    public int gcd2(int a, int b) {
	int n = 0;
	int A = a;
	int B = b;

	while (a%b != 0) {
	    b = (a%b);
	    a = B;
	}
	if (a%b == 0) {
	    n = b;
	}
	
	return n;
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

