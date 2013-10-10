import java.io.*;
import java.util.*;

public class Loops {
    public int fact(int n) {
	if (n > 0) {
	    return fact(n - 1) * n;
	} else {
	    return 1;}
    }
    public int fact2(int n) {
	int ans = 1;
	while (n > 0) {
	    ans = ans * n;
	    n = n - 1;}
	return ans;
    }


    //DAY 2
    public int gcd(int a,int b) {
	int c = Math. min(a,b);
	while (c > 0) {
		if (a % c == 0 && b % c == 0) {
		    return c;}
		c = c - 1;}
	return 1;
    }
    public int gcd2(int a,int b) {
	if (b == 0)
	    return a;
	int r1 = b;
	int r2 = a % b;
	int oldr2 = r2;
	while (r2 != 0) {
	    oldr2 = r2;
	    r2 = r1 % r2;
	    r1 = oldr2;}
	return r1;
    }
}