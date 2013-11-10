import java.io.*;
import java.util.*;
import java.math.*;

public class LoopStuff {
    
    public int fact(int n) {
	if (n < 0) {
	    return 0;}
	else {
	    if (n > 0) {
		return n * fact(n-1);}
	    else {
		return 1;}
	}
    }

    public int fact2(int n) {
	int returnint = 1;
	
	if (n < 0) {
	    return 0;}
	else {
	    if (n == 0) {
		return 1;}
	    else {
		while (n > 0) {
		    returnint = returnint * n;
		    n = n - 1;}
		return returnint;}
	}
    }

    public int gcd(int a, int b) {
	int c = Math.min(a,b);
	while (!((a%c == 0) && (b%c == 0))) {c = c-1;}
	return c;
    }
    
    public int gcd2(int a, int b) {
	if (b > a) {
	    return gcd2(b,a);}
	else {
	    if (b == 0) {
		return a;}
	    else {
		return gcd2(b,a%b);}
	}
    }
    
    public boolean isPrime(int a) {
	int b = a-1;
	while (a%b != 0) {b = b-1;}
	return (b == 1);
    }
}
	    
