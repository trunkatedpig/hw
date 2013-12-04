import java.io.*;
import java.util.*;

public class Driver {

    public static void main (String[] args) {

	Loops l = new Loops();
	System.out.println("Recursion version: ");
	System.out.println(l.fact(0));
	System.out.println(l.fact(1));
	System.out.println(l.fact(5));
	System.out.println("\nWhile loop: ");
	System.out.println(l.fact2(0));
	System.out.println(l.fact2(1));
	System.out.println(l.fact2(5));
	System.out.println("------");
	System.out.println(l.gcd(12,8));
	System.out.println(l.gcd2(12,8));
	System.out.println(l.gcd(0,13));
	System.out.println(l.gcd2(0,13));
	System.out.println(l.gcd(96,64));
	System.out.println(l.gcd2(96,64));
	System.out.println(l.gcd(122,78));
	System.out.println(l.gcd2(122,78));
	// time test with huge primes
	System.out.println(l.gcd(104729,104723));
	System.out.println(l.gcd2(104729,104723));
	// extremely fast results for the above
	System.out.println(l.isPrime(104729));
	System.out.println(l.isPrime(625));
	System.out.println(l.isPrime(438523));
	System.out.println(l.isPrimeFor(625));
	System.out.println(l.isPrimeFor(7));
    }
}
