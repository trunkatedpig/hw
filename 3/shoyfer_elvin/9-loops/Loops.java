import java.io.*;
import java.util.*;

public class Loops {
	// default constructor

	// the factorial function is defined for all non-negative integers
	// n! = n*(n-1)*(n-2) ... *2*1
	// n! = n*[(n-1)!]
	// 0! = 1

	// if the functions receive an invalid input, -1 will be returned

	// Recursive definition

	public int fact(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}

	// Non-recursive definition

	public int fact2(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0) {
			return 1;
		} else {
			int product = 1;
			while (n > 0) {
				product = product * n;
				n = n - 1;
			}
			return product;
		}
	}

	public int gcd(int a, int b) {
		int c = 1;
		if (a > b) {
			c = b;
		} else {
		    c = a;
		}
		while (c > 0) {
			if ((a % c == 0) && (b % c == 0)) {
				return c;
			} else {
				c = c - 1;
			}
		}
		return c;
	}


	public int gcd2(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			int r = a % b;
			return gcd2(b, r);
		}
	}

	public boolean isPrime(int n) {
		int i = 2;
		while (i < n) {
			if (n % i == 0) {
				return false;
			} else {
				i = i + 1;
			}
		}
		return true;

	}
}