import java.io.*;
import java.util.*;

public class Loops {


	public int fact (int n) {

		if (n > 1) {
			return n * fact (n-1);
		}

		else 
			return 1;	
	}

	public int fact2 (int n) {

		int result = 1;
		while (n > 1) {
			result = result * n;
			n = n - 1;
		}


		return result;	
	}

	public int gcd (int a, int b) {

	int c = Math.min (a, b);
	if (a % c == 0 && b % c == 0) 
		return c;
	else
		return gcd (a, c-1);
	}

	public int gcd2 (int a, int b) {

		if (b == 0) 
			return a;
		else {
			return gcd2 (b, a % b);
		}
	}

	public boolean isPrime (int n) { //Tests if n is divisible by odd numbers between sqrt(n) and n/2, inclusive.

		int min = (int)(Math.ceil (Math.sqrt (n)));
		int max = n / 2;
		if (max == 1)
			return true;
		if (n % min == 0 || n % max == 0)
			return false;
		else {
			if (min % 2 == 0) {
				min += 1;
				}
			while (min < max) {
				if (n % min == 0)
					return false;
				min += 2;
			}
			return true;
		}
	}

}
