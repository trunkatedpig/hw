import java.io.*;
import java.util.*; 

public class Loops {
    
    public static int fact (int n) {
	int i; 
	i = 1; 
	while (n > 0) {
	    i = i * n;
	    n = n -1;
	}
	return i; 
    }

    public static int GCD (int a, int b) {
	int r, i;
	i = b
	r = a % i;
	while (r != 0) {
	    while (b % i == 0) {
		i = i - 1;
	    }
	    r = a % i; 
	}
	return i; 
    }

    public static int GCD2 ( int a, int b) {
	int i;
	while (a % b != 0) {
	    i = a % b;
	    a = b;
	    b = i;
	}
	return i; 
    }

    public static int isPrime? (int n) {
	int i = n - 1;
	int x; 
	boolean r; 
	r = false
	while (r == false) {
	    x = n % i; 
	    if (x != 0) {
		i = i -1; 
	    }
	    else {
		r = true; 
	    }
	}
	return r; 
    }


}
