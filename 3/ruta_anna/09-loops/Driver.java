import java.io.*;
import java.util.*;

public class Driver {
	public static void main(String[] args) {

		System.out.println();
		System.out.println("*-* Testing class Loops *-*");
		System.out.println();

		Loops l;
		l = new Loops();

		System.out.println("Using recursive factorial method");
		System.out.println("Factorial of 10: " + l.fact(10));
		System.out.println("Factorial of 5: " + l.fact(5));
		System.out.println("Factorial of 1: " + l.fact(1));
		System.out.println();

		System.out.println("Using loop factorial method");
		System.out.println("Factorial of 12: " + l.fact2(12));
		System.out.println("Factorial of 4: " + l.fact2(4));
		System.out.println("Factorial of 1: " + l.fact2(1));
		System.out.println();

		System.out.println("Using brute force greatest common divisor loop method");
		System.out.println("GCD of 12 and 8: " + l.gcd(12,8));
		System.out.println("GCD of 25 and 75: " + l.gcd(25,75));
		System.out.println("GCD of 14 and 14: " + l.gcd(14,14));
		System.out.println("GCD of 3 and 17: " + l.gcd(3,17));
		System.out.println();

		System.out.println("Using euclid's algorithm greatest common divisor loop method");
		System.out.println("GCD of 100 and 25: " + l.gcd2(100,25));
		System.out.println("GCD of 6 and 33: " + l.gcd2(6,33));
		System.out.println("GCD of 12 and 12: " + l.gcd2(12,12));
		System.out.println("GCD of 5 and 19: " + l.gcd2(5,19));
		System.out.println();

		System.out.println("Using loop prime method");
		System.out.println("Is 6 prime? " + l.isPrime(6));
		System.out.println("Is 1213 prime? " + l.isPrime(1213));
		System.out.println("Is 125 prime? " + l.isPrime(125));
		System.out.println();

	}
}