import java.io.*;
import java.util.*;

public class Loops {
	// default constructor

	// the factorial function is defined for all non-negative integers
	// n! = n*(n-1)*(n-2) ... *2*1
	// n! = n*[(n-1)!]
	// 0! = 1

	// if the functions receive an invalid input, -1 will be returned

	// Recursive definition

	public int fact(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}

	// Non-recursive definition

	public int fact2(int n) {
		if (n < 0) {
			return -1;
		} else if (n == 0) {
			return 1;
		} else {
			int product = 1;
			while (n > 0) {
				product = product * n;
				n = n - 1;
			}
			return product;
		}
	}

}