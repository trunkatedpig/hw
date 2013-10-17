import java.io.*;
import java.util.*;
public class Loops{

    public int fact(int n){
    if (n == 1){
	return n;
    } else {
	return (n * fact((n-1)));
    }
    }

    public int fact2(int n){
	int result = n;
	while (n > 1){
	    result = result * (n - 1);
	    n--;
	}
	return result;
    }

    public int fact3(int n){
	int result;
	for (result = n; result > 1;result --){
	    n = n * (result-1);
	}
	return n;
    }

    public long gcd (long a, long b){
	long L,G,X;
	long result = 0; 	

	if (a > b){
	    X = b;
	    L = b;
	    G = a;
	}else { 
	    X = a;
	    L = a;
	    G = b;
	}

	if (G%L == 0)
	    return L;

	while ((G%L != 0)||(X%L != 0)){
	    result = L - 1;
	    L = L - 1; 
	}
	return result;
    }


    public long gcd2(long a, long b){
	long L,G;
	long R = 0;
	if (a > b){
	    L = b;
	    G = a;
	}else {
	    L = a;
	    G = b;
	}

	if (G%L == 0)
	    return L;

	while (G%L != 0){
	    R = G%L;
	    G = L;
	    L = R;
	    if (L == 0)
		L = L + 1;
	}
	return R;
    }
    public boolean isPrime(long n){
	if (gcd2(n,2) == 1){
	    return true;
	} else {
	    return false;
	}
    }
}
