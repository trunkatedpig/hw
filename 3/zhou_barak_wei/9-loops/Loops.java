import java.io.*;
import java.util.*;

public class Loops {
	
	public static int fact(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		else {
			return (n * (fact(n-1)));
		}
	}
	
	public static int fact2(int n) {
		int result = 1;
		if (n == 0) {
			result = 1;
		}
		else {
			while (n > 0) {
				result = result * n;
				n = n - 1;
			}
		}
		return result;
	}
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