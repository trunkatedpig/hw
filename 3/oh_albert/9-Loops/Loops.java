import java.io.*;
import java.util.*;

public class Loops {

    public int fact (int n) {
	int p;
	if (n > 1) {
	    p = n * fact(n-1);
	} else {
	    return 1; }
	return p; }
    
    public int fact2 (int n) {
	int r = 1;
	while (n > 1) {
	    r = r * n;
	    n = n - 1; }
	return r; }


    public int gcd (int a,int b) {
	int r = 1;
	int ans;
	if (a >= b) {
		r = b;
	    } else {
		r = a; }
	while (r > 0) {
	    if (a%r == 0 && b%r == 0) {
		ans = r;
		return ans;
	    } else {
		r = r - 1; } }
	return r; }

    public int gcd2 (int a,int b) {
	if (a == 0) {
	    return a;
	} else if (b == 0) {
	    return b;
	} else {
	    return gcd2(a,a%b); }
    }

    public boolean isPrime(int n) {
	double upperBound = n/2;
	int counter = 2;
	while (counter <= upperBound) {
	    if (n%counter == 0) {
		return false; }
	    counter ++; }
	return true;
    }
}
