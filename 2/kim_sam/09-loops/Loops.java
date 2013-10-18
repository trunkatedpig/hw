import java.io.*;
import java.util.*;

public class Loops {

    private int outcome = 1 ;
    //need to set outcome to 1 because
    //otherwise, it is already set to 0

    //recursion
    public int fact(int n){
	if (n == 1) {
	    return 1;}
	return n * fact(n-1);
    }

    //while
    public int fact2(int n){
	while (n != 0) {
	    outcome = outcome * n;
	    n = n - 1;
	}
	return outcome;
    }
    
    public int gcd(int a, int b) {
	int greater, lesser, count;
	
	if (a > b) {
	    greater = a;
	    lesser = b;
	}
	else {
	    greater = b;
	    lesser = a;
	    }

    public int gcd2(int a, int b) {
	int remainder;

	while (b != 0) {
	    remainder = a%b;
	    return gcd2(b, remainder);
	}
	return a;
    }

    public boolean isPrime(int n) {
	int numBelow = n - 1;

	while (numBelow > 1){
	    if (n%numBelow == 0) {
		return false;
	    }
	    else {
		numBelow = numBelow - 1;
	    }
	}
	return true;
    }
    }
}
