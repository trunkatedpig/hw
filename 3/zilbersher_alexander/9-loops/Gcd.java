import java.io.*;
import java.util.*;

public class Gcd{

    // % = mod

    public int gcd(int a, int b){
	int d = 0;
	if (a>b){
	    d=b;
	} else {
	    d=a;
	}
	while ((a%d != 0 || b%d != 0) && d>1){
	    d = d-1;
	}
	return d;
    }

    public int gcd2(int a, int b){
	int r = 0;
	if (b==0){
	    return a;
	} else {
	    while (a%b != 0) {
		r = a%b;
		a = b;
		b = r;
	    }
	    return r;
	}
    }

    public boolean isPrime(int n){
	int d = n/2;
	while (n%d != 0) { 
	    d = d - 1;
	}
	if (d == 1) {
	    return true;
	} else {
	    return false;
	}
    }
}
