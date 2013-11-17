import java.io.*;
import java.util.*;

public class Loops {

    public int fact(int n) {
	if (n==0) {
	    return 1;
	}
	else {
	    return n * fact(n-1);
	}
	
    }

    public int fact2(int n) {
	int result = 1;
	while (n>=1) {
	    result = result * n;
	    n = n - 1;
	}
	return result;
    }

    public int GCD(int A, int B) {
	int l,s;
	if (A < B){
	    l = B;
	    s = A;
	}
	else{
	    l = A;
	    s = B;
	}
	int x = s;
	while (l%x != 0 || s%x != 0)
	    x = x - 1;
	return x;x
    }

    public int GCD2(int A, int B) {
	int l,s;
	if (A < B){
	    l = B;
	    s = A;
	}
	else{
	    l = A;
	    s = B;
	}
	while (l%s > 0){
	    int x = l%s;
	    l = s;
	    s = x;
	}
	return s;
    }

    public boolean isPrime(int n) {
	int x = 1;
	boolean b = false;
	while (x<=n) {
	    if (x==n) {
		b=true;
		return b;
	    }
	    else if (n%x == 0 && x!=1) {
	        b=false;
		return b;
	    }
	    else {
		x = x + 1;
	    }
	}
	return b;
    }
}
