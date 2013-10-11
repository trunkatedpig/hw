import java.io.*;
import java.util.*;

public class TempLoops {
    public static int gcd(int a, int b) {
	int c;
	if (a > b) {
	    c = b;
	}
	else {
	    c = a;
	}

	while (a % c != 0 || b % c != 0) {
	    c = c - 1;
	}
	return c;
    }
    
    public static int gcd2(int a, int b) {
	//int gcd;
	int r = 0;
	if (b == 0) {
	    return a;
	}
	else {
	    while (a%b!=0) {
		r=a%b;
		a=b;
		b=r;
	    }
	    return r;
	}
    }

    public static boolean isPrime(int n) {
	int e = n/2;
	while (n%e != 0) {
	    e = e - 1;
	}
	if (e == 1) return true;
	else return false;
    }

}