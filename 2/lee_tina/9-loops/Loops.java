import java.io.*; 
import java.util.*;

public class Loops {
    int result = 1;
    public int fact(int n) {
	if (n >= 1) {
		result = result * n;
		return fact(n - 1);
	    }
	else
	    return result;
    }

    public int fact2(int n) {
	while (n >= 1) {
		result = result * n;
		n = n - 1;
	    }
	return result;
    }
    //Kelly Chen and Tina Lee
    public int gcd(int a, int b) {
	int c;
	if (a == b) {
	    return a;
	}
	else if (a > b) {
	    c = b;
	    while (((a % c) != 0) || ((b % c) != 0)) {
		c = c - 1;
	    }
	    return c;
	}
	else {
	    c = a;
	    while (((a % c) != 0) && ((b % c) != 0)) {
		c = c - 1;
	    }
	    return c;
	}
    }
    
    public int gcd2(int a, int b) {
	int r;
	int c;
	if ((b == 0) || (a == 0)){
	    return a + b;
	}
	else if (a > b) {
	    r = a % b;
	    c = b;
	    while (((r % c) != 0) || ((b % c) != 0)) {
		c = c - 1;
	    }
	    return c;
	
	}
	else {
	    r = b % a;
	    c = a;
	    while (((r % c) != 0) || ((a % c) != 0)) {
		c = c - 1;
	    }
	    return c;
	}		    
    }
    public boolean isPrime(int n) {
	int temp = n - 1;
	int storage = n;
	if (n >= 2) {
	    while (storage % temp != 0) {
		temp = temp - 1;
	    }
	    if (temp == 1) {
		return true;
	    }
	    else
		return false;
	}
	else
	    return false;
    }	
}

	
