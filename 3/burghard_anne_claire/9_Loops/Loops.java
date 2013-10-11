import java.io.*;
import java.util.*;

public class Loops {

    public int fact(int n) {
	int answer;
        if (n > 1) {
	    answer = n * fact(n-1);
	}
	else {
	    answer = 1;
	}
	return answer;
    }

    public int fact2 (int n) {
	int countdown;
	int i;
	int answer;
	countdown = n;
	i = n;
	answer = 1;
	while (i > 0) {
	    answer = answer * countdown;
	    countdown = countdown - 1;
	    i = i - 1;
	}
	return answer;
    }

    public int gcd (int a, int b) {
	int i = 1;
	int answer = 1;
	if (a > b) {
	    i = b;
	    while (i > 0) {
		if ((a % i == 0) && (b % i == 0)) {
			answer = i;
			i = 0;
		    }
		else {
		    i = i - 1;
		}
	    }
	}
	else { gcd(b,a); }
	return answer;
    }
    
    public int gcd2 (int a, int b) {
	int r = 1;
	int gcd = 1;
	if (b == 0) {
	    gcd = a;
	    }
	else {
	    r = (a % b);
	    gcd = gcd2(b,r);
	}
	return gcd;
    }

    public boolean isPrime (int n) {
	int i = 2;
        while (i < n) {
	    if (n % i == 0) {
		return false;
	    }
	    else {
		i = i + 1;
	    }
	}
	return true;
    }
	    
	    
		
}




	
	
	    
	    
