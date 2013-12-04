import java.io.*;
import java.util.*;

public class Loops {
    private int total, GCD;

    public int fact (int n) {
	if (n <= 1) {
	    return 1;
	}
	else {
	    return n * fact(n - 1);
	}
    }
    public int fact2 (int n) {
	total = 1; //resets total everytime this is called
	while (n >= 1) {
	    total = total * n;
	    n = n - 1;
	}
	return total;
    }

    public int GCD(int a, int b) {
	int smaller, count;
	GCD = 1;
	if (a > b) {
	    smaller = b;
	}
	else{
	    smaller = a;
	}
	count = smaller;
	while (count != GCD) {
	    if (a % count == 0 && b % count == 0){
		GCD = count;
	    }
	    else count = count - 1;
	}
	return GCD;
    }
    public int GCD2(int a, int b) {
	int r, larger, smaller;
	GCD = 1;
	if (b > a) {
	    larger = b;
	    smaller = a;
	}
	else {
	    larger = a;
	    smaller = b;
	}
	while (GCD != larger){
	    if (smaller == 0) {
		GCD = larger;
	    }
	    else {
		r = larger % smaller;
		larger = smaller;
		smaller = r;
	    }
	}
	return GCD;
    }
    public boolean isPrime(int n){
    	boolean prime;
    	int currentvalue;
    	prime = true;
    	currentvalue = n - 1;
    	while (prime && currentvalue != 1) {
	    if (GCD2(n, currentvalue) != 1) {
		prime = false;
	    }
	    else {
		currentvalue = currentvalue - 1;
	    }
    	}
    	return prime;
    }
}