import java.io.*;
import java.util.*;

public class Loops {

    public int fact(int n) {
	if (n == 1 || n == 0) {
	    return 1;
	}
	else {
	    return n * fact(n-1);
	}
    }

    public int fact2(int n) {
	int product = 1;
	while (n > 1) {
	    product = product * n;
	    n = n-1;
	}
	return product;
    }

    public int gcd(int a, int b) {
	int divisor;
	if (a==0) {
	    return b;
	}
	else if (b==0) {
	    return a;
	}
	else if (a == b) {
	    return a;
	}
	else if (a > b) {
	    divisor = b;
	}
	else {
	    divisor = a;
	}

	while (divisor >= 1) {
	    if (a%divisor == 0 && b%divisor == 0) {
		return divisor;
	    }
	    else {
		divisor = divisor - 1;
	    }
	}
	return divisor;
    }

    public int gcd2(int a, int b) {
	if (b == 0) {
		return a;
	    }
	else if (a == 0) {
		return b;
	    }
	else {
	    int r;
	    r = a%b;
 	    return gcd(a,r);
	}
    }

    public boolean isPrime(int n) {
	int divisor;
	divisor = n-1;
	while (divisor >= 1) {
	    if (n%divisor == 0) {
		return divisor == 1;
	    }
	    else {
		divisor = divisor - 1;
	    }
	}
	return (divisor == 1);
    }

}
