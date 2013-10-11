import java.io.*;
import java.util.*;

public class Loops {

    private int answer;
    private int ld;

    public int fact(int n) {
	answer = 1;
	if (n == 1) {
	    return answer;
	} else {
	    answer = n * fact(n-1);
	}
	return answer;
    }
    
    public int fact2(int n) {
	answer = 1;
	while (n != 1) {
	    answer = answer * n;
	    n = n - 1;
	}
	return answer;
    }


    public int gcd(int a, int b) {
	if (a > b)  
	    answer = b;
	else
	    answer = a;
	while (a%answer != 0 || b%answer != 0) {
	    answer = answer - 1;
	}
	return answer;
    }
    
    public int gcd2(int a, int b) {
	int max = Math.max(a,b);
	int min = Math.min(a,b);
	if (min == 0) {
	     answer = max;
	} else {
	    gcd2(min, max%min);
	} 
	return answer;
    }

    public boolean IsPrime(int n) {
        Divisor(n,2);
	return (ld == n);
    }

    public int Divisor(int n, int t) {
	if ((t*t) > n) {
	    ld = n;
	} else if (n%t == 0) {
	    ld = t;
	} else {
	    Divisor(n, t+1);
	}
	return ld;
    }
	    
	    
    
	       
}

	    
