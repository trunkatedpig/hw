import java.util.*;
import java.io.*;

public class Loops {
    public int fact2 (int n) {
	int currentNum = 1;
	while (n > 0) {
	    currentNum = currentNum * n;
	    n = n - 1;
	}
	return currentNum;
    }

    public int fact (int n) {
	if (n == 1 || n == 0) {
	    return 1;
	}
	else {
	    return n * fact(n - 1);
        }	
    }
    
    public int gcd(int a, int b) {
	int bigNum;
	int lilNum;
	if (a > b) {
	    bigNum = a;
	    lilNum = b;
	}
	else {
	    bigNum = b;
	    lilNum = a;
	}
	int i = lilNum;
	while ((lilNum % i) != 0 || (bigNum % i) != 0) {
		    i = i - 1;
	}
	return i;		
    }
    public int gcd2 (int a, int b) {
	while (b != 0) {
	    int r = a % b;
	    return gcd2 (b, r);
	}
	return a;
    }
    public boolean isPrime(int n) {
	int i = n - 1;
	while (i > 1) {
	    if ((n % i) == 0) {
		return false;
	    }
	    else {
		i = i - 1;
	    }
	}
	return true;
    }
}


