import java.io.*;
import java.util.*;

public class Loops {

	public int fact (int n) {

		return fact (n, 1);
	}

	public int fact (int n, int result) {

		if (n > 1) {
			result = result * n;
			n = n - 1;
			return fact (n, result);
		}

		else 
			return result;	
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
			int a1 = Math.max (a, b) % Math.min (a, b);
			int b1 = Math.min (a, b);
			return gcd2 (a1, b1);
		}
	}

}
