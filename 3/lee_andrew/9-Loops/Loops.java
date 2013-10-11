import java.io.*;
import java.util.*;

public class Loops {
    public int fact(int n) {
	if (n == 1) {
	    return n;
	}
	else {
	    return n * fact(n-1);
	}
    }

    public int fact2(int n) {
	int ans = 1;
	while (n > 0) {
	    ans = ans * n;
	    n = n - 1;
	    }
	return ans;
	    }

    public int gcd(int a, int b) {
	int c = Math.min(a,b);
	while (c > 0) {
	    if (a%c==0 && b%c ==0) {
		return c;
	    }
	    else {
		c = c - 1;
		    }
	}
	return c;
    }
    
    public int gcd2(int a, int b) {
        int c = Math.min(a,b);
	int d = Math.max(a,b);
	int ans = 0;
	if (c == 0) {
	    ans = ans + d;
	    return ans;
	}
	else {
	    return gcd2(c, d%c);
	}
    }

    public boolean isPrime(int n) {
        int f = n - 1;
	if (gcd(n,f) == 1){
	    return true;}
	else {
	    return false;}
    }
}