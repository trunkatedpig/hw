import java.io.*;
import java.util.*;


public class Loops {
    
    public int fact(int n) {
	int answer;
	if (n == 0)
	    answer = 1;
	else
	    answer = n * (n - 1);
	return answer;
    }

    public int fact2(int n) {
	int answer = 1;
	while (n > 0) {
	    answer = answer * n;
	    n = n - 1;
	}
	return answer;
    }
    
     public int GCD(int a, int b) {
	if (a<b) {
	    while (a > 0) {
		if ((b % a) == 0) {
		    return a;
		}
		else
		    a = a - 1;
	    }
	}
	else
	    return GCD(b,a);
    }

     public int GCD2(int a, int b) {
	if (b == 0) {
	    return a;
	}
	else
	    //recursion:
	    //return GCD2(b, (a % b));
	    //while loop:
	    //helped by andrew and spencer for this part
	    while ((a != 0) && (b != 0)) {
		if (a < b) {
		    b = b % a;
	       	}
		else
		    a = a % b;
	    }
	return Math.max(a, b);
		
    }
    
    public boolean isPrime(int n) {
	if (n == 1) {
	    return false;
	}
	int a = 2;
	boolean b = true;
	while (a < Math.sqrt(n)) {
	    if ((n % a) == 0) {
		b = false;
	    }
	    else
		a = a + 1;
	}
	return b;
    }
	    
}
