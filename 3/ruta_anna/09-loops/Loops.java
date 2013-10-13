import java.io.*;
import java.util.*;

public class Loops {

	private int factorial;
	private int divisor;
	private int remainder;


/* A recursive factorial method */
	public int fact(int n) {
		if (n > 1)
			factorial = n * fact(n-1);
		else
			factorial = 1;
		return factorial;
	}

/* A loop factorial method */
	public int fact2(int n) {
		factorial = 1;
		while (n >= 1){
			factorial = factorial * n;
			n = n-1;
			}
		return factorial;
	}

/* A greatest common divisor loop using brute force method */
 	public int gcd(int a, int b) {
		int c = Math.min(a,b);
		while (a%c!=0 || b%c!=0) {
			c = c -1;
			}
		return c;
	}

/* A greatest common divisor loop using euclids algorithm */
	public int gcd2(int a, int b) {
		int max = Math.max(a,b);
		int min = Math.min(a,b);
		while (min != 0) {
			remainder = max%min;
			max = Math.max(remainder, min);
			min = Math.min(remainder,min);
			}
		return max;
	}


/* A loop method to find if an integer is prime */
	public boolean isPrime(int n) {
		divisor = 2;
		while (n > divisor)
			if (n%divisor == 0)
				return false;
			else
				divisor = divisor + 1;
		return true;
	}
}
